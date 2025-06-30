package personas;

import fecha.Fecha;

import java.time.LocalDate;

public class Jugador extends Persona {
   private String nombre;
   private String apellido;
   private Fecha fechaNacimiento;
   private int numeroCamiseta;

    public Jugador(String nombre, String apellido, int numeroCamiseta, LocalDate fechaNacimiento) {
      super(nombre, apellido, fechaNacimiento);
      this.numeroCamiseta = numeroCamiseta;
    }

    public Jugador() {
        super("julian", "alvarez", LocalDate.of(2001, 31, 1));
        this.numeroCamiseta = 10 ;
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(int numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }

//   public Fecha getFechaNacimiento() {
//       return fechaNacimiento;
//   }

//   public void setFechaNacimiento(Fecha fechaNacimiento) {
//       this.fechaNacimiento = fechaNacimiento;
//   }

//   public String getNombre() {
//       return nombre;
//   }

//   public void setNombre(String nombre) {
//       this.nombre = nombre;
//   }

//   public String getApellido() {
//       return apellido;
//   }

//   public void setApellido(String apellido) {
//       this.apellido = apellido;
//   }
}
