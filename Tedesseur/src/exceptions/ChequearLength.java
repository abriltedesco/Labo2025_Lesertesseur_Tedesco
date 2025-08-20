package exceptions;

public class ChequearLength {
    public void largoDelNombre(String nombre) throws StringNullException{
        if (nombre == null){
            throw new StringNullException("La cadena no tiene caracteres. ");
        }
        else{
            System.out.println("El largo del nombre es:" + nombre.length());
        }
    }
}
