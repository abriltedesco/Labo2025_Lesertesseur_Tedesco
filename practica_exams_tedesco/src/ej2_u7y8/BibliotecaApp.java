package ej2_u7y8;

import ej2_u7y8.excepciones.NoPrestableException;
import ej2_u7y8.excepciones.StockInsuficienteException;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;

public class BibliotecaApp {
    public static void main(String[] args) throws NoPrestableException {
        Publicacion libro1 = new Publicacion("Emma", "Jane Austen", 1856, 2);
        Publicacion libro2 = new Publicacion("Orgullo y prejuicio", "Jane Austen", 1858, 30);
        Publicacion revista1 = new Publicacion("Vogue", "Anna Wintour", 1995, 3);
        Publicacion revista2 = new Publicacion("Caras", "alguien", 2013, 1);
        Publicacion audio1 = new Publicacion("Fahrenheit 451", "Ray Bradbury", 1953, 10);
        Publicacion audio2 = new Publicacion("Better than the movies", "Lynn Painter", 2021, 50);

        HashSet<Publicacion> leidas1 = new HashSet<>();
        leidas1.add(audio1);
        HashMap<Publicacion, Integer> prestamos1 =  new HashMap();
        prestamos1.put(revista1, 1);
        Usuario user1 = new Usuario("nombre", "apellido", "user1@gmail.com",  LocalDate.of(1993,5,7), );

        HashSet<Publicacion> pubsTotales = new HashSet<>();
        HashSet<Prestable> pubPrestables = new HashSet<>();
        HashSet<Prestamo> prestamos = new HashSet<>();
        HashSet<Usuario> usuarios  = new HashSet<>();;
        SistemaBiblioteca sistema = new SistemaBiblioteca(pubsTotales, pubPrestables, prestamos,usuarios);

        try {
            Publicacion encontrada = sistema.buscarPublicacion("Emma");
            System.out.println("Titulo: " + encontrada.getTitulo() + ", Autor: " + encontrada.getAutor() + ", Año: " + encontrada.getAnioPublicacion());
            if (encontrada instanceof Prestable) {
                System.out.println("Si quiere tomelo prestado");
            }
        } catch (Exception e) {
            System.out.println("No tenemos ese libro");
        }

        try {
            sistema.agregarPrestamo(libro1, "2");
            sistema.agregarPrestamo(libro2, "1");
            sistema.agregarPrestamo(revista2, "1");
            sistema.agregarPrestamo(revista1, "3");
            sistema.agregarPrestamo(revista2, "3");
        } catch (StockInsuficienteException e) {
            System.out.println("No hay stock suficiente");
        } catch (NoPrestableException e) {
            System.out.println("No se puede dar en prestamo");
        }
    }
}
