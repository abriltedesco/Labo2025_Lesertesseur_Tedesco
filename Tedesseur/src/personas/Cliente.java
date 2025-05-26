package personas;

public class Cliente extends Persona {
    private String celular;
    private String metodoPago;

    public Cliente(){
        super("James", "Bond");
        this.celular = "1313131313";
        this.metodoPago = "efectivo";
    }

    public Cliente(String nombre, String apellido, String celular, String metodoPago){
        super(nombre, apellido);
        this.celular = celular;
        this.metodoPago = metodoPago;
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
}
