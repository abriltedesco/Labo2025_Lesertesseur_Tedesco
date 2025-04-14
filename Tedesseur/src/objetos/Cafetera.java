package objetos;

public class Cafetera {
    private int cantidadMaxima;
    private int cantidadActual;

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public int getCantidadMaxima() {
        return cantidadMaxima;
    }

    public void setCantidadMaxima(int cantidadMaxima) {
        this.cantidadMaxima = cantidadMaxima;
    }

    /* CONSTRUCTORES */
    public Cafetera(int cantidadMaxima, int cantidadActual) {
        this.cantidadMaxima = cantidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public Cafetera() {
        this.cantidadMaxima = 1000;
        this.cantidadActual = 0;
    }

    public Cafetera(int cantidadMaxima) {
        this.cantidadMaxima = cantidadMaxima;
        this.cantidadActual = cantidadMaxima;
    }



    /* METODOS */
    public void llenarCafetera(){}
    public void servirTaza(int capacacidad){}
    public void vaciarCafetera(){}
    public void agregarCafe(int cantidad){}

    public static void main(String[] args) {
        Cafetera c1 = new Cafetera();
        Cafetera c2 = new Cafetera(1200);
        Cafetera c3 = new Cafetera(900, 372 );


    }
}
