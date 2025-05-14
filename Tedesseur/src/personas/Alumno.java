package personas;
import colegio.Materia;

import java.time.LocalDate;
import java.util.ArrayList;

public class Alumno extends Persona {
    // private String nombre;
   // private String apellido;
   // private int edad;
    // private Fecha fechaNacimiento;
    private ArrayList<Float> listaDeNotas;
    private ArrayList<Materia> listaMaterias;


    public Alumno(String nombre, String apellido, int edad, ArrayList<Float> listaDeNotas, LocalDate fechaNacimiento, ArrayList <Materia> listaMaterias) {
       // this.nombre = nombre;
        // this.apellido = apellido;
      //  this.edad = edad;
        super(nombre, edad, apellido, fechaNacimiento);
        this.listaDeNotas = listaDeNotas;
       // this.fechaNacimiento = fechaNacimiento;
        this.listaMaterias = listaMaterias;
    }

    public Alumno() {
      //  this.nombre = "Carlos";
      //  this.apellido = "Gardel";
      //  this.edad = 20;
        super();
        this.listaDeNotas = new ArrayList<Float>();
        listaDeNotas.add(3.7F);
        listaDeNotas.add(9.7F);
        listaDeNotas.add(2.5F);
        listaDeNotas.add(3.9F);
        listaDeNotas.add(6.0F);
     //   this.fechaNacimiento = new Fecha(19, 5, 1954);
        this.listaMaterias = new ArrayList<Materia>();
    }

    public Alumno(String nombre, int edad, String apellido, LocalDate fechaNacimiento) {
       // this.nombre = nombre;
      ////  this.apellido = apellido;
       // this.edad = 15;
       // this.fechaNacimiento = fechaNacimiento;
        super(nombre, edad, apellido, fechaNacimiento);
        this.listaDeNotas = new ArrayList<Float>();
        listaDeNotas.add(4.7F);
        listaDeNotas.add(9.5F);
        listaDeNotas.add(4.5F);
        listaDeNotas.add(3.9F);
        listaDeNotas.add(7.0F);
        this.listaMaterias = new ArrayList<Materia>();
    }


   // public String getNombre() {
   //     return nombre;
   // }
//
   // public void setNombre(String nombre) {
   //     this.nombre = nombre;
   // }

    public ArrayList<Float> getListaDeNotas() {
        return listaDeNotas;
    }

    public void setListaDeNotas(ArrayList<Float> listaDeNotas) {
        this.listaDeNotas = listaDeNotas;
    }

// public Fecha getFechaNacimiento() {
//     return fechaNacimiento;
// }

// public void setFechaNacimiento(Fecha fechaNacimiento) {
//     this.fechaNacimiento = fechaNacimiento;
// }

// public String getApellido() {
//     return apellido;
// }

// public void setApellido(String apellido) {
//     this.apellido = apellido;
// }

    public ArrayList<Materia> getlistaMaterias() {
        return listaMaterias;
    }

    public void setlistaMaterias(ArrayList<Materia> listaMaterias) {
        this.listaMaterias = listaMaterias;
    }


  // public void setEdad(int edad) {
  //     this.edad = edad;
  // }  public int getEdad() {
  //     return edad;
  // }

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

    public float promedioNotas(){
        float promedio = 0F;
        for (Float nota : this.listaDeNotas){
            promedio += nota;
        }
        return promedio / this.listaDeNotas.size();
    }

    public void agregarMateria(Materia materia){
        listaMaterias.add(materia); // añade materia al alumno
        materia.agregarAlumno(this);
    }

