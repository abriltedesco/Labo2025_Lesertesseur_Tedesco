package mascotas;
public abstract class Mascota {
    private String nombre;
    private Dueño dueño;
    private Tipo tipo;
    private int puntosAlegria;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    abstract void saludo();
    abstract void alimentar();
}


