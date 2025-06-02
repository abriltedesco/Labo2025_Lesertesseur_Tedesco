package alarmasEdificio;

public class SensorTemperatura extends DispositivoAlarma {
    public SensorTemperatura(){
        super();
    }
    public SensorTemperatura(boolean estaConectado, double medida, double umbralInicial, int anioAdquisicion){
        super(estaConectado, medida, umbralInicial, anioAdquisicion);
    }

    public void comoEstaLaTemperatura(){
        if(this.isEstaConectado()) {
            if(this.getMedida() > this.getUmbralInicial()){
                System.out.println("¡Cuidado! La temperatura sube");
            }
            else {
                System.out.println("Esta todo bien,, ok. ts ok im ok diria tate");
            }
        }
        else{
            System.out.println("Dispositivo esta desconectado");
        }
    }
}
