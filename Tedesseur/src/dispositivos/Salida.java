package dispositivos;

public class Salida extends Dispositivo {
    public Salida(String fabricante, String modelo, double precio, int stock, String puerto) {
        super(fabricante, modelo, precio, stock, puerto);
    }

    public Salida() {
        super();
    }

    public Salida(String fabricante, String modelo, double precio) {
        super(fabricante, modelo, precio);
    }
}
