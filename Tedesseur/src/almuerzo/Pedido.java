package almuerzo;

import colegio.Profesor;
import personas.Persona;

import java.time.LocalDate;

public class Pedido {
    private LocalDate fechaCreacion;
    private Plato plato;
    private Persona solicitante;
    private int horaEntrega;
    private String estadoEntrega;

    public Pedido(LocalDate fechaCreacion, Plato plato, Persona solicitante, int horaEntrega, String estadoEntrega) {
        this.fechaCreacion = fechaCreacion;
        this.plato = plato;
        this.solicitante = solicitante;
        this.horaEntrega = horaEntrega;
        this.estadoEntrega = estadoEntrega;
    }

    public Pedido() {
        this.fechaCreacion = LocalDate.now();
        this.plato = new Plato("Milanesas con pure", 12500,0);
        this.solicitante = new Persona("carlos", "vives");
        this.horaEntrega = 19;
        this.estadoEntrega = "Cancelado";
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Plato getPlato() {
        return plato;
    }

    public void setPlato(Plato plato) {
        this.plato = plato;
    }

    public Persona getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(Persona solicitante) {
        this.solicitante = solicitante;
    }

    public int getHoraEntrega() {
        return horaEntrega;
    }

    public void setHoraEntrega(int horaEntrega) {
        this.horaEntrega = horaEntrega;
    }

    public String getEstadoEntrega() {
        return estadoEntrega;
    }

    public void setEstadoEntrega(String estadoEntrega) {
        this.estadoEntrega = estadoEntrega;
    }

    public boolean isEsProfesor(){
        boolean esProfesor = false;
       if(this.solicitante instanceof Profesor){
            esProfesor = true;
       }
       return esProfesor;
    }

    public double ConseguirPorcDescuento (){
        double porcentaje = 0;
        if(isEsProfesor()){
            porcentaje = ((Profesor) this.solicitante).getPorcentajeDescuento();
        }
        return porcentaje;
    }
}
