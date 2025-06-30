package personas;

import java.time.LocalDate;

public class Persona extends PersonaPadre{
    private int edad;
    private LocalDate fechaNacimiento;

    public Persona(){
        super();
        this.edad = 20;
        this.fechaNacimiento = LocalDate.of(1914,9,5);
    }

    public Persona(String nombre, int edad, String apellido, LocalDate fechaNacimiento) {
        super(nombre, apellido);
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Persona(String nombre, String apellido, LocalDate fechaNacimiento) {
        super(nombre, apellido);
        this.fechaNacimiento = fechaNacimiento;
    }

    public Persona(String nombre, String apellido, int edad) {
        super(nombre, apellido);
        this.edad = edad;
    }

    public Persona(String nombre, String apellido) {
        super(nombre, apellido);
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
