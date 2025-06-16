package dispositivos.impresora;

import dispositivos.Salida;

public class Impresora extends Salida {
    private int puertos;
    private MetodoImpresion metodoImpresion;

    public Impresora(int puertos, MetodoImpresion metodoImpresion) {
        super();
        this.puertos = puertos;
        this.metodoImpresion = metodoImpresion;
    }

    public Impresora(String fabricante, String modelo, double precio, int stock, int puertos, MetodoImpresion metodoImpresion) {
        super(fabricante, modelo, precio, stock);
        this.puertos = puertos;
        this.metodoImpresion = metodoImpresion;
    }

    public Impresora() {
        super();
        this.puertos = 2;
        this.metodoImpresion = MetodoImpresion.INYECCION;
    }

    public int getPuertos() {
        return puertos;
    }

    public void setPuertos(int puertos) {
        this.puertos = puertos;
    }

    public MetodoImpresion getMetodoImpresion() {
        return metodoImpresion;
    }

    public void setMetodoImpresion(MetodoImpresion metodoImpresion) {
        this.metodoImpresion = metodoImpresion;
    }
}
