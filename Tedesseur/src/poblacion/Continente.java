package poblacion;

import java.util.HashSet;

public class Continente extends Lugar {
        HashSet<Pais> paises;

        public Continente(String nombre, String codigo, HashSet<Pais> paises) {
            super(nombre, codigo);
            this.paises = paises;
        }

        public Continente(String nombre, String codigo) {
            super(nombre, codigo);
        }

        public HashSet<Pais> getPaises() {
            return paises;
        }

        public void setPaises(HashSet<Pais> paises) {
            this.paises = paises;
        }

        public void agregarPais(Pais pais) { paises.add(pais); }
        public void borrarPais(Pais pais) { paises.remove(pais); }
        public void modificarPais(Pais paisNuevo, Pais paisViejo) {
            borrarPais(paisViejo);
            agregarPais(paisNuevo);
        }

        @Override
        public int obtenerPoblacion() {
            int total = 0;
            for (Pais pais : this.paises) {
                total += pais.obtenerPoblacion();
            }
            return total;
        }
    }