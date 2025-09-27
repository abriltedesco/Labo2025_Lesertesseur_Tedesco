package ej2_u7y8;

import ej2_u7y8.excepciones.FueraDeFecha;
import ej2_u7y8.excepciones.NoPrestableException;
import ej2_u7y8.excepciones.StockInsuficienteException;

import java.time.LocalDate;
import java.util.HashSet;

public class SistemaBiblioteca {
    HashSet<Publicacion> publicacionesTotales;
    HashSet<Prestable> publicacionesPrestables;
    HashSet<Prestamo> prestamosRealizados;
    HashSet<Usuario> usuarios;

    public SistemaBiblioteca(HashSet<Publicacion> publicacionesTotales, HashSet<Prestable> publicacionesPrestables, HashSet<Prestamo> prestamosRealizados, HashSet<Usuario> usuarios) {
        this.publicacionesTotales = publicacionesTotales;
        this.publicacionesPrestables = publicacionesPrestables;
        this.prestamosRealizados = prestamosRealizados;
        this.usuarios = usuarios;
    }

    public HashSet<Publicacion> getPublicacionesTotales() {
        return publicacionesTotales;
    }

    public void setPublicacionesTotales(HashSet<Publicacion> publicacionesTotales) {
        this.publicacionesTotales = publicacionesTotales;
    }

    public HashSet<Prestable> getPublicacionesPrestables() {
        return publicacionesPrestables;
    }

    public void setPublicacionesPrestables(HashSet<Prestable> publicacionesPrestables) {
        this.publicacionesPrestables = publicacionesPrestables;
    }

    public HashSet<Prestamo> getPrestamosRealizados() {
        return prestamosRealizados;
    }

    public void setPrestamosRealizados(HashSet<Prestamo> prestamosRealizados) {
        this.prestamosRealizados = prestamosRealizados;
    }

    public HashSet<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(HashSet<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public Publicacion buscarPublicacion(String titulo) throws NoPrestableException {
        for(Publicacion publicacion : publicacionesTotales){
            if(publicacion.getTitulo().equals(titulo)){
                return publicacion;
            }
        }

        throw new NoPrestableException("no tenemos ese libro para prestarle");
    }

    public boolean verificarDisponibilidad(Publicacion publicacion) throws NoPrestableException, StockInsuficienteException {
        if (!(publicacion instanceof Prestable)) {
            throw new NoPrestableException("No se puede dar a prestamo");
        }

        if (!publicacion.tieneStock()) {
            throw new StockInsuficienteException("No hay stock suficiente");
        }

        System.out.println("Esta disponible para ser prestado");
        return true;
    }


    public void agregarPrestamo(Publicacion publicacion, String numeroSocio) throws NoPrestableException, StockInsuficienteException {
        if (!verificarDisponibilidad(publicacion)) {
            return;
        }

        Prestamo nuevoPrestamo = new Prestamo(publicacion, numeroSocio, LocalDate.now());

        publicacion.reducirStock();
        prestamosRealizados.add(nuevoPrestamo);

        System.out.println("Prestamo agregado");
        nuevoPrestamo.infoAlUser();
    }

    public void devolverPrestamo(Prestamo prestamo, Usuario usuario) throws FueraDeFecha {
        if (prestamo.estaVencido()) {
            Prestable publicacionPrestable = (Prestable) prestamo.getArticulo();
            double multa = publicacionPrestable.calcularMulta();

            usuario.setCredito((int) (usuario.getCredito() - multa));

            throw new FueraDeFecha("Prestamo devuelto fuera de fecha");
        }

        usuario.agregarPrestamo(prestamo.getArticulo());
        System.out.println("Préstamo devuelto correctamente");
    }

    public void extenderPrestamo(Prestable publicacion, Usuario user){

    }

    public void agregarPublicacion(Publicacion publicacion){
        this.publicacionesTotales.add(publicacion);
    }
}
