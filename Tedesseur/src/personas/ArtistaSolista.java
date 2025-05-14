package personas;

public class ArtistaSolista extends Persona {
   // private String nombre;
   // private int edad;

    public ArtistaSolista (){
       // this.nombre = "Charli XCX";
       // this.edad = 32;
        super();
    }

    public ArtistaSolista (String nombre, String apellido, int edad){
       // this.nombre = nombre;
       // this.edad = edad;
        super(nombre, apellido, edad);
    }

//   public int getEdad() {
//       return edad;
//   }

//   public String getNombre() {
//       return nombre;
//   }

//   public void setNombre(String nombre) {
//       this.nombre = nombre;
//   }

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
