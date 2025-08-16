package poblacion;

import java.util.HashSet;

public class Ciudad extends Lugar {
    HashSet<Barrio> barrios;

    public Ciudad(String nombre, String codigo, HashSet<Barrio> barrios) {
        super(nombre, codigo);
        this.barrios = barrios;
    }

    public HashSet<Barrio> getBarrios() {
        return barrios;
    }

    public void setBarrios(HashSet<Barrio> barrios) {
        this.barrios = barrios;
    }

    public void agregarBarrio(Barrio barrio) { barrios.add(barrio); }
    public void borrarBarrio(Barrio barrio) { barrios.remove(barrio); }
    public void modificarBarrio(Barrio barrioNuevo, Barrio barrioViejo) {
        borrarBarrio(barrioViejo);
        agregarBarrio(barrioNuevo);
    }

    @Override
    public int obtenerPoblacion() {
        int total = 0;
        for (Barrio barrio : barrios) {
            total += barrio.obtenerPoblacion();
        }
        return total;
    }

}
