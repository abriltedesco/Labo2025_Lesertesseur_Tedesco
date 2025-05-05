package unidad2;

public class Cast {
    private String nombre;
    private String apellido;
    private boolean esDirector;

    public Cast() {
        this.nombre = "richard";
        this.esDirector = true;
        this.apellido = "linklater";
    }

    public Cast(String nombre, boolean esDirector, String apellido) {
        this.nombre = nombre;
        this.esDirector = esDirector;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEsDirector() {
        return esDirector;
    }

    public void setEsDirector(boolean esDirector) {
        this.esDirector = esDirector;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
