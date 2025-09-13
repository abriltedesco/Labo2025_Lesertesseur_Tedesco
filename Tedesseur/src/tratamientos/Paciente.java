package tratamientos;

import personas.Persona;

import java.time.LocalDate;

public abstract class Paciente extends Persona{
   private Genero genero;
   private TipoSangre tipoSangre;

    public Genero getGenero() { return genero;}
    public void setGenero(Genero genero) { this.genero = genero;}

    public TipoSangre getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(TipoSangre tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public Paciente(String nombre, int edad, String apellido, LocalDate fechaNacimiento, Genero genero, TipoSangre tipoSangre) {
        super(nombre, edad, apellido, fechaNacimiento);
        this.genero = genero;
        this.tipoSangre = tipoSangre;
    }
}
