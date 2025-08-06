package empleados;

import java.time.Period;

import java.time.LocalDate;

public class EmpleadoBanco extends personas.Persona {
    private int dni;
    private LocalDate fechaIngreso;

    public EmpleadoBanco() {
        super("Charli", "XCX", LocalDate.of(1998, 5, 13));
        this.dni = 25252525;
        this.fechaIngreso =  LocalDate.of(2022, 3, 18);
    }

    public EmpleadoBanco(String nombre, String apellido, int dni, LocalDate fechaNacimiento, LocalDate fechaIngreso) {
        super(nombre, apellido, fechaNacimiento);
        this.dni = dni;
        this.fechaIngreso = fechaIngreso;
    }

    public EmpleadoBanco(String nombre, String apellido, int dni, LocalDate fechaNacimiento) {
       super(nombre, apellido, fechaNacimiento);
        this.dni = dni;
        this.fechaIngreso = LocalDate.now();
    }



    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }


  public LocalDate getfechaIngreso() {
      return fechaIngreso;}

    public void setfechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public int antiguedad(){
        Period period = Period.between(fechaIngreso, LocalDate.now());
        return Math.abs(period.getYears());
    }
}
