package unidad2;
import unidad1.Fecha;
import unidad2.Materia;
import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private String apellido;
    private Fecha fechaNacimiento;
    private ArrayList<Float> listaDeNotas;
    private ArrayList<Materia> materias;


    public Alumno(String nombre, String apellido, ArrayList<Float> listaDeNotas, Fecha fechaNacimiento, ArrayList <Materia> materias) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.listaDeNotas = listaDeNotas;
        this.fechaNacimiento = fechaNacimiento;
        this.materias = materias;
    }

    public Alumno() {
        this.nombre = "Carlos";
        this.apellido = "Gardel";
        this.listaDeNotas = new ArrayList<Float>();
        listaDeNotas.add(3.7F);
        listaDeNotas.add(9.7F);
        listaDeNotas.add(2.5F);
        listaDeNotas.add(3.9F);
        listaDeNotas.add(6.0F);
        this.fechaNacimiento = new Fecha(19, 5, 1954);
        this.materias = new ArrayList<Materia>();
        Materia materia = new Materia();
        materias.add(materia);
    }

    public Alumno(String nombre, String apellido, Fecha fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;

        this.listaDeNotas = new ArrayList<Float>();
        listaDeNotas.add(4.7F);
        listaDeNotas.add(9.5F);
        listaDeNotas.add(4.5F);
        listaDeNotas.add(3.9F);
        listaDeNotas.add(7.0F);
        this.materias = new ArrayList<Materia>();
        Materia materia = new Materia();
        materias.add(materia);
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

    public void agregarNota(ArrayList<Float> listaDeNotas, float nota){
        listaDeNotas.add(nota);
    }

    public float menorNota(ArrayList<Float> listaDeNotas){
        float menor_nota = 10;
        for(Float nota : listaDeNotas){
            if(nota < menor_nota){
                menor_nota = nota;
            }
        }
        return menor_nota;
    }

    public float mayorNota(ArrayList<Float> listaDeNotas){
        float mayor_nota = 0;
        for(Float nota : listaDeNotas){
            if(nota > mayor_nota){
                mayor_nota = nota;
            }
        }
        return mayor_nota;
    }

    public double promedioEdadAlumnos(){

    }

    public void agregarAlumnos(ArrayList <Alumno> listaAlumnosCompleta){
        for(Materia materia : materias){
            listaAlumnosCompleta.addAll(materia.alumnosInscriptos);
        }
    }

    public static void main(String[] args) {

        ArrayList<Float> listaDeNotas1 = new ArrayList<Float>();
        ArrayList<Float> listaDeNotas2 = new ArrayList<Float>();
        ArrayList<Float> listaDeNotas3 = new ArrayList<Float>();

        ArrayList<Materia> materias1 = new ArrayList<Materia>();
        ArrayList<Materia> materias2 = new ArrayList<Materia>();
        ArrayList<Materia> materias3 = new ArrayList<Materia>();

        Alumno alumno1 = new Alumno("Victoria", "Tsai Liao", listaDeNotas1, new Fecha(), materias1 );
        Alumno alumno2 = new Alumno("Clara", "Lesertesseur", listaDeNotas2, new Fecha(20, 3, 2008) , materias2 );
        Alumno alumno3 = new Alumno("Francisco", "Esposito", listaDeNotas3, new Fecha(27, 8, 2007), materias3 );

        alumno1.agregarNota(listaDeNotas1, 9.0F);
        alumno1.agregarNota(listaDeNotas1, 8.5F);
        alumno1.agregarNota(listaDeNotas1, 9.2F);
        alumno1.agregarNota(listaDeNotas1, 5.9F);
        alumno1.agregarNota(listaDeNotas1, 6.8F);

        alumno2.agregarNota(listaDeNotas2, 7.0F);
        alumno2.agregarNota(listaDeNotas2,9.5F);
        alumno2.agregarNota(listaDeNotas2,8.2F);
        alumno2.agregarNota(listaDeNotas2,9.9F);
        alumno2.agregarNota(listaDeNotas2,7.8F);

        alumno3.agregarNota(listaDeNotas3, 5.0F);
        alumno3.agregarNota(listaDeNotas3,7.5F);
        alumno3.agregarNota(listaDeNotas3,9.2F);
        alumno3.agregarNota(listaDeNotas3,6.9F);
        alumno3.agregarNota(listaDeNotas3,8.8F);

        System.out.println("--- Menores notas ---");
        System.out.println("Alumno 1: " + alumno1.menorNota(listaDeNotas1));
        System.out.println("Alumno 2: " + alumno2.menorNota(listaDeNotas2));
        System.out.println("Alumno 3: " + alumno3.menorNota(listaDeNotas3));

        System.out.println("--- Mayores notas ---");
        System.out.println("Alumno 1: " + alumno1.mayorNota(listaDeNotas1));
        System.out.println("Alumno 2: " + alumno2.mayorNota(listaDeNotas2));
        System.out.println("Alumno 3: " + alumno3.mayorNota(listaDeNotas3));

        ArrayList <Alumno> listaAlumnosCompleta  = new ArrayList<>();
        listaAlumnosCompleta.add(alumno1);
        listaAlumnosCompleta.add(alumno2);
        listaAlumnosCompleta.add(alumno3);
        agregarAlumnos(listaAlumnosCompleta);
    }
}
