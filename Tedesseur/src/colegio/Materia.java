package colegio;
import personas.Alumno;
import fecha.Fecha;

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
        Alumno alumno2 = new Alumno("Marcos", "Albarn", new Fecha(30, 6, 2023));
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

    public int promedioEdadAlumnos(){
        int promedio = 0;
        for(Alumno alumno : this.alumnosInscriptos){
            promedio += alumno.getEdad();
        }
        return promedio / this.alumnosInscriptos.size();
    }

    public void agregarAlumno(Alumno alumno){
        this.alumnosInscriptos.add(alumno);
    }
}