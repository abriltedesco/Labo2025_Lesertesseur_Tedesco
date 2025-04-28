package deportes;

import unidad1.Fecha;

public class Jugador {
    private String nombre;
    private String apellido;
    private Fecha fechaNacimiento;
    private int numeroCamiseta;

    public Jugador(String nombre, String apellido, int numeroCamiseta, Fecha fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroCamiseta = numeroCamiseta;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Jugador() {
        this.nombre = "Julian";
        this.apellido = "Alvarez";
        this.numeroCamiseta = 10 ;
        this.fechaNacimiento = new Fecha(31, 1, 2000);
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(int numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

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
}
