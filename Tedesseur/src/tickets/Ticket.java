package tickets;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;

public abstract class Ticket {
    protected Cliente cliente;
    protected String descripcion;
    protected LocalDateTime creacion;
    protected LocalDateTime finalizacion;
    protected ArrayList<Comentario> comentarios;

    public Ticket(Cliente cliente, String descripcion, ArrayList<Comentario> comentarios, LocalDateTime creacion, LocalDateTime finalizacion) {
        this.cliente = cliente;
        this.descripcion = descripcion;
        this.comentarios = comentarios;
        this.creacion = creacion;
        this.finalizacion = finalizacion;
    }

    public Ticket() {
        this.cliente = new Cliente("fsfd", "dsjadjsaj");
        this.descripcion = "descripcion";
        this.comentarios = new ArrayList<>();
        Desarrollador d1 = new Desarrollador("manuel", "perez");
        Comentario c1 = new Comentario(d1, "anotacion de manuelito", Estado.EN_PROGRESO);
        Comentario c2 = new Comentario(d1, "anotacion de manuelito", Estado.RESUELTO);
        comentarios.add(c1);
        comentarios.add(c2);
        this.creacion = LocalDateTime.of(LocalDate.of(2025, 6, 5), LocalTime.now());
        this.finalizacion =  LocalDateTime.now();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getDescripcion() {
        return descripcion;
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

    public Estado estadoTicket(){
        return this.comentarios.getLast().getEstado();
    }

    public boolean noAgarradoPorDesarrollador(){
       if(estadoTicket() == Estado.ABIERTO){
           return true;
       }
       return false;
    }

    public Duration tiempoResolucion(){
        if (this.finalizacion == null) return Duration.ZERO;
        return Duration.between(this.creacion, this.finalizacion);
    }

    abstract boolean resuelto();
}
