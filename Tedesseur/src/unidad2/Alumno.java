package unidad2;
import unidad1.Fecha;
import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private String apellido;
    private int edad;
    private Fecha fechaNacimiento;
    private ArrayList<Float> listaDeNotas;
    private ArrayList<Materia> materias;


    public Alumno(String nombre, String apellido, int edad, ArrayList<Float> listaDeNotas, Fecha fechaNacimiento, ArrayList <Materia> materias) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.listaDeNotas = listaDeNotas;
        this.fechaNacimiento = fechaNacimiento;
        this.materias = materias;
    }

    public Alumno() {
        this.nombre = "Carlos";
        this.apellido = "Gardel";
        this.edad = 20;
        this.listaDeNotas = new ArrayList<Float>();
        listaDeNotas.add(3.7F);
        listaDeNotas.add(9.7F);
        listaDeNotas.add(2.5F);
        listaDeNotas.add(3.9F);
        listaDeNotas.add(6.0F);
        this.fechaNacimiento = new Fecha(19, 5, 1954);
        this.materias = new ArrayList<Materia>();
    }

    public Alumno(String nombre, String apellido, Fecha fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = 15;
        this.fechaNacimiento = fechaNacimiento;
        this.listaDeNotas = new ArrayList<Float>();
        listaDeNotas.add(4.7F);
        listaDeNotas.add(9.5F);
        listaDeNotas.add(4.5F);
        listaDeNotas.add(3.9F);
        listaDeNotas.add(7.0F);
        this.materias = new ArrayList<Materia>();
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Float> getListaDeNotas() {
        return listaDeNotas;
    }

    public void setListaDeNotas(ArrayList<Float> listaDeNotas) {
        this.listaDeNotas = listaDeNotas;
    }

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public ArrayList<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList<Materia> materias) {
        this.materias = materias;
    }
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void agregarNota(float nota){
        this.listaDeNotas.add(nota);
    }

    public float menorNota(){
        float menor_nota = this.listaDeNotas.get(0);
        for(Float nota : listaDeNotas){
            if(nota < menor_nota){
                menor_nota = nota;
            }
        }
        return menor_nota;
    }

    public float mayorNota(){
        float mayor_nota = this.listaDeNotas.get(0);;
        for(Float nota : this.listaDeNotas){
            if(nota > mayor_nota){
                mayor_nota = nota;
            }
        }
        return mayor_nota;
    }


    public static void main(String[] args) {

        ArrayList<Float> listaDeNotas1 = new ArrayList<Float>();
        ArrayList<Float> listaDeNotas2 = new ArrayList<Float>();
        ArrayList<Float> listaDeNotas3 = new ArrayList<Float>();

        ArrayList<Materia> materias1 = new ArrayList<Materia>();
        ArrayList<Materia> materias2 = new ArrayList<Materia>();
        ArrayList<Materia> materias3 = new ArrayList<Materia>();

        Alumno alumno1 = new Alumno("Victoria", "Tsai Liao", 15, listaDeNotas1, new Fecha(), materias1 );
        Alumno alumno2 = new Alumno("Clara", "Lesertesseur", 17, listaDeNotas2, new Fecha(20, 3, 2008) , materias2 );
        Alumno alumno3 = new Alumno("Francisco", "Esposito", 19, listaDeNotas3, new Fecha(27, 8, 2007), materias3 );
        Alumno alumno4 = new Alumno("Teo", "Gray", new Fecha(15, 10, 2010));

        alumno1.agregarNota(9.0F);
        alumno1.agregarNota(8.5F);
        alumno1.agregarNota(9.2F);
        alumno1.agregarNota(5.9F);
        alumno1.agregarNota(6.8F);

        alumno2.agregarNota( 7.0F);
        alumno2.agregarNota(9.5F);
        alumno2.agregarNota(8.2F);
        alumno2.agregarNota(9.9F);
        alumno2.agregarNota(7.8F);

        alumno3.agregarNota( 5.0F);
        alumno3.agregarNota(7.5F);
        alumno3.agregarNota(9.2F);
        alumno3.agregarNota(6.9F);
        alumno3.agregarNota(8.8F);

        System.out.println("--- Menores notas ---");
        System.out.println("Alumno 1: " + alumno1.menorNota());
        System.out.println("Alumno 2: " + alumno2.menorNota());
        System.out.println("Alumno 3: " + alumno3.menorNota());
        System.out.println("Alumno 4: " + alumno4.menorNota());

        System.out.println("--- Mayores notas ---");
        System.out.println("Alumno 1: " + alumno1.mayorNota());
        System.out.println("Alumno 2: " + alumno2.mayorNota());
        System.out.println("Alumno 3: " + alumno3.mayorNota());
        System.out.println("Alumno 4: " + alumno4.mayorNota());
    }
}
