package elecciones;

import java.util.HashSet;

public class Partido {
    private String nombre;
    private String direccion;
    private int cantAfiliados;
    private HashSet<Trabajador> mensajeros;

    public Partido(String nombre, String direccion, int cantAfiliados, HashSet<Trabajador> mensajeros) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.cantAfiliados = cantAfiliados;
        this.mensajeros = mensajeros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCantAfiliados() {
        return cantAfiliados;
    }

    public void setCantAfiliados(int cantAfiliados) {
        this.cantAfiliados = cantAfiliados;
    }

    public HashSet<Trabajador> getMensajeros() {
        return mensajeros;
    }

    public void setMensajeros(HashSet<Trabajador> mensajeros) {
        this.mensajeros = mensajeros;
    }
}
