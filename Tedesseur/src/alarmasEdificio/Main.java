package alarmasEdificio;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        DetectorHumo d1 = new DetectorHumo(true, 45, 40, 2021);
        SensorPresion sp1 = new SensorPresion(true, 30, 35, 2005);
        SensorTemperatura st1 = new SensorTemperatura(true, 30, 35, 2004);

        DetectorHumo d2 = new DetectorHumo(false, 5, 12, 1999);
        SensorPresion sp2 = new SensorPresion(true, 30, 35, 2015);
        SensorTemperatura st2 = new SensorTemperatura(true, 30, 35, 2021);

        ArrayList<DispositivoAlarma> disp1 = new ArrayList<>();
        disp1.add(d1);
        disp1.add(sp1);
        disp1.add(st1);
        disp1.add(d2);
        disp1.add(sp2);
        disp1.add(st2);

        SistemaAlarmas sistema = new SistemaAlarmas(disp1, 0);
        sistema.chequearMedidas();

        sistema.elegirDispositivo(1);
    }
}
