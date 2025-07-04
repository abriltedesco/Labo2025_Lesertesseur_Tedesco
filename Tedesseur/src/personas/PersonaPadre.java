package personas;

public abstract class PersonaPadre {
    private String nombre;
    private String apellido;

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

    public PersonaPadre(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public PersonaPadre() {
        this.nombre = "carlos";
        this.apellido = "gardel";
    }
}
