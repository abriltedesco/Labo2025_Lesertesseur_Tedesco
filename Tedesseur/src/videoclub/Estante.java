package videoclub;

import personas.Persona;
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
       // Persona d = new Persona("Ti", "west", 40);
       // directores.add(d);
       // Persona a = new Persona("mia", "goth", 26);
       // Persona a2 = new Persona("jenna", "ortega", 28);
        //actores.add(a);
        //actores.add(a2);
        idiomas.add("español");
        idiomas.add("ingles");
        peliculas.add(new Pelicula("X", Genero.TERROR, 105, directores,actores, idiomas));
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

    // ABM
    public void agregarPelicula(Pelicula p) {
        peliculas.add(p);
    }
    public void eliminarPelicula(Pelicula p) {
        peliculas.remove(p);
    }
    public void modificarPelicula(Pelicula p) {
        agregarPelicula(p);
        eliminarPelicula(p);
    }

    // C)
    public void actoresMayores(Pelicula p){
        for (Persona persona : p.getActores()) {
            if(persona.getEdad() > 18){
                System.out.println(persona.getNombre());
            }
        }
    }

}
