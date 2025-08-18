package poblacion;

import java.util.HashSet;

public class Provincia extends Lugar {
    private HashSet<Ciudad> ciudades;

    public Provincia(String nombre, String codigo, HashSet<Ciudad> ciudades) {
        super(nombre, codigo);
        this.ciudades = ciudades;
    }

    public HashSet<Ciudad> getCiudades() {
        return ciudades;
    }

    public void setCiudades(HashSet<Ciudad> ciudades) {
        this.ciudades = ciudades;
    }
    public void agregarciudad(Ciudad ciudad) { ciudades.add(ciudad); }
    public void borrarciudad(Ciudad ciudad) { ciudades.remove(ciudad); }
    public void modificarciudad(Ciudad ciudadNuevo, Ciudad ciudadViejo) {
        borrarciudad(ciudadViejo);
        agregarciudad(ciudadNuevo);
    }

    @Override
    public int obtenerPoblacion() {
        int total = 0;
        for (Ciudad ciudad : this.ciudades) {
            total += ciudad.obtenerPoblacion();
        }
        return total;
    }
}