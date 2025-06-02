package alarmasEdificio;

public class SensorPresion extends DispositivoAlarma {
    public SensorPresion(){
        super();
    }
    public SensorPresion(boolean estaConectado, double medida, double umbralInicial, int anioAdquisicion){
        super(estaConectado, medida, umbralInicial, anioAdquisicion);
    }

    public void estaActivadoOno(){
        if(this.isEstaConectado()) {
            if (this.getMedida() > this.getUmbralInicial()) {
                System.out.println("Sensor de presion activado");
            } else {
                System.out.println("Esta todo bien,, ok. ts ok im ok diria tate");
            }
        }
        else{
            System.out.println("Dispositivo esta desconectado");
        }
    }
}
