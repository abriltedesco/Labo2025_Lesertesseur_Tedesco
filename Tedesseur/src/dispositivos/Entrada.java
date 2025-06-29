package dispositivos;

import receta.Temperatura;
import receta.Tipo;

import java.util.ArrayList;

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

    public Entrada(String ensaladaCaesar, ArrayList<String> pasosEntrada, Tipo tipo, Temperatura temperatura) {
    }

    public String getTipoConector() {
        return tipoConector;
    }
    public void setTipoConector(String tipoConector) {
        this.tipoConector = tipoConector;
    }
    public int getPuertos() {
        return puertos;
    }
    public void setPuertos(int puertos) {
        this.puertos = puertos;
    }
}
