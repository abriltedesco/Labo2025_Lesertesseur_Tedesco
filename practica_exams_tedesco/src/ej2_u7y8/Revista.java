package ej2_u7y8;

import java.time.LocalDate;

public class Revista extends Publicacion implements Prestable {
    private String distribuidora;

    public Revista(String titulo, String autor, int anioPublicacion, int stock, String distribuidora) {
        super(titulo, autor, anioPublicacion, stock);
        this.distribuidora = distribuidora;
    }

    public String getDistribuidora() {
        return distribuidora;
    }

    public void setDistribuidora(String distribuidora) {
        this.distribuidora = distribuidora;
    }


    @Override
    public int calcularMulta() {
        return 3500;
    }

    @Override
    public LocalDate darPrestamo() {
        if (this.getAnioPublicacion() < 2020) {
            return LocalDate.now().plusDays(10);
        }
        else {
            return LocalDate.now().plusDays(3);
        }
    }
}
