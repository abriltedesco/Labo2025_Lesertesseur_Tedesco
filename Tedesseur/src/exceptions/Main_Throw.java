package exceptions;

public class Main_Throw {
    public static void main(String[] args) {
        try {
            String nombre = null;
            System.out.println("El largo del nombre es:" + nombre.length());
            if(nombre == null){
                throw new NullPointerException("El nombre es nulo.");
            }
        }
        catch (NullPointerException exc){
            System.err.println(exc);
            System.err.println(exc.getMessage());
        }
    }
}
