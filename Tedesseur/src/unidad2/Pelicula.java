package unidad2;

import java.util.ArrayList;

public class Pelicula {
    private String titulo;
    private String genero;
    private int duracion;
    private ArrayList<Cast> cast;
    private ArrayList<String> idiomas;

    public Pelicula(){
        this.titulo = "Before Sunrise";
        this.genero = "Romance";
        this.duracion = 90;
        this.cast = new ArrayList<>();
        Cast actriz = new Cast("Julie", false, "Delpy");
        Cast actor = new Cast("Ethan", false, "Hawke");
        Cast director = new Cast();
        cast.add(actriz);
        cast.add(actor);
        cast.add(director);
        this.idiomas = new ArrayList<>();
        idiomas.add("español");
        idiomas.add("ingles");
        idiomas.add("frances");
        idiomas.add("aleman");
    }

    public Pelicula(String titulo, String genero, int duracion, ArrayList<Cast> cast, ArrayList<String> idiomas) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
        this.cast = cast;
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

    public ArrayList<Cast> getCast() {
        return cast;
    }

    public void setCast(ArrayList<Cast> cast) {
        this.cast = cast;
    }

    public ArrayList<String> getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(ArrayList<String> idiomas) {
        this.idiomas = idiomas;
    }
}
