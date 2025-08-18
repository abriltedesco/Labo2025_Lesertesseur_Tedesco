package exceptions;

public class Main_Throw {
    public static void main(String[] args) {
        try {
            String nombre = null;
            System.out.println("El largo del nombre es:" + nombre.length());
            if(nombre == null){
                throw new excepcionNull("El nombre es nulo.");
            }
        }
        catch (excepcionNull){
        }