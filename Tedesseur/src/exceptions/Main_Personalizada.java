package exceptions;

public class Main_Personalizada {
    public static void main(String[] args) {
        try{
            ChequearLength c = new ChequearLength();
            String nombre = null;
            c.largoDelNombre(nombre);
        }
        catch(StringNullException exc){
            exc.printStackTrace();
            exc.getMessage();
        }
    }
}
