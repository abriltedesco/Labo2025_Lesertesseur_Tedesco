package alarmasEdificio;

public class DispositivoAlarma {
    private boolean estaConectado;
    private double medida;
    private double umbralInicial;
    private int anioAdquisicion;

    public DispositivoAlarma(boolean estaConectado, double medida, double umbralInicial, int anioAdquisicion) {
        this.estaConectado = estaConectado;
        this.medida = medida;
        this.umbralInicial = umbralInicial;
        this.anioAdquisicion = anioAdquisicion;
    }

    public DispositivoAlarma() {
        this.estaConectado = true;
        this.medida = 35.5;
        this.umbralInicial = 40;
        this.anioAdquisicion = 2021;
    }

    public boolean isEstaConectado() {
        return estaConectado;
    }

    public void setEstaConectado(boolean estaConectado) {
        this.estaConectado = estaConectado;
    }

    public double getMedida() {
        return medida;
    }

    public void setMedida(double medida) {
        this.medida = medida;
    }

    public double getUmbralInicial() {
        return umbralInicial;
    }

    public void setUmbralInicial(double umbralInicial) {
        this.umbralInicial = umbralInicial;
    }

    public int getAnioAdquisicion() {
        return anioAdquisicion;
    }

    public void setAnioAdquisicion(int anioAdquisicion) {
        this.anioAdquisicion = anioAdquisicion;
    }
}
