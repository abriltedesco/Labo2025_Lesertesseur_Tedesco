package dispositivos;

public class Entrada extends Dispositivo{
    private String tipoConector;
    private int puertos;

    public Entrada(){
        super();
        this.tipoConector = "tipo";
        this.puertos = 2;
    }

    public Entrada(String fabricante, String modelo, double precio, int stock, String tipoConector, int puertos){
        super(fabricante, modelo, precio, stock);
        this.tipoConector = tipoConector;
        this.puertos = puertos;
    }
}
