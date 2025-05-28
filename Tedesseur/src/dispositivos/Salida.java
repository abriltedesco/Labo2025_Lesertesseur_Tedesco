package dispositivos;

public class Salida extends Dispositivo {
    public Salida(String fabricante, String modelo, double precio, int stock) {
        super(fabricante, modelo, precio, stock);
    }

    public Salida() {
        super();
    }

    public Salida(String fabricante, String modelo, double precio) {
        super(fabricante, modelo, precio);
    }
}
