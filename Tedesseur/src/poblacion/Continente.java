package poblacion;

import java.util.HashMap;
import java.util.HashSet;

public class Continente extends Lugar {
    HashMap<String, Pais> paises;

    public Continente(String nombre, HashMap<String, Pais> paises) {
        super(nombre);
        this.paises = paises;
    }

    public Continente(String nombre) {
        super(nombre);
    }

    public HashMap<String, Pais> getPaises() {
        return paises;
    }

    public void setPaises(HashMap<String, Pais> paises) {
        this.paises = paises;
    }

    public void agregarPais(String codigo, Pais pais) { paises.put(codigo, pais); }
    public void borrarPais(String codigo) { paises.remove(codigo); }
    public void modificarPais(String codigoNuevo, String codigoViejo, Pais paisNuevo) {
        borrarPais(codigoViejo);
        agregarPais(codigoNuevo, paisNuevo);
    }


    @Override
    public int obtenerPoblacion() {
        int total = 0;
        for (Pais pais : this.paises.values()) {
            total += pais.obtenerPoblacion();
        }
        return total;
    }
}
