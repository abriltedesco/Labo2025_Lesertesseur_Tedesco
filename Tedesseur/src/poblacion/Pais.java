package poblacion;

import java.util.HashMap;

public class Pais extends Lugar{
    private HashMap<String, Provincia> provincias;

    public Pais(String nombre, HashMap<String, Provincia> provincias) {
        super(nombre);
        this.provincias = provincias;
    }

    public Pais(String nombre) {
        super(nombre);
    }

    public HashMap<String, Provincia> getProvincias() {
        return provincias;
    }

    public void setProvincias(HashMap<String, Provincia> provincias) {
        this.provincias = provincias;
    }

    public void agregarprovincia(String codigo, Provincia provincia) { provincias.put(codigo, provincia); }
    public void borrarprovincia(String codigo) { provincias.remove(codigo); }
    public void modificarprovincia(String codNueva, Provincia provinciaNuevo, String codViejo) {
        borrarprovincia(codViejo);
        agregarprovincia(codNueva, provinciaNuevo);
    }

    @Override
    public int obtenerPoblacion() {
        int total = 0;
        for (Provincia provincia : this.provincias.values()) {
            total += provincia.obtenerPoblacion();
        }
        return total;
    }
}
