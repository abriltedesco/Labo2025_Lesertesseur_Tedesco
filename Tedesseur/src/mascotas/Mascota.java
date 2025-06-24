package mascotas;
public abstract class Mascota {
    private String nombre;
    private Dueño dueño;
    private Tipo tipo;
    private int puntosAlegria;

    public Mascota() {
        this.nombre = " ";
        this.dueño = new Dueño();
        this.tipo = Tipo.PERRO;
        this.puntosAlegria = 0;
    }

    public Mascota(String nombre, Dueño dueño, Tipo tipo, int puntosAlegria) {
        this.nombre = nombre;
        this.dueño = dueño;
        this.tipo = tipo;
        this.puntosAlegria = puntosAlegria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Dueño getDueño() {
        return dueño;
    }

    public void setDueño(Dueño dueño) {
        this.dueño = dueño;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public int getPuntosAlegria() {
        return puntosAlegria;
    }

    public void setPuntosAlegria(int puntosAlegria) {
        this.puntosAlegria = puntosAlegria;
    }

    abstract void saludo(boolean alDueño);
    abstract void alimentar();
}


