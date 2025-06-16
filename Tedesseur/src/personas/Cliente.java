package personas;

public class Cliente extends Persona {
    private String celular;
    private String metodoPago;
    private String numTarjeta;

    public Cliente(){
        super("James", "Bond");
        this.celular = "1313131313";
        this.metodoPago = "efectivo";
        this.numTarjeta = "0000-0000-0000-0000";
    }

    public Cliente(String nombre, String apellido, String celular, String metodoPago,String numTarjeta){
        super(nombre, apellido);
        this.celular = celular;
        this.metodoPago = metodoPago;
        this.numTarjeta = numTarjeta;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public String getNumTarjeta() {
        return numTarjeta;
    }
    
    public void setNumTarjeta(String numTarjeta) {
        this.numTarjeta = numTarjeta;
    }
}
