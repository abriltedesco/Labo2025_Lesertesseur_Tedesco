package tickets;

public class Comentario {
    private Desarrollador desarrollador;
    private String anotacion;
    private Estado estado;

    public Comentario(Desarrollador desarrollador, String anotacion, Estado estado) {
        this.desarrollador = desarrollador;
        this.anotacion = anotacion;
        this.estado = estado;
    }

    public Comentario() {
        this.desarrollador = new Desarrollador("miguel", "pan");
        this.anotacion = "anotacion";
        this.estado = Estado.ABIERTO;
    }


    public Desarrollador getDesarrollador() {
        return desarrollador;
    }

    public void setDesarrollador(Desarrollador desarrollador) {
        this.desarrollador = desarrollador;
    }

    public String getAnotacion() {
        return anotacion;
    }

    public void setAnotacion(String anotacion) {
        this.anotacion = anotacion;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
