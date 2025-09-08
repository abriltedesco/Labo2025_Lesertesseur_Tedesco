package dispositivos;

import elecciones.Mensajes;

public class TelefonoMovil extends DispositivoElecciones implements Mensajes {
    private Compania compania;
    private String numero;
    public double credito;

    public TelefonoMovil(String fabricante, String modelo, int numSerie, Compania compania, String numero, boolean prendido, double credito) {
        super(fabricante, modelo, numSerie, prendido);
        this.compania = compania;
        this.numero = numero;
        this.credito = credito;
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

    public boolean isPrendido() {
        return prendido;
    }

    public void setPrendido(boolean prendido) {
        this.prendido = prendido;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }


    public boolean hayCreditoDisponible(){
        return this.credito > 0;
    }

    @Override
    public void enviarMensaje() {
        if(hayCreditoDisponible() && this.isPrendido()){
            System.out.println("Conectando con la antena más cercana");
        }
    }
}
