package poblacion;

import java.util.HashMap;
import java.util.HashSet;

public class Provincia extends Lugar {
    private HashMap<String, Ciudad> ciudades;

    public Provincia(String nombre, HashMap<String, Ciudad> ciudades) {
        super(nombre);
        this.ciudades = ciudades;
    }

    public HashMap<String, Ciudad> getCiudades() {
        return ciudades;
    }

    public void setCiudades(HashMap<String, Ciudad> ciudades) {
        this.ciudades = ciudades;
    }

    public void agregarciudad(String codigo, Ciudad ciudad) { ciudades.put(codigo, ciudad); }
    public void borrarciudad(String codigo) { ciudades.remove(codigo); }
    public void modificarciudad(Ciudad ciudadNuevo, String codCiudadVieja, String codCiudNueva) {
        borrarciudad(codCiudadVieja);
        agregarciudad(codCiudNueva, ciudadNuevo);
    }

    @Override
    public int obtenerPoblacion() {
        int total = 0;
        for (Ciudad ciudad : this.ciudades.values()) {
            total += ciudad.obtenerPoblacion();
        }
        return total;
    }
}
