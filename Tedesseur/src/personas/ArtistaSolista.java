package personas;

public class ArtistaSolista extends Persona {
    public ArtistaSolista (){
        super();
    }

    public ArtistaSolista (String nombre, String apellido, int edad){
        super(nombre, apellido, edad);
    }

    public void mostrarDatos(){
        System.out.println("nombre: " + this.getNombre());
        System.out.println("edad: " + this.getEdad());
    }

    public static void main(String[] args) {
        ArtistaSolista p1 = new ArtistaSolista();
        ArtistaSolista p2 = new ArtistaSolista("Charli","XCX", 30);
        p1.mostrarDatos();
        p2.mostrarDatos();
    }
}
