package telefonica;

public class Llamada {
    private Telefono telefonoOrigen;
    private Telefono telefonoDestino;
    private int duracion;

    public Llamada(Telefono telefonoOrigen, Telefono telefonoDestino, int duracion) {
        this.telefonoOrigen = telefonoOrigen;
        this.telefonoDestino = telefonoDestino;
        this.duracion = duracion;
    }

    public Llamada() {
        this.telefonoOrigen = new Telefono("434354546");
        this.telefonoDestino = new Telefono("1234567");
        this.duracion = 90;
    }

    public Telefono getTelefonoOrigen() {
        return telefonoOrigen;
    }

    public void setTelefonoOrigen(Telefono telefonoOrigen) {
        this.telefonoOrigen = telefonoOrigen;
    }

    public Telefono getTelefonoDestino() {
        return telefonoDestino;
    }

    public void setTelefonoDestino(Telefono telefonoDestino) {
        this.telefonoDestino = telefonoDestino;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
}
