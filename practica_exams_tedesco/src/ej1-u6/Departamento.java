import java.util.HashMap;

public class Departamento extends Vivienda{
    private int cantAmbientes;

    public Departamento(String direccion, String codPostal, Duenio duenio, HashMap<Mes, Integer> consumoElectricidad, int cantAmbientes) {
        super(direccion, codPostal, duenio, consumoElectricidad, 50);
        this.cantAmbientes = cantAmbientes;
    }

    public int getCantAmbientes() {
        return cantAmbientes;
    }

    public void setCantAmbientes(int cantAmbientes) {
        this.cantAmbientes = cantAmbientes;
    }
}
