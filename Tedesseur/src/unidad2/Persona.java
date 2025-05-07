package unidad2;

import java.time.Period;

import java.time.LocalDate;

public class Persona {
    private String nombre;
    private String apellido;
    private int dni;
    private LocalDate fechaNacimiento;
    private LocalDate fechaIngreso;

    public Persona() {
        this.nombre = "Charli";
        this.apellido = "XCX";
        this.dni = 25252525;
        this.fechaNacimiento = LocalDate.of(1998, 5, 13);
        this.fechaIngreso =  LocalDate.of(2022, 3, 18);
    }

    public Persona(String nombre, String apellido, int dni, LocalDate fechaNacimiento, LocalDate fechaIngreso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaIngreso = fechaIngreso;
    }

    public Persona(String nombre, String apellido, int dni, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaIngreso = LocalDate.now();
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

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public LocalDate getfechaIngreso() {
        return fechaIngreso;
    }

    public void setfechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public int antiguedad(){
        Period period = Period.between(fechaIngreso, LocalDate.now());
        return Math.abs(period.getYears());
    }
}
