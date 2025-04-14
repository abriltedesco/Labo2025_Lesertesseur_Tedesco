package unidad1;

public class Persona {
    private String nombre;
    private int edad;
    private String direccion;

    public Persona (){
        this.nombre = "Francis";
        this.edad = 17;
        this.direccion = "albarellos 5555";
    }

    public Persona (String nombre, int edad, String dir){
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = dir;
    }

    public void mostrarDatos(Persona p1, Persona p2){
        System.out.println("P1 nombre: " + p1.nombre);
        System.out.println("P1 edad: " + p1.edad);
        System.out.println("P1 dir: " + p1.direccion);
        System.out.println("P2 nombre: " + p2.nombre);
        System.out.println("P2 edad: " + p2.edad);
        System.out.println("P2 dir: " + p2.direccion);
    }

    public static void main(String[] args) {
        Persona p1 = new Persona();
        Persona p2 = new Persona("Clara", 23, "warnes 1564");
        p1.mostrarDatos(p1, p2);
    }
}
