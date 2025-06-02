package alarmasEdificio;

public class SensorTemperatura extends DispositivoAlarma {
    public SensorTemperatura(){
        super();
    }
    public SensorTemperatura(boolean estaConectado, double medida, double umbralInicial, int anioAdquisicion){
        super(estaConectado, medida, umbralInicial, anioAdquisicion);
    }

    public void alarma(){
        System.out.println("¡Cuidado! La temperatura sube");
    }
}
