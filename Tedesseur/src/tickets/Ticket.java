package tickets;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

public abstract class Ticket {
    private Cliente cliente;
    private String descripcion;
    private LocalDateTime creacion;
    private LocalDateTime finalizacion;
    private ArrayList<Comentario> comentarios;
    private Estado estado;

    public Ticket(Cliente cliente, String descripcion, LocalDateTime creacion, LocalDateTime finalizacion, ArrayList<Comentario> comentarios) {
        this.cliente = cliente;
        this.descripcion = descripcion;
        this.creacion = creacion;
        this.finalizacion = finalizacion;
        this.comentarios = comentarios;
    }

    public Ticket(Cliente cliente, String descripcion, ArrayList<Comentario> comentarios, LocalDateTime creacion, LocalDateTime finalizacion) {

    }

    public String getDescripcion() {
        return descripcion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDateTime getCreacion() {
        return creacion;
    }

    public void setCreacion(LocalDateTime creacion) {
        this.creacion = creacion;
    }

    public LocalDateTime getFinalizacion() {
        return finalizacion;
    }

    public void setFinalizacion(LocalDateTime finalizacion) {
        this.finalizacion = finalizacion;
    }

    public ArrayList<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(ArrayList<Comentario> comentarios) {
        this.comentarios = comentarios;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    abstract boolean resuelto();


    public Duration tiempoResolucion() {
        return null;
    }
}
