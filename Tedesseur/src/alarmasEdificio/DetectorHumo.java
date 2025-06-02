package alarmasEdificio;

public class DetectorHumo extends DispositivoAlarma {
    public DetectorHumo(){
        super();
    }
    public DetectorHumo(boolean estaConectado, double medida, double umbralInicial, int anioAdquisicion){
        super(estaConectado, medida, umbralInicial, anioAdquisicion);
    }

    public void llamarBomberos(){
        if(this.isEstaConectado()) {
            if (this.getMedida() > this.getUmbralInicial()) {
                System.out.println("Llamada a bomberosssssssssssssssssssssssssss");
            } else {
                System.out.println("Esta todo bien,, ok");
            }
        }
        else{
            System.out.println("Dispositivo esta desconectado");
        }
    }

}
