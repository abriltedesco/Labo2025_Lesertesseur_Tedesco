package dispositivos;

public class DispositivoElecciones extends DispositivoPadre {
    private int numSerie;
    public boolean prendido;

    public DispositivoElecciones(String fabricante, String modelo, int numSerie, boolean prendido) {
        super(fabricante, modelo);
        this.numSerie = numSerie;
        this.prendido = prendido;
    }

    public int getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(int numSerie) {
        this.numSerie = numSerie;
    }

    public boolean isPrendido() {
        return prendido;
    }

    public void setPrendido(boolean prendido) {
        this.prendido = prendido;
    }
}
