package ej2_u7y8;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;

public class Usuario {
    private String nombre;
    private String apellido;
    private String mail;
    private LocalDate fechaNacimiento;
    private HashSet<Publicacion> publicacionesLeidas;
    private HashMap<Publicacion, Integer> prestamosRealizados;
    private int credito;
    private String numSocio;

    public Usuario(String nombre, String apellido, String mail, HashSet<Publicacion> publicacionesLeidas, LocalDate fechaNacimiento, int credito, String numSocio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.publicacionesLeidas = publicacionesLeidas;
        this.prestamosRealizados = new HashMap<>();
        this.fechaNacimiento = fechaNacimiento;
        this.credito = credito;
        this.numSocio = numSocio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public HashSet<Publicacion> getPublicacionesLeidas() {
        return publicacionesLeidas;
    }

    public void setPublicacionesLeidas(HashSet<Publicacion> publicacionesLeidas) {
        this.publicacionesLeidas = publicacionesLeidas;
    }

    public HashMap<Publicacion, Integer> getPrestamosRealizados() {
        return prestamosRealizados;
    }

    public void setPrestamosRealizados(HashMap<Publicacion, Integer> prestamosRealizados) {
        this.prestamosRealizados = prestamosRealizados;
    }

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }

    public String getNumSocio() {
        return numSocio;
    }

    public void setNumSocio(String numSocio) {
        this.numSocio = numSocio;
    }

    public void agregarPublicacionLeida(Publicacion publicacion){
        this.publicacionesLeidas.add(publicacion);
    }

    public void agregarPrestamo(Publicacion publicacion){
        int cant = 0;
        if(prestamosRealizados.containsKey(publicacion)){
            cant = prestamosRealizados.get(publicacion);
        }
        this.prestamosRealizados.put(publicacion, cant+1);
        if(!publicacionesLeidas.contains(publicacion)){
            publicacionesLeidas.add(publicacion);
        }
        publicacion.reducirStock();
    }

    public boolean tienePrestamo(Publicacion publicacion){
        return false;
    }
}
