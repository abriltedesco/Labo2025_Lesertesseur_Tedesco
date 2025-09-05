package elecciones;

import personas.Persona;
import personas.PersonaPadre;

import java.time.LocalDate;

public class Trabajador extends Persona {
    private String dni;
    private String numCuil;
    private String residencia;
    private double sueldo;

    public Trabajador(String nombre, String apellido, LocalDate fechaNacimiento, String dni, String numCuil, String residencia, double sueldo) {
        super(nombre, apellido, fechaNacimiento);
        this.dni = dni;
        this.numCuil = numCuil;
        this.residencia = residencia;
        this.sueldo = sueldo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNumCuil() {
        return numCuil;
    }

    public void setNumCuil(String numCuil) {
        this.numCuil = numCuil;
    }

    public String getResidencia() {
        return residencia;
    }

    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
