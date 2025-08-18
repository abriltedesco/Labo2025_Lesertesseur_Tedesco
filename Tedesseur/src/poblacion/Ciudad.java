package poblacion;

import java.util.HashMap;
import java.util.HashSet;

public class Ciudad extends Lugar {
    HashMap<String, Barrio> barrios;

    public Ciudad(String nombre, HashMap<String, Barrio> barrios) {
        super(nombre);
        this.barrios = barrios;
    }

    public HashMap<String, Barrio> getBarrios() {
        return barrios;
    }

    public void setBarrios(HashMap<String, Barrio> barrios) {
        this.barrios = barrios;
    }



    public void agregarBarrio(String codigo, Barrio barrio) { barrios.put(codigo, barrio); }
    public void borrarBarrio(String codigo) { barrios.remove(codigo); }
    public void modificarBarrio(String codBarrioNuevo, Barrio barrioNuevo, String codBarrioViejo) {
        borrarBarrio(codBarrioViejo);
        agregarBarrio(codBarrioNuevo, barrioNuevo);
    }

    @Override
    public int obtenerPoblacion() {
        int total = 0;
        for (Barrio barrio : barrios.values()) {
            total += barrio.obtenerPoblacion();
        }
        return total;
    }

}
