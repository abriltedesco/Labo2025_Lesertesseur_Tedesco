package dispositivos;

public class Impresora extends Salida{
    private int puertos;
    private String metodoImpresion;

    public Impresora(int puertos, String metodoImpresion) {
        super();
        this.puertos = puertos;
        this.metodoImpresion = metodoImpresion;
    }

    public int getPuertos() {
        return puertos;
    }

    public void setPuertos(int puertos) {
        this.puertos = puertos;
    }

    public String getMetodoImpresion() {
        return metodoImpresion;
    }

    public void setMetodoImpresion(String metodoImpresion) {
        this.metodoImpresion = metodoImpresion;
    }
}
