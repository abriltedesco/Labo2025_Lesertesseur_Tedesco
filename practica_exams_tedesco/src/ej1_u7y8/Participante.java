package ej1_u7y8;

import java.time.LocalDate;

public abstract class Participante {
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private String localidad;
    private Color equipo;

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

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public Color getEquipo() {
        return equipo;
    }

    public void setEquipo(Color equipo) {
        this.equipo = equipo;
    }

    public Participante(String nombre, String apellido, LocalDate fechaNacimiento, String localidad, Color equipo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.localidad = localidad;
        this.equipo = equipo;
    }

    public abstract void prepararLugarDeTrabajo();
}
