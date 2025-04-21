package unidad2;
import unidad1.Fecha;

import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private String apellido;
    private Fecha fechaNacimiento;
    private ArrayList<Float> listaDeNotas;

    public Alumno(String nombre, String apellido, ArrayList<Float> listaDeNotas, Fecha fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.listaDeNotas = listaDeNotas;
        this.fechaNacimiento = fechaNacimiento;
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

    public void agregarNota(ArrayList<Float> listaDeNotas, float nota){
        listaDeNotas.add(nota);
    }

    public float menorNota(){
        float menor_nota = 0;
        return menor_nota;
    }

    public float mayorNota(){
        float mayor_nota = 0;
        return mayor_nota;
    }

    public static void main(String[] args) {
        ArrayList<Float> listaDeNotas1 = new ArrayList<Float>();
        ArrayList<Float> listaDeNotas2 = new ArrayList<Float>();
        ArrayList<Float> listaDeNotas3 = new ArrayList<Float>();

        Alumno alumno1 = new Alumno("Victoria", "Tsai Liao", listaDeNotas1, new Fecha());
        Alumno alumno2 = new Alumno("Clara", "Lesertesseur", listaDeNotas2, new Fecha(20, 3, 2008));
        Alumno alumno3 = new Alumno("Francisco", "Esposito", listaDeNotas3, new Fecha(27, 8, 2007));
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
    }
}
