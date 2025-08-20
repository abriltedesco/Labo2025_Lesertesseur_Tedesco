package exceptions;

public class Main_Throws extends Throwable {
    public static String devolverNombre() throws Exception{
        String nombre = null;
        System.out.println("El largo del nombre es:" + nombre.length());
        return nombre;
    }

    public static void main(String[] args) {
        try{
            devolverNombre();
        }
        catch(Exception exc){
            System.out.println("el nombre es nulo  " + exc );
        }
    }
}
