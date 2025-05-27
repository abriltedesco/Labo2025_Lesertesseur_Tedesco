package vehiculos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testVehiculos {

    private Coche coche;
    private Camioneta camioneta;
    private Bicicleta bicicleta;

    @BeforeEach
    public void setUp() {
        coche = new Coche("Porsche", "Cayman", "Rosa", 37.4, "AD912DA", true);
        camioneta = new Camioneta("Toyota", "Hilux", "Gris", "AD444DA", 150, 15);
        bicicleta = new Bicicleta("Trek", "Marlin", "Rojo", 2, 2022);
    }

    @Test
    public void testCocheAtributos() {
        assertEquals("Porsche", coche.getMarca());
        assertEquals("Cayman", coche.getModelo());
        assertEquals(37.4, coche.getVelocidad());
        assertEquals("Rosa", coche.getColor());
    }

    @Test
    public void testCamionetaAtributos() {
        assertEquals("Toyota", camioneta.getMarca());
        assertEquals("Hilux", camioneta.getModelo());
        assertEquals(150, camioneta.getCapacidadCargaTotal());
        assertEquals("Gris", camioneta.getColor());
    }

    public void testBicicletaAtributos() {
        assertEquals("Trek", bicicleta.getMarca());
        assertEquals("Marlin", bicicleta.getModelo());
        assertEquals(2, bicicleta.getCantRuedas());
        assertEquals("Rojo", bicicleta.getColor());
    }

    public void testAniadirCargaCamionetaDentroLimite() {
        camioneta.aniadirCarga(10);
        assertEquals(25, camioneta.getCapacidadCargaActual(), 0.01);
    }

    @Test
    public void testAniadirCargaCamionetaSuperaLimite() {
        camioneta.aniadirCarga(200);
        assertEquals(15, camioneta.getCapacidadCargaActual(), 0.01);
    }

    @Test
    public void testCocheAcelerar() {
        double velocidadInicial = coche.getVelocidad();
        double retornada = coche.acelerar();

        assertEquals(velocidadInicial, retornada, 0.01);
        assertEquals(velocidadInicial + 1, coche.getVelocidad(), 0.01);

    }
}
