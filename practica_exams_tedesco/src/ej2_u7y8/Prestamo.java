package ej2_u7y8;

import java.time.LocalDate;

public class Prestamo {
    private Publicacion articulo;
    private String numSocio;
    private LocalDate fechaPrestada;
    private LocalDate devolucionEstimada;

    public Prestamo(Publicacion articulo, String numSocio, LocalDate fechaPrestada) {
        this.articulo = articulo;
        this.numSocio = numSocio;
        this.fechaPrestada = fechaPrestada;
        this.devolucionEstimada = ((Prestable) articulo).darPrestamo();
    }

    public Publicacion getArticulo() {
        return articulo;
    }

    public void setArticulo(Publicacion articulo) {
        this.articulo = articulo;
    }

    public LocalDate getFechaPrestada() {
        return fechaPrestada;
    }

    public void setFechaPrestada(LocalDate fechaPrestada) {
        this.fechaPrestada = fechaPrestada;
    }

    public String getNumSocio() {
        return numSocio;
    }

    public void setNumSocio(String numSocio) {
        this.numSocio = numSocio;
    }

    public LocalDate getDevolucionEstimada() {
        return devolucionEstimada;
    }

    public void setDevolucionEstimada(LocalDate devolucionEstimada) {
        this.devolucionEstimada = devolucionEstimada;
    }

    public void infoAlUser(){
        System.out.println("Recuerda que deberás devolverlo el dia " + devolucionEstimada.getDayOfMonth() + "/" + devolucionEstimada.getMonthValue() + "/" + devolucionEstimada.getYear());
    }

    public boolean estaVencido(){
        if(LocalDate.now().isAfter(devolucionEstimada)){
            return true;
        }
        return false;
    }
}
