package alarmasEdificio;

public class DetectorHumo extends DispositivoAlarma {
    public DetectorHumo(){
        super();
    }
    public DetectorHumo(boolean estaConectado, double medida, double umbralInicial, int anioAdquisicion){
        super(estaConectado, medida, umbralInicial, anioAdquisicion);
    }

    public void alarma(){
        System.out.println("Llamada a bomberosssssssssssssssssssssssssss");
    }
}
