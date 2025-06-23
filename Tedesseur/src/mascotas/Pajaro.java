package mascotas;

public class Pajaro extends Mascota{
    private boolean esCantor;

    public void saludo(){
       if(this.esCantor){
           System.out.println("piopiopiopiooo");
       }
       else {
           System.out.println("pio");
       }
    }

    public void alimentar(){

    }
}
