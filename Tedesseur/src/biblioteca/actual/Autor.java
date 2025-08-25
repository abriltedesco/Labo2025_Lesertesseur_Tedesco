package biblioteca.actual;

import personas.Persona;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;

public class Autor extends Persona{
    private String dni;
    private HashMap<String, LibroVirtual> libros;

    public Autor(String nombre, int edad, String apellido, LocalDate fechaNacimiento, String dni) {
        super(nombre, edad, apellido, fechaNacimiento);
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void agregarLibro(String codigo, LibroVirtual libro){
        this.libros.put(codigo, libro);
    }

}
