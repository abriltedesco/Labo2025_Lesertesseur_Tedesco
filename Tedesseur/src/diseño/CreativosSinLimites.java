/*package diseño;

import java.util.HashMap;
import java.util.HashSet;

public class CreativosSinLimites {
    private HashSet<Proyecto> proyectos = new HashSet<Proyecto>();
    private HashSet<Diseñador> diseniadores= new HashSet<Diseñador>();
    private static HashMap<Tipo, Double> comisiones = CreativosSinLimites.calculoComisiones();

    public static HashMap<Tipo, Double> calculoComisiones (){
        HashMap<Tipo, Double> comisiones = new HashMap<>();
        comisiones.put(Tipo.UX, 0.08);
        comisiones.put(Tipo.UI, 0.07);
        comisiones.put(Tipo.IT, 0.12);
        return comisiones;
    }

    public CreativosSinLimites(HashSet<Proyecto> proyectos, HashSet<Diseñador> diseniadores) {
        this.proyectos = proyectos;
        this.diseniadores = diseniadores;
    }

    public CreativosSinLimites() {
        this.proyectos = new HashSet<Proyecto>();
        this.diseniadores = new HashSet<Diseñador>();
    }

    public HashSet<Proyecto> getProyectos() {
        return proyectos;
    }

    public void setProyectos(HashSet<Proyecto> proyectos) {
        this.proyectos = proyectos;
    }

    public HashSet<Diseñador> getDiseniadores() {
        return diseniadores;
    }

    public void setDiseniadores(HashSet<Diseñador> diseniadores) {
        this.diseniadores = diseniadores;
    }

    public static HashMap<Tipo, Double> getComisiones() {
        return comisiones;
    }

    public static void setComisiones(HashMap<Tipo, Double> comisiones) {
        CreativosSinLimites.comisiones = comisiones;
    }
}
*/