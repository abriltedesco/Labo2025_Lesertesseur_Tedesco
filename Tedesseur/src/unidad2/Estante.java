package unidad2;

import unidad1.Persona;

import java.util.ArrayList;

public class Estante {
    private ArrayList<Pelicula> peliculas;
    private int numero;

    public Estante(int numero, ArrayList<Pelicula> peliculas) {
        this.numero = numero;
        this.peliculas = peliculas;
    }

    public Estante() {
        this.numero = 1;
        this.peliculas = new ArrayList<>();
        peliculas.add(new Pelicula());
        ArrayList<Persona> directores = new ArrayList<>();
        ArrayList<Persona> actores = new ArrayList<>();
        ArrayList<String> idiomas = new ArrayList<>();
        Persona d = new Persona("Ti west", 60, "xxxx");
        directores.add(d);
        Persona a = new Persona("mia goth", 26, "xxxx");
        Persona a2 = new Persona("jenna ortega", 28, "xxxx");
        actores.add(a);
        actores.add(a2);
        idiomas.add("español");
        idiomas.add("ingles");
        peliculas.add(new Pelicula("X", "thriller", 105, directores,actores, idiomas));
    }

    public ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(ArrayList<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
