package elecciones;

public class TelefonoMovil extends Dispositivo{
    private Compania compania;
    private String numero;

    public TelefonoMovil(String fabricante, String modelo, int numSerie, Compania compania, String numero) {
        super(fabricante, modelo, numSerie);
        this.compania = compania;
        this.numero = numero;
    }

    public Compania getCompania() {
        return compania;
    }

    public void setCompania(Compania compania) {
        this.compania = compania;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
