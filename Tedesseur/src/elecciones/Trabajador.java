package elecciones;

import personas.Persona;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Trabajador extends Persona implements Mensajes {
    private String dni;
    private String numCuil;
    private String residencia;
    private double sueldo;
    private LocalTime inicioHorarioLaboral;
    private LocalTime finHorarioLaboral;


    public Trabajador(String nombre, int edad, String apellido, LocalDate fechaNacimiento, String dni, String numCuil, String residencia, double sueldo, LocalTime inicioHorarioLaboral, LocalTime finHorarioLaboral) {
        super(nombre, edad, apellido, fechaNacimiento);
        this.dni = dni;
        this.numCuil = numCuil;
        this.residencia = residencia;
        this.sueldo = sueldo;
        this.inicioHorarioLaboral = inicioHorarioLaboral;
        this.finHorarioLaboral = finHorarioLaboral;
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

    public LocalTime getInicioHorarioLaboral() {
        return inicioHorarioLaboral;
    }

    public void setInicioHorarioLaboral(LocalTime inicioHorarioLaboral) {
        this.inicioHorarioLaboral = inicioHorarioLaboral;
    }

    public LocalTime getFinHorarioLaboral() {
        return finHorarioLaboral;
    }

    public void setFinHorarioLaboral(LocalTime finHorarioLaboral) {
        this.finHorarioLaboral = finHorarioLaboral;
    }

    @Override
    public void enviarMensaje() {
        if (LocalTime.now().isBefore(this.finHorarioLaboral) && LocalTime.now().isAfter(this.inicioHorarioLaboral)) {
            System.out.println("Yo " + this.getNombre() + " te invito a que... ");
        }
    }
}
