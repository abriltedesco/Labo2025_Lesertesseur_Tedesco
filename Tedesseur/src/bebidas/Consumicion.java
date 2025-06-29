package bebidas;

public class Consumicion {
     private Bebida bebida;
     private int cantidad;

    public Consumicion(Bebida bebida, int cantidad) {
        this.bebida = bebida;
        this.cantidad = cantidad;
    }

    public void setBebida(Bebida bebida) {
        this.bebida = bebida;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Bebida getBebida() {
        return bebida;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double calcularImpacto() {
        return cantidad * (bebida.getCoeficientePositividad() - bebida.getCoeficienteNegatividad());
    }
}
