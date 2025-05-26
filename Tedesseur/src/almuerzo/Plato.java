package almuerzo;

public class Plato {
    private String nombre;
    private double precio;
    private int cantPedida;

    public Plato(String nombre, double precio, int cantPedida) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantPedida = cantPedida;
    }

    public Plato() {
        this.nombre = "Milanesa";
        this.precio = 11000;
        this.cantPedida  = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantPedida() {
        return cantPedida;
    }

    public void setCantPedida(int cantPedida) {
        this.cantPedida = cantPedida;
    }
}
