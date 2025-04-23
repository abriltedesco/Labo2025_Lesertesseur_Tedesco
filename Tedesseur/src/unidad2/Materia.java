package unidad2;

import unidad1.Fecha;

import java.util.ArrayList;

public class Materia {
    String nombre;
    ArrayList <String> listaDeContenidos;
    ArrayList <Alumno> alumnosInscriptos;

    public Materia(String nombre, ArrayList<String> listaDeContenidos, ArrayList<Alumno> alumnosInscriptos) {
        this.nombre = nombre;
        this.listaDeContenidos = listaDeContenidos;
        this.alumnosInscriptos = alumnosInscriptos;
    }
    public Materia() {
        this.nombre = "Laboratorio";
        this.listaDeContenidos =  new ArrayList <String>();
        listaDeContenidos.add("Estructuras");
        listaDeContenidos.add("Vectores");
        listaDeContenidos.add("ArrayLists");
        listaDeContenidos.add("Matrices");
        listaDeContenidos.add("Herencia");
        listaDeContenidos.add("Polimorfismo");
        this.alumnosInscriptos =  new ArrayList <Alumno>();
        Alumno alumno1 = new Alumno();
        Alumno alumno2 = new Alumno("Marcos", "Albarn", new Fecha(30, 06, 2023));
        alumnosInscriptos.add(alumno1);
        alumnosInscriptos.add(alumno2);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getListaDeContenidos() {
        return listaDeContenidos;
    }

    public void setListaDeContenidos(ArrayList<String> listaDeContenidos) {
        this.listaDeContenidos = listaDeContenidos;
    }

    public ArrayList<Alumno> getAlumnosInscriptos() {
        return alumnosInscriptos;
    }

    public void setAlumnosInscriptos(ArrayList<Alumno> alumnosInscriptos) {
        this.alumnosInscriptos = alumnosInscriptos;
    }


    public static void main(String[] args) {
        ArrayList<String> listaDeContenidos2 = new ArrayList<String>()
        ArrayList<String> listaDeContenidos3 = new ArrayList<String>()
        listaDeContenidos2.add("Empresas");
        listaDeContenidos2.add("presupuesto");
        listaDeContenidos2.add("Marketing");
        listaDeContenidos2.add("Planeacion");

        listaDeContenidos3.add("Vistas");
        listaDeContenidos3.add("Funciones");
        listaDeContenidos3.add("Procedimientos");
        listaDeContenidos3.add("Cursores");
        listaDeContenidos3.add("Triggers");

        ArrayList <Alumno> alumnosInscriptos2 = new ArrayList <Alumno>();
        ArrayList <Alumno> alumnosInscriptos3 = new ArrayList <Alumno>();
        Alumno alumno1 = new Alumno();
        Alumno alumno2 = new Alumno("Francisca", "Albarn", new Fecha(13, 6, 2013));
        Alumno alumno3 = new Alumno("Delfina", "Dillom", new Fecha(23, 9, 2023));
        Alumno alumno4 = new Alumno("Amelia", "Cuello", new Fecha(5, 4, 2000));
        alumnosInscriptos2.add(alumno1);
        alumnosInscriptos2.add(alumno2);
        alumnosInscriptos3.add(alumno3);
        alumnosInscriptos3.add(alumno4);
        alumnosInscriptos3.add(alumno2);
        alumnosInscriptos3.add(alumno1);

        Materia materia1 = new Materia();
        Materia materia2 = new Materia("Economia", listaDeContenidos2, alumnosInscriptos2);
        Materia materia3 = new Materia("Base de Datos", listaDeContenidos3, alumnosInscriptos3);
    }
}
