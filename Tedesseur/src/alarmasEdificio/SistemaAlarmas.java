package alarmasEdificio;

import java.util.ArrayList;

public class SistemaAlarmas {
    private ArrayList<DispositivoAlarma> dispositivos;
    private double umbral;

    public SistemaAlarmas(ArrayList<DispositivoAlarma> dispositivos, double umbral) {
        this.dispositivos = dispositivos;
        this.umbral = umbral;
    }

    public SistemaAlarmas() {
        this.dispositivos = new ArrayList<>();
        this.umbral = 10;
    }

    public ArrayList<DispositivoAlarma> getDispositivos() {
        return dispositivos;
    }

    public void setDispositivos(ArrayList<DispositivoAlarma> dispositivos) {
        this.dispositivos = dispositivos;
    }

    public double getUmbral() {
        return umbral;
    }

    public void setUmbral(double umbral) {
        this.umbral = umbral;
    }

    public void mostrarDispositivos(){
        for(DispositivoAlarma disp : dispositivos){
            System.out.println(dispositivos.size());
            System.out.println(disp.getClass() + " " + disp.getMedida() + " " + disp.getAnioAdquisicion() + " " + disp.getUmbralInicial());
        }
    }

    public DispositivoAlarma elegirDispositivo(int numero) throws ArrayIndexOutOfBoundsException{
       DispositivoAlarma disp = null;
        for(int i = 0; i< dispositivos.size() ; i++ ){
            if(i == numero){
                disp = dispositivos.get(i);
            }
        }
        return disp;
    }

    public void chequearMedidas(){
        for(DispositivoAlarma disp : dispositivos){
            if(disp.isEstaConectado()) {
                if (disp.getMedida() > disp.getUmbralInicial()) {
                    disp.Alarma();
                } else {
                    System.out.println("Esta todo bien,, ok. its ok im ok diria tate");
                }
            }
            else{
                System.out.println("Dispositivo esta desconectado");
            }
        }
    }

    public double totalMedidas(){
        double total = 0;
        for(DispositivoAlarma dispositivo : this.dispositivos) {
            total += dispositivo.getMedida();
        }
        return total;
    }

    public void sensorCompuesto(){
        if((this.totalMedidas() / 3) > this.umbral){
            System.out.println("alarma disparada");
        }
        else{
            System.out.println("toodo okkkk");
        }
    }



}
