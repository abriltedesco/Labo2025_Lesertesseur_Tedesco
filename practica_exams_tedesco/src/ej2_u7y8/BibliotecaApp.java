package ej2_u7y8;

import ej2_u7y8.excepciones.NoPrestableException;
import ej2_u7y8.excepciones.StockInsuficienteException;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;

public class BibliotecaApp {
    public static void main(String[] args) throws NoPrestableException {
        Libro libro1 = new Libro("Emma", "Jane Austen", 1856, 2, false);
        Libro libro2 = new Libro("Orgullo y prejuicio", "Jane Austen", 1858, 30, false);
        Revista revista1 = new Revista("Vogue", "Anna Wintour", 1995, 3, "distribuidora1");
        Revista revista2 = new Revista("Caras", "alguien", 2013, 1, "distribuidora2");
        AudioLibro audio1 = new AudioLibro("Fahrenheit 451", "Ray Bradbury", 1953, 10, 90, 5);
        AudioLibro audio2 = new AudioLibro("Better than the movies", "Lynn Painter", 2021, 50, 70, 5);

        HashSet<Publicacion> leidas1 = new HashSet<>();
        HashSet<Publicacion> leidas2 = new HashSet<>();
        HashSet<Publicacion> leidas3 = new HashSet<>();
        leidas1.add(audio1);
        leidas2.add(audio2);
        HashMap<Publicacion, Integer> prestamos1 =  new HashMap();
        prestamos1.put(revista1, 1);
        Usuario user1 = new Usuario("nombre", "apellido", "user1@gmail.com",  leidas1, LocalDate.of(1993,5,7), 25000, "1");
        Usuario user2 = new Usuario("nombre", "apellido", "user2@gmail.com",  leidas2, LocalDate.of(1999,11,27), 50000, "2");
        Usuario user3 = new Usuario("nombre", "apellido", "user3@gmail.com",  leidas3, LocalDate.of(1999,10,27), 5000, "3");

        HashSet<Publicacion> pubsTotales = new HashSet<>();
        HashSet<Prestable> pubPrestables = new HashSet<>();
        HashSet<Prestamo> prestamos = new HashSet<>();
        HashSet<Usuario> usuarios  = new HashSet<>();
        usuarios.add(user1);
        usuarios.add(user2);
        usuarios.add(user3);

        SistemaBiblioteca sistema = new SistemaBiblioteca(pubsTotales, pubPrestables, prestamos,usuarios);
        sistema.agregarPublicacion(libro1);
        sistema.agregarPublicacion(libro2);
        sistema.agregarPublicacion(revista1);
        sistema.agregarPublicacion(revista2);
        sistema.agregarPublicacion(audio1);
        sistema.agregarPublicacion(audio2);

        try {
            Publicacion encontrada = sistema.buscarPublicacion("Emma");
            if(sistema.getPublicacionesTotales().contains(encontrada)) {
                System.out.println("Titulo: " + encontrada.getTitulo() + ", Autor: " + encontrada.getAutor() + ", Año: " + encontrada.getAnioPublicacion());

                if (encontrada instanceof Prestable) {
                    System.out.println("Si quiere tomelo prestado");
                }
            }
        }
        catch (Exception e) {
            System.out.println("No tenemos ese libro");
        }

        try {
            Publicacion encontrada2 = sistema.buscarPublicacion("fdsg");

            if(sistema.getPublicacionesTotales().contains(encontrada2)) {
                System.out.println("Titulo: " + encontrada2.getTitulo() + ", Autor: " + encontrada2.getAutor() + ", Año: " + encontrada2.getAnioPublicacion());

                if (encontrada2 instanceof Prestable) {
                    System.out.println("Si quiere tomelo prestado");
                }
            }
        }
        catch (Exception e) {
            System.out.println("No tenemos ese libro");
        }

        try {
            sistema.agregarPrestamo(libro1, "2");
            sistema.agregarPrestamo(libro2, "1");
            sistema.agregarPrestamo(revista2, "1");
            sistema.agregarPrestamo(revista1, "3");
            sistema.agregarPrestamo(revista2, "3");
            System.out.println("Prestamos agregados");
        }
        catch (StockInsuficienteException e) {
            System.out.println("No hay stock suficiente");
        }
        catch (NoPrestableException e) {
            System.out.println("No se puede dar a prestamo");
        }

        try {
            sistema.agregarPrestamo(revista2, "3");
        }
        catch (StockInsuficienteException e) {
            System.out.println("No hay stock suficiente");
        }

        try {
            sistema.agregarPrestamo(audio1, "2");
        }
        catch (NoPrestableException e) {
            System.out.println("No se puede dar a prestamo");
        }


        Prestamo prestamoVencido = new Prestamo(libro2, "1", LocalDate.now().minusDays(15));
        try {
            sistema.devolverPrestamo(prestamoVencido, user1);
        } catch (Exception e) {
            System.out.println("Multa libro: " + libro2.calcularMulta());
        }

        try{
            Prestamo prestamo = new Prestamo(libro2, "1", LocalDate.now().minusDays(3));
            sistema.extenderPrestamo(prestamo, user1, 10);
        }
        catch (NoPrestableException e){
            System.out.println(e.getMessage());
        }

    }
}
