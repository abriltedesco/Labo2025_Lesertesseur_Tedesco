package poblacion;

import java.util.HashSet;

public class Pais extends Lugar{
        private HashSet<Provincia> provincias;

        public Pais(String nombre, String codigo, HashSet<Provincia> provincias) {
            super(nombre, codigo);
            this.provincias = provincias;
        }

        public Pais(String nombre, String codigo) {
            super(nombre, codigo);
        }

        public HashSet<Provincia> getProvincias() {
            return provincias;
        }

        public void setProvincias(HashSet<Provincia> provincias) {
            this.provincias = provincias;
        }

        public void agregarprovincia(Provincia provincia) { provincias.add(provincia); }
        public void borrarprovincia(Provincia provincia) { provincias.remove(provincia); }
        public void modificarprovincia(Provincia provinciaNuevo, Provincia provinciaViejo) {
            borrarprovincia(provinciaViejo);
            agregarprovincia(provinciaNuevo);
        }

        @Override
        public int obtenerPoblacion() {
            int total = 0;
            for (Provincia provincia : this.provincias) {
                total += provincia.obtenerPoblacion();
            }
            return total;
        }
    }