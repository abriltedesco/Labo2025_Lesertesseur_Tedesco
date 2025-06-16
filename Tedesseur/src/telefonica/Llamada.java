package telefonica;

import java.time.LocalDate;
import java.util.Locale;

public class Llamada {
    private Telefono telefonoOrigen;
    private Telefono telefonoDestino;
    private int duracion;
    private LocalDate fecha;

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Llamada(Telefono telefonoOrigen, Telefono telefonoDestino, int duracion, LocalDate fecha) {
        this.telefonoOrigen = telefonoOrigen;
        this.telefonoDestino = telefonoDestino;
        this.duracion = duracion;
        this.fecha = fecha;
    }

    public Llamada() {
        this.telefonoOrigen = new Telefono("434354546");
        this.telefonoDestino = new Telefono("1234567");
        this.duracion = 90;
        this.fecha = LocalDate.of(2023, 3, 3);
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
