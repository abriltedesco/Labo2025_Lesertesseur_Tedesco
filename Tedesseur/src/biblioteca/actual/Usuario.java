package biblioteca.actual;


import personas.Persona;

import java.time.LocalDate;
import java.util.HashSet;

public class Usuario extends Persona {
    private String dni;
    private Membresia membresia;
    private String mail;
    private HashSet<LibroVirtual> libros;

    public Usuario(String nombre, int edad, String apellido, LocalDate fechaNacimiento, String dni, Membresia membresia, String mail) {
        super(nombre, edad, apellido, fechaNacimiento);
        this.dni = dni;
        this.membresia = membresia;
        this.mail = mail;
        this.libros = new HashSet<>();
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Membresia getMembresia() {
        return membresia;
    }

    public void setMembresia(Membresia membresia) {
        this.membresia = membresia;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int cantLibrosPrestados() throws MembresiaException {
        return libros.size();
    }

    public void sePuedeTomarPrestado(LibroVirtual libro) throws MembresiaException{
        if(libros.size() < membresia.getMaxLibrosPrestados()){
            System.out.println("se le ha prestado el libro: " + libro.getTitulo());
            this.libros.add(libro);
        }
        else if(libros.size() == membresia.getMaxLibrosPrestados()) {
            throw new MembresiaException("tenes que devolver algun libro, has llegado a tu limite");
        }
        else{
            throw new MembresiaException("tenes más libros prestados de los autorizados, te pedimos devolverlos urgentemente");
        }
    }

    public void borrarLibro(LibroVirtual libro){
        this.libros.remove(libro);
    }
    public void agregarLibro(LibroVirtual libro) throws LimiteDePrestamosAlcanzadosExc, MembresiaException {
        libro.descargarLibro();
        sePuedeTomarPrestado(libro);
    }

    public void modificarLibro(LibroVirtual libroViejo, LibroVirtual libroNuevo) throws LimiteDePrestamosAlcanzadosExc, MembresiaException {
        borrarLibro(libroViejo);
        agregarLibro(libroNuevo);
    }

    public void devolverLibro(LibroVirtual libroDevuelto) throws LimiteDePrestamosAlcanzadosExc {
        for(LibroVirtual libro : this.libros){
            if(libro == libroDevuelto){
                libro.descargarLibro();
                borrarLibro(libroDevuelto);
            }
        }
    }
}