    public static void main(String[] args) {
        // CREANDO
        ArrayList<Float> listaDeNotas1 = new ArrayList<Float>();
        ArrayList<Float> listaDeNotas2 = new ArrayList<Float>();
        ArrayList<Float> listaDeNotas3 = new ArrayList<Float>();

        ArrayList<Materia> listaMaterias1 = new ArrayList<Materia>();
        ArrayList<Materia> listaMaterias2 = new ArrayList<Materia>();
        ArrayList<Materia> listaMaterias3 = new ArrayList<Materia>();

        Alumno alumno1 = new Alumno("Victoria", "Tsai Liao", 15, listaDeNotas1, LocalDate.of(2005, 12, 29), listaMaterias1 );
        Alumno alumno2 = new Alumno("Clara", "Lesertesseur", 17, listaDeNotas2, LocalDate.of(2008, 2, 3) , listaMaterias2 );
        Alumno alumno3 = new Alumno("Francisco", "Esposito", 19, listaDeNotas3, LocalDate.of( 2007, 7, 8), listaMaterias3 );
        Alumno alumno4 = new Alumno("Teo", 15, "Gray", LocalDate.of(2010, 10, 15));

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

        alumno3.agregarNota(5.0F);
        alumno3.agregarNota(7.5F);
        alumno3.agregarNota(9.2F);
        alumno3.agregarNota(6.9F);
        alumno3.agregarNota(8.8F);

        alumno4.agregarNota(5.5F);
        alumno4.agregarNota(9.5F);
        alumno4.agregarNota(8.2F);
        alumno4.agregarNota(6.5F);
        alumno4.agregarNota(8.8F);

        System.out.println("--- Menores notas ---");
        System.out.println("Alumno 1: " + alumno1.menorNota());
        System.out.println("Alumno 2: " + alumno2.menorNota());
        System.out.println("Alumno 3: " + alumno3.menorNota());
        System.out.println("Alumno 4: " + alumno4.menorNota());
        System.out.println();
        System.out.println("--- Mayores notas ---");
        System.out.println("Alumno 1: " + alumno1.mayorNota());
        System.out.println("Alumno 2: " + alumno2.mayorNota());
        System.out.println("Alumno 3: " + alumno3.mayorNota());
        System.out.println("Alumno 4: " + alumno4.mayorNota());
        System.out.println();
        System.out.println("--- Promedios ---");
        System.out.println("Alumno 1: " + alumno1.promedioNotas());
        System.out.println("Alumno 2: " + alumno2.promedioNotas());
        System.out.println("Alumno 3: " + alumno3.promedioNotas());
        System.out.println("Alumno 4: " + alumno4.promedioNotas());


        ArrayList<String> listaDeContenidos2 = new ArrayList<String>();
        ArrayList<String> listaDeContenidos3 = new ArrayList<String>();
        listaDeContenidos2.add("Empresas");
        listaDeContenidos2.add("Presupuesto");
        listaDeContenidos2.add("Marketing");
        listaDeContenidos2.add("Planeacion");

        listaDeContenidos3.add("Vistas");
        listaDeContenidos3.add("Funciones");
        listaDeContenidos3.add("Procedimientos");
        listaDeContenidos3.add("Cursores");
        listaDeContenidos3.add("Triggers");

        ArrayList <Alumno> alumnosInscriptos2 = new ArrayList <Alumno>();
        ArrayList <Alumno> alumnosInscriptos3 = new ArrayList <Alumno>();
        alumnosInscriptos2.add(alumno2);
        alumnosInscriptos2.add(alumno4);
        alumnosInscriptos2.add(alumno1);
        alumnosInscriptos3.add(alumno3);
        alumnosInscriptos3.add(alumno4);
        alumnosInscriptos3.add(alumno1);
        alumnosInscriptos3.add(alumno1);

        Materia materia1 = new Materia();
        Materia materia2 = new Materia("Economia", listaDeContenidos2, alumnosInscriptos2);
        Materia materia3 = new Materia("Base de Datos", listaDeContenidos3, alumnosInscriptos3);

        alumno1.agregarMateria(materia1);
        alumno2.agregarMateria(materia3);
        alumno3.agregarMateria(materia3);
        alumno4.agregarMateria(materia2);
        alumno4.agregarMateria(materia1);

        System.out.println();
        System.out.println("------Promedio EDADES--------");
        System.out.println(materia1.getNombre() + ": " + materia1.promedioEdadAlumnos());
        System.out.println(materia2.getNombre() + ": " + materia2.promedioEdadAlumnos());
        System.out.println(materia3.getNombre() + ": " + materia3.promedioEdadAlumnos());
    }
}
