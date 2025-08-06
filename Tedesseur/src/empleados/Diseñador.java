package empleados;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Diseñador {
    private HashMap<Proyecto, Double> proyectosConTotal;
    private HashSet<Proyecto> proyectos;
    private Tipo tipo;
    private Comision comision;
    private double sueldo ;

    public Diseñador() {
        this.proyectosConTotal = new HashMap<>();
        this.proyectos = new HashSet<>();
        this.tipo = Tipo.UX;
        this.comision = Comision.UX;
        this.sueldo = 500000;
    }

    public Diseñador(HashMap<Proyecto, Double> proyectosConTotal, HashSet<Proyecto> proyectos, Tipo tipo, Comision comision, double sueldo) {
        this.proyectosConTotal = proyectosConTotal;
        this.proyectos = proyectos;
        this.tipo = tipo;
        this.comision = comision;
        this.sueldo = sueldo;
    }

    public HashMap<Proyecto, Double> getProyectosConTotal() {
        return proyectosConTotal;
    }

    public void setProyectosConTotal(HashMap<Proyecto, Double> proyectosConTotal) {
        this.proyectosConTotal = proyectosConTotal;
    }

    public HashSet<Proyecto> getProyectos() {
        return proyectos;
    }

    public void setProyectos(HashSet<Proyecto> proyectos) {
        this.proyectos = proyectos;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Comision getComision() {
        return comision;
    }

    public void setComision(Comision comision) {
        this.comision = comision;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    // metodos
    public void agregarAlMapa(Proyecto proyecto, double total){
        proyectosConTotal.put(proyecto, total);
    }

    public void calcularTotalRecaudado(){
        for(Proyecto proyecto : this.proyectos){
            double total = proyecto.getDineroRecaudado() * comision.getComision();
            agregarAlMapa(proyecto, total);
        }
    }

    public int cantProyectos(){}

    public void mostrarProyectosConTotalRecaudado(){
        for(Map.Entry<Proyecto, Double> mapa : proyectosConTotal.entrySet() ){
            Proyecto proyecto = mapa.getKey();
            Double totalRecaudado = mapa.getValue();
            System.out.println("Proyecto: " + proyecto.getNombre() + " - Total");
        }
    }
}
