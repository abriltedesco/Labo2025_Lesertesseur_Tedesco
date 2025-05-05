package unidad2;

import unidad1.Persona;

import java.util.ArrayList;

public class Pelicula {
    private String titulo;
    private String genero;
    private int duracion;
    private ArrayList<Persona> directores;
    private ArrayList<Persona> actores;
    private ArrayList<String> idiomas;

    public Pelicula(){
        this.titulo = "Before Sunrise";
        this.genero = "Romance";
        this.duracion = 90;
        this.directores = new ArrayList<>();
        this.actores = new ArrayList<>();
        Persona actriz = new Persona("Julie Delpy", 43, "Dhggfhgf");
        Persona actor = new Persona("Ethan Hawke", 45, "Hawkgjfjgfe");
        Persona director = new Persona();
        actores.add(actriz);
        actores.add(actor);
        directores.add(director);
        this.idiomas = new ArrayList<>();
        idiomas.add("español");
        idiomas.add("ingles");
        idiomas.add("frances");
        idiomas.add("aleman");
    }

    public Pelicula(String titulo, String genero, int duracion, ArrayList<Persona> directores, ArrayList<Persona> actores, ArrayList<String> idiomas) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
        this.directores = directores;
        this.actores = actores;
        this.idiomas = idiomas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int direccion) {
        this.duracion = direccion;
    }

    public ArrayList<Persona> getActores() {
        return actores;
    }

    public void setActores(ArrayList<Persona> actores) {
        this.actores = actores;
    }

    public ArrayList<Persona> getDirectores() {
        return directores;
    }

    public void setDirectores(ArrayList<Persona> directores) {
        this.directores = directores;
    }

    public ArrayList<String> getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(ArrayList<String> idiomas) {
        this.idiomas = idiomas;
    }
}
