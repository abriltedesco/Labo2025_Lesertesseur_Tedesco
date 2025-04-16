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
    public void llenarCafetera(){
        setCantidadActual(getCantidadMaxima());
    }

    public void servirTaza(int capacidad_taza){
        int contador = 0;
        while (contador < capacidad_taza){
            cantidadActual--;
            contador ++;
        }
    }

    public void vaciarCafetera(){
        this.cantidadActual = 0;
    }

    public void agregarCafe(int cantidad){
        int cantActual = this.cantidadActual;
        int chequear_CA = cantActual += cantidad;
        if(chequear_CA > this.cantidadMaxima){
            System.out.println("capacidad supera la cant maxima, volver a ingresar");
        }
        else{
            this.cantidadActual += cantidad;
        }
    }


    public static void main(String[] args) {
        Cafetera c1 = new Cafetera();
        Cafetera c2 = new Cafetera(1200);
        Cafetera c3 = new Cafetera(900, 372 );

        c1.llenarCafetera();
        c1.servirTaza(300);
        c1.agregarCafe(400);
        System.out.println("cant actual c1: " + c1.getCantidadActual());

        c2.llenarCafetera();
        c2.servirTaza(500);
        c2.agregarCafe(300);
        System.out.println("cant actual c2: " + c2.getCantidadActual());

        c3.servirTaza(200);
        c3.vaciarCafetera();
        c3.agregarCafe(800);
        System.out.println("cant actual c3: " + c3.getCantidadActual());
    }
}
