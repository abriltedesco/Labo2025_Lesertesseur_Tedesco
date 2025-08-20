package exceptions;

public class Main_TryCatch {
    public static void main(String[] args) {
        try{
            String nombre = null;
            System.out.println("El largo del nombre es:" + nombre.length());

        }
        catch(NullPointerException excNull){
            System.err.println("Está null");
            excNull.printStackTrace();
        }
    }
}