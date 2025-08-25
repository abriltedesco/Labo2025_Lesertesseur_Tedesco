package biblioteca.actual;

public enum Membresia {
    BRONCE(5), PLATA(15), ORO(50);
    private int maxLibrosPrestados;

    private Membresia(int maxLibrosPrestados) {
        this.maxLibrosPrestados = maxLibrosPrestados;
    }

    public int getMaxLibrosPrestados() {
        return maxLibrosPrestados;
    }

    public void setMaxLibrosPrestados(int maxLibrosPrestados) {
        this.maxLibrosPrestados = maxLibrosPrestados;
    }
}
