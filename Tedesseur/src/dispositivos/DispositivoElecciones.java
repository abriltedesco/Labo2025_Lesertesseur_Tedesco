package dispositivos;

public class DispositivoElecciones extends DispositivoPadre {
    private int numSerie;
    public boolean prendido;

    public DispositivoElecciones(String fabricante, String modelo, int numSerie, boolean prendido) {
        super(fabricante, modelo);
        this.numSerie = numSerie;
        this.prendido = prendido;
    }
}
