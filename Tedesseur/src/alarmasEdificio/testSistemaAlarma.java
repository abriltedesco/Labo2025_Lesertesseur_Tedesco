/* package alarmasEdificio;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class testSistemaAlarma {
    @Test
    void testTotalMedidas() {
        ArrayList<DispositivoAlarma> dispositivos = new ArrayList<>();
        dispositivos.add(new DispositivoAlarma(true, 4, 0, 2021));
        dispositivos.add(new DispositivoAlarma(true, 3, 0, 2021));
        dispositivos.add(new DispositivoAlarma(true, 2, 0, 2021));

        SistemaAlarmas sistema = new SistemaAlarmas(dispositivos, 10);

        assertEquals(9.0, sistema.totalMedidas(), 0.01);
    }

    @Test
    void testDetectorHumoEstaConectado() {
        DetectorHumo d = new DetectorHumo(true, 50, 40, 2020);
        assertTrue(d.isEstaConectado());
    }

    @Test
    void testSensorTemperaturaUmbral() {
        SensorTemperatura s = new SensorTemperatura(true, 30, 40, 2020);
        assertEquals(40, s.getUmbralInicial());
    }

    @Test
    void testSensorPresionMedida() {
        SensorPresion sp = new SensorPresion(true, 45, 35, 2019);
        assertTrue(sp.getMedida() > sp.getUmbralInicial());
    }

    @Test
    void testDispositivoAnio() {
        DispositivoAlarma d = new DispositivoAlarma(true, 10, 20, 2010);
        assertEquals(2010, d.getAnioAdquisicion());
    }
}
*/