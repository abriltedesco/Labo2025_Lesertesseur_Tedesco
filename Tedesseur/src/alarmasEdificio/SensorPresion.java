package alarmasEdificio;

public class SensorPresion extends DispositivoAlarma {
    public SensorPresion(){
        super();
    }
    public SensorPresion(boolean estaConectado, double medida, double umbralInicial, int anioAdquisicion){
        super(estaConectado, medida, umbralInicial, anioAdquisicion);
    }

    @Override
    void Alarma() {
        System.out.println("Sensor de presión activado");
    }
}
