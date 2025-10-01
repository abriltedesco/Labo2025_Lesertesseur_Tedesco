package ej2_u7y8;

import java.time.LocalDate;

public class Libro extends Publicacion implements Prestable {
    private boolean tieneSaga;

    public Libro(String titulo, String autor, int anioPublicacion, int stock, boolean tieneSaga) {
        super(titulo, autor, anioPublicacion, stock);
        this.tieneSaga = tieneSaga;
    }

    @Override
    public int calcularMulta() {
        return 7500;
    }

    @Override
    public LocalDate darPrestamo(LocalDate fechaPrestada) {
        return fechaPrestada.plusDays(15);
    }
}
