package biblioteca.actual;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws LimiteDePrestamosAlcanzadosExc, MembresiaException {
        Autor a1 = new Autor("Jane", 90, "Austen", LocalDate.of(1940, 9,3), "390393");
        Autor a2 = new Autor("Ray", 45, "Brabury", LocalDate.of(1968, 5,23), "390393");
        Autor a3 = new Autor("George", 89, "Orwell", LocalDate.of(1937, 2,12), "390393");

        Usuario u1 = new Usuario("eufrales", 17, "lele", LocalDate.of(2007,11,2), "4814550", Membresia.PLATA, "eufrales@gmail.com");
        Usuario u2 = new Usuario("aabyted", 17, "tete", LocalDate.of(2007,12,20), "4814550", Membresia.ORO, "abriltedesco@gmail.com");
        Usuario u3 = new Usuario("vikitoria", 18, "alal", LocalDate.of(2007,9,13), "4814550", Membresia.ORO, "farito@gmail.com");
        Usuario u4 = new Usuario("amaamammam", 18, "gigigi", LocalDate.of(2007,5,2), "4814850", Membresia.BRONCE, "amagi@gmail.com");

        LibroVirtual l1 = new LibroVirtual("Orgullo y prejuicio", Genero.ROMANCE, "OyP.pdf", a1);
        LibroVirtual l5 = new LibroVirtual("Emma", Genero.ROMANCE, "emma.pdf", a1);
        LibroVirtual l6 = new LibroVirtual("Persuación", Genero.ROMANCE, "per.pdf", a1);
        LibroVirtual l2 = new LibroVirtual("Farenheit 451", Genero.SCI_FI, "faren.pdf", a2);
        LibroVirtual l3 = new LibroVirtual("Rebelión en la granja", Genero.SAGA, "rebe.pdf", a3);
        LibroVirtual l4 = new LibroVirtual("1984", Genero.FICCION, "1984.pdf", a3);

        Sistema sistema = new Sistema();
        sistema.agregarLibro(l1);
        sistema.agregarLibro(l2);
        sistema.agregarLibro(l3);
        sistema.agregarLibro(l4);
        sistema.agregarLibro(l5);
        sistema.agregarLibro(l6);
        sistema.agregarUsuario(u1);
        sistema.agregarUsuario(u2);
        sistema.agregarUsuario(u3);
        sistema.agregarUsuario(u4);

        u1.agregarLibro(l1);
        u1.agregarLibro(l2);
        u1.agregarLibro(l3);
        System.out.println("cant libros prestados de: " + u1.getNombre() + " es: " + u1.cantLibrosPrestados());

        u2.agregarLibro(l1);
        u2.agregarLibro(l2);
        u2.agregarLibro(l3);
        u2.agregarLibro(l4);
        u2.agregarLibro(l5);
        System.out.println("cant libros prestados de: " + u2.getNombre() + " es: " + u2.cantLibrosPrestados());

        u3.agregarLibro(l1);
        u3.agregarLibro(l2);
        u3.agregarLibro(l3);
        u3.agregarLibro(l6);
        u3.agregarLibro(l5);
        System.out.println("cant libros prestados de: " + u3.getNombre() + " es: " + u3.cantLibrosPrestados());

        u4.agregarLibro(l6);
        u4.agregarLibro(l3);
        u4.agregarLibro(l4);
        u4.agregarLibro(l5);
        System.out.println("cant libros prestados de: " + u3.getNombre() + " es: " + u3.cantLibrosPrestados());

        System.out.println("Cant prestada por libro: ");
        for(LibroVirtual libro : sistema.getTodosLosLibros()){
            System.out.println(libro.getTitulo() + " - " + libro.getDescargasRealizadas());
        }
    }
}
