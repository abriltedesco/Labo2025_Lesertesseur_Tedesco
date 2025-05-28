package dispositivos;

public class Mouse extends Entrada{
    public Mouse(String fabricante, String modelo, double precio, int stock, String tipoConector, int puertos) {
        super(fabricante, modelo, precio, stock, tipoConector, puertos);
    }
    public Mouse() {
        super();
    }
}
