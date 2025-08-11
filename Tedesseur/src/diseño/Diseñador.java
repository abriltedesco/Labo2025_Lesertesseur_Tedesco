package diseño;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Diseñador {
    private static HashMap<Proyecto, Double> proyectosConTotal ;
    private Tipo tipo;
    private double sueldo ;

    public Diseñador() {
        this.proyectosConTotal = new HashMap<>();;
        Proyecto p = new Proyecto("spotify", "reproductor musica", 600000);
        this.tipo = Tipo.UX;
        this.sueldo = 500000;
    }

    public Diseñador(HashMap<Proyecto, Double> proyectosConTotal, HashSet<Proyecto> proyectos, Tipo tipo, Comision comision, double sueldo) {
        this.proyectosConTotal = proyectosConTotal;
        this.tipo = tipo;
        this.sueldo = sueldo;
    }

    public HashMap<Proyecto, Double> getProyectosConTotal() {
        return proyectosConTotal;
    }

    public void setProyectosConTotal(HashMap<Proyecto, Double> proyectosConTotal) {
        this.proyectosConTotal = proyectosConTotal;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    // metodos
    public void agregarAlMapa(Proyecto proyecto, double total){
        proyectosConTotal.put(proyecto, calcularComision());
    }

    public calcularComision(){

    }

    public void calcularTotalRecaudado(){
        for(Proyecto proyecto : this.proyectos){
            double total = proyecto.getDineroRecaudado() + (proyecto.getDineroRecaudado() * comision.getComision());
            agregarAlMapa(proyecto, total);
        }
    }

    public int cantProyectos(){
        return this.proyectos.size();
    }


    public void mostrarProyectosConTotalRecaudado(){
        for(Map.Entry<Proyecto, Double> mapa : proyectosConTotal.entrySet() ){
            Proyecto proyecto = mapa.getKey();
            Double totalRecaudado = mapa.getValue();
            System.out.println("Proyecto: " + proyecto.getNombre() + " - Total:" + totalRecaudado);
        }
    }

    public double conocerComision(Proyecto proyecto, double totalRecaudado){
        double comision = 0;
        for(Proyecto p : this.proyectos){
            if (p.getNombre().equalsIgnoreCase(proyecto.getNombre())) {
                comision = totalRecaudado - p.getDineroRecaudado();
            }
        }
        return comision;
    }

    public void calcularSueldoConComision(){
        double sueldoConComision = 0;
        for(Map.Entry<Proyecto, Double> mapa : proyectosConTotal.entrySet() ){
            Proyecto proyecto = mapa.getKey();
            Double totalRecaudado = mapa.getValue();
            sueldoConComision += conocerComision(proyecto, totalRecaudado);
        }
        this.setSueldo(getSueldo() + sueldoConComision);
    }

    // sin comision
    public double cuantoGano(String nombreProyecto){
        double total = 0;
        for(Proyecto proyecto : this.proyectos){
            if (proyecto.getNombre().equalsIgnoreCase(nombreProyecto)) {
                total = proyecto.getDineroRecaudado();
            }
        }
        return total;
    }

    public void mostrarDetalleProyecto(){
        for(Map.Entry<Proyecto, Double> mapa : proyectosConTotal.entrySet() ){
            Proyecto proyecto = mapa.getKey();
            Double totalRecaudado = mapa.getValue();
            System.out.println("Proyecto: " + proyecto.getNombre() + " - Total: " + totalRecaudado + " - Comisión: " + totalRecaudado * comision.getComision());
        }
    }

}
