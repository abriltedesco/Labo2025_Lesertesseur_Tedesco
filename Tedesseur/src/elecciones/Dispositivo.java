package elecciones;

import dispositivos.DispositivoPadre;

public class Dispositivo extends DispositivoPadre {
    private int numSerie;

    public Dispositivo(String fabricante, String modelo, int numSerie) {
        super(fabricante, modelo);
        this.numSerie = numSerie;
    }
}
