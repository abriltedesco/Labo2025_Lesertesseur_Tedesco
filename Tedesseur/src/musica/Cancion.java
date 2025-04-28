package musica;

import unidad1.Persona;

public class Cancion {
    private String titulo;
    private static Persona artista; /* autor */


    public Cancion(String titulo, Persona artista) {
        this.titulo = titulo;
        Cancion.artista = artista;
    }

    public Cancion() {
        this.titulo = "";
        artista = new Persona("", 0, "");
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Persona getArtista() {
        return artista;
    }

    public void setArtista(Persona artista) {
        Cancion.artista = artista;
    }

    public void mostrarArtista(){
        System.out.println(artista.getNombre());
    }

    public static void main(String[] args) {
        Cancion cancion1 = new Cancion("Vroom Vroom", new Persona("Charli XCX", 32, "xxxx"));
        Cancion cancion2 = new Cancion();
        cancion2.setTitulo("Billie Bossa Nova");
        cancion2.setArtista(new Persona ("Billie Eilish", 23, "california" ));

        System.out.println("Canciones: ");
        System.out.println(cancion1.getTitulo());
        cancion1.mostrarArtista();
        System.out.println(cancion2.getTitulo());
        cancion2.mostrarArtista();
    }
}
