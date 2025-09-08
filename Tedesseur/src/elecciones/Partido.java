package elecciones;

import java.util.HashSet;

public class Partido {
    private String nombre;
    private String direccion;
    private int cantAfiliados;
    private HashSet<Mensajes> mensajeros;

    public Partido(String nombre, String direccion, int cantAfiliados, HashSet<Mensajes> mensajeros) {
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

    public HashSet<Mensajes> getMensajeros() {
        return mensajeros;
    }

    public void setMensajeros(HashSet<Mensajes> mensajeros) {
        this.mensajeros = mensajeros;
    }

    public void agregarMensajero(Mensajes mensajero){
        this.mensajeros.add(mensajero);
    }

    public void borrarMensajero(Mensajes mensajero){
        this.mensajeros.remove(mensajero);
    }

    public void modificarMensajero(Mensajes mensajeroN, Mensajes mensajeroV ){
        agregarMensajero(mensajeroN);
       borrarMensajero(mensajeroV);
    }

    public void hacerCampania(){
        for(Mensajes mensajero : this.mensajeros){
            mensajero.enviarMensaje();
        }
    }
}
