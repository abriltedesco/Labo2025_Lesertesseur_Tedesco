package musica;

import personas.ArtistaSolista;
import personas.Persona;

public class Cancion {
    private String titulo;
    private ArtistaSolista artista; /* autor */

    public Cancion(String titulo, ArtistaSolista artista) {
        this.artista = artista;
        this.titulo = titulo;
    }

    public Cancion() {
        this.titulo = "Sports Car";
        this.artista = new ArtistaSolista("Tate", "Mcrae", 22);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArtistaSolista getArtista() {
        return artista;
    }

  public void setArtista(ArtistaSolista artista) {
       this.artista = artista;
  }

    public void mostrarArtista(){
        System.out.println(artista.getNombre());
    }

    public static void main(String[] args) {
      Cancion cancion1 = new Cancion("Vroom Vroom", new ArtistaSolista("Charli" ,"XCX", 32));
      Cancion cancion2 = new Cancion();
      cancion2.setTitulo("Billie Bossa Nova");
      cancion2.setArtista(new ArtistaSolista ("Billie", "Eilish", 23 ));


      System.out.println("Canciones: ");
      System.out.println(cancion1.getTitulo());
      cancion1.mostrarArtista();
      System.out.println(cancion2.getTitulo());
      cancion2.mostrarArtista();
    }
}
