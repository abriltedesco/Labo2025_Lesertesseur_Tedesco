package telefonica;

public class Telefono {
    private String numero;

    public Telefono(String numero) {
        this.numero = numero;
    }

    public Telefono() {
        this.numero = "47973754";
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
