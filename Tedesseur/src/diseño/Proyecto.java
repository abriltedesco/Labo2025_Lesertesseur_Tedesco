package diseño;

public class Proyecto {
    private String nombre;
    private String descripcion;
    private double dineroRecaudado;

    public Proyecto() {
        this.nombre = "nombre";
        this.descripcion = "descripcion";
        this.dineroRecaudado = 500000;
    }

    public Proyecto(String nombre, String descripcion, double dineroRecaudado) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.dineroRecaudado = dineroRecaudado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getDineroRecaudado() {
        return dineroRecaudado;
    }

    public void setDineroRecaudado(double dineroRecaudado) {
        this.dineroRecaudado = dineroRecaudado;
    }
}
