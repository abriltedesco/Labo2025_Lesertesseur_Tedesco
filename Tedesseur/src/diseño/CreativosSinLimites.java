package diseño;

import java.util.HashMap;
import java.util.HashSet;

public class CreativosSinLimites {
    private HashSet<Diseñador> diseñadores;
    private HashSet<Proyecto> proyectos;
    private static HashMap<Tipo, Double> comisiones = this.calculoComisiones();

    public static HashMap<Tipo, Double> calculoComisiones (){
        HashMap<Tipo, Double> comisiones = new HashMap<>();
        comisiones.put(Tipo.UX, 0.08);
        comisiones.put(Tipo.UI, 0.07);
        comisiones.put(Tipo.IT, 0.12);
        return comisiones;
    }
}
