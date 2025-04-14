package unidad1;

public class Persona {
    private String nombre;
    private int edad;
    private String direccion;

    public Persona (){
        this.nombre = "Francis";
        this.edad = 17;
        this.direccion = "Albarellos 5555";
    }

    public Persona (String nombre, int edad, String direccion){
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarDatos(){
        System.out.println("nombre: " + this.nombre);
        System.out.println("edad: " + this.edad);
        System.out.println("direcion: " + this.direccion);
    }

    public static void main(String[] args) {
        Persona p1 = new Persona();
        Persona p2 = new Persona("Clara", 23, "Warnes 1564");
        p1.mostrarDatos();
        p2.mostrarDatos();
    }
}
