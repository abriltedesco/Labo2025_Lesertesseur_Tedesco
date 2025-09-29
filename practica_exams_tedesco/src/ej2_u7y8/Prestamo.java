package ej2_u7y8;

import ej2_u7y8.excepciones.FueraDeFecha;
import ej2_u7y8.excepciones.NoPrestableException;

import java.sql.SQLOutput;
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

    public boolean estaVencido() throws FueraDeFecha {
        if(LocalDate.now().isAfter(devolucionEstimada)){
            throw new FueraDeFecha("Prestamo devuelto fuera de fecha");
        }
        return false;
    }

    public boolean puedeExtenderse(boolean tieneOtraRevista) throws NoPrestableException {
        if (this.articulo.getStock() <= 5 && tieneOtraRevista) {
            throw new NoPrestableException("No es posible extender el prestamo");
        }

        System.out.println("Prestamo extendido");
        return true;
    }
}
