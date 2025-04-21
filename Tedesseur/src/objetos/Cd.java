package objetos;

import unidad1.Persona;

import java.util.ArrayList;

public class Cd {
    private String nombre;
    private ArrayList<Cancion> canciones;

    public Cd() {
        this.nombre = "BRAT";
        this.canciones =  new ArrayList<Cancion> ();
        canciones.add(new Cancion( "Von Dutch", new Persona() ));
        canciones.add(new Cancion( "B2b", new Persona() ));
        canciones.add(new Cancion( "Guess", new Persona() ));
        canciones.add(new Cancion( "Club Classics", new Persona() ));
        canciones.add(new Cancion( "Talk Talk", new Persona() ));
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    public int numeroCanciones(){
        int cantidad = 0;
        return cantidad = canciones.size();
    }

    public void verCancion(int posicion){
        System.out.println("Cancion: " + canciones.get(posicion - 1).getTitulo());
    }

    public void grabaCancion(int posicion, Cancion nuevaCancion){
        Cancion cancionAReemplazar = canciones.get(posicion - 1);
        canciones.set(posicion - 1, nuevaCancion);
        System.out.println("Cancion reemplazada : " + cancionAReemplazar.getTitulo());
        System.out.println("Cancion nueva: " + canciones.get(posicion - 1).getTitulo());
    }

    public void agrega(Cancion cancion){
        canciones.add(cancion);
    }


    public void elimina (int posicion){
        canciones.remove(posicion);
    }

    public static void main(String[] args) {
        Cd cd = new Cd();
        Persona persona = new Persona ();
        ArrayList <Cancion> canciones =  new ArrayList<Cancion> ();

        cd.agrega(new Cancion( "360", persona));
        cd.agrega(new Cancion( "365", persona));
        cd.agrega(new Cancion( "Sympathy is a knife", persona));
        cd.agrega(new Cancion( "Girl, so confusing", persona));
        cd.agrega(new Cancion( "Everything is romantic", persona));
        cd.agrega(new Cancion( "Spring breakers", persona));

        System.out.println("Numero de canciones: " + cd.numeroCanciones());
        cd.verCancion(3);
        cd.grabaCancion(3, new Cancion("Apple", persona));
        cd.elimina(11);

    }


}
