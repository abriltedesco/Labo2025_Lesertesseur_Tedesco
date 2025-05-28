package alarmasEdificio;

public class Dispositivo {
    private boolean estaConectado;
    private double medida;
    private double umbralInicial;
    private int anioAdquisicion;

    public Dispositivo(boolean estaConectado, double medida, double umbralInicial, int anioAdquisicion) {
        this.estaConectado = estaConectado;
        this.medida = medida;
        this.umbralInicial = umbralInicial;
        this.anioAdquisicion = anioAdquisicion;
    }

    public Dispositivo() {
        this.estaConectado = true;
        this.medida = 35.5;
        this.umbralInicial = umbralInicial;
        this.anioAdquisicion = 2021;
    }
}
