package videoclub;

import personas.Persona;

import java.util.ArrayList;

public class Pelicula {
    private String titulo;
    private Genero genero;
    private int duracion;
    private ArrayList<Persona> directores;
    private ArrayList<Persona> actores;
    private ArrayList<String> idiomas;

    // constructores
    public Pelicula(){
        this.titulo = "Before Sunrise";
        this.genero = Genero.ROMANCE;
        this.duracion = 90;
        this.directores = new ArrayList<>();
        this.actores = new ArrayList<>();
       // Persona actriz = new Persona("Julie", "Delpy", 43);
       // Persona actor = new Persona("Ethan", "Hawke", 45);
       // Persona director = new Persona();
     //  actores.add(actriz);
     //  actores.add(actor);
     //  directores.add(director);
        this.idiomas = new ArrayList<>();
        idiomas.add("español");
        idiomas.add("ingles");
        idiomas.add("frances");
        idiomas.add("aleman");
    }

    public Pelicula(String titulo, Genero genero, int duracion, ArrayList<Persona> directores, ArrayList<Persona> actores, ArrayList<String> idiomas) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
        this.directores = directores;
        this.actores = actores;
        this.idiomas = idiomas;
    }

    // getters y setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
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

    // metodos pedidos

        // a) ABM
    public void bajaActor(Persona persona) {
        this.actores.remove(persona);
    }
    public void bajaDirector(Persona persona) {
        this.directores.remove(persona);
    }
    public void altaActor(Persona persona) {
        this.actores.add(persona);
    }
    public void altaDirector(Persona persona) {
        this.directores.add(persona);
    }
    public void altaIdiomas(String idioma) {
        this.idiomas.add(idioma);
    }
    public void bajaIdiomas(String idioma) {
        this.idiomas.remove(idioma);
    }

    public void modificarActor(Persona actorNuevo, Persona actorViejo){
        altaActor(actorNuevo);
        bajaActor(actorViejo);
    }

    public void modificarDirector(Persona directorNuevo, Persona directorViejo){
        altaDirector(directorNuevo);
        bajaDirector(directorViejo);
    }

    public void modificarIdiomas(String idiomasViejo, String idiomaNuevo){
        altaIdiomas(idiomaNuevo);
        bajaIdiomas(idiomaNuevo);
    }


}
