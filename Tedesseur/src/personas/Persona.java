package personas;

import java.time.LocalDate;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private LocalDate fechaNacimiento;

    public Persona(){
        this.nombre = "Carlos";
        this.edad = 20;
        this.apellido = "Gardel";
        this.fechaNacimiento = LocalDate.of(1914,9,5);
    }

    public Persona(String nombre, int edad, String apellido, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Persona(String nombre, String apellido, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
