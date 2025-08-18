package poblacion;

import java.util.HashMap;
import java.util.HashSet;

public class Mundo {
    public static String nombre = "Tierra";
    private HashSet<Continente> continentes;
    private HashMap<String, Lugar> lugares;

    public Mundo(HashSet<Continente> continentes) {
        this.continentes = continentes;
    }

    public Mundo() {
        this.continentes = new HashSet<>();
    }

    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        Mundo.nombre = nombre;
    }

    public HashSet<Continente> getContinentes() {
        return continentes;
    }

    public void setContinentes(HashSet<Continente> continentes) {
        this.continentes = continentes;
    }

    public void agregarContinente(Continente cont) { this.continentes.add(cont); }
    public void borrarContinente(Continente cont) { this.continentes.remove(cont); }
    public void modificarContinente(Continente contNuevo, Continente contViejo) {
        agregarContinente(contNuevo);
        borrarContinente(contViejo);
    }


    public int conocerPoblacionPorCodigo(String codigo){
        for(Continente continente : continentes) {
            if(continente.getCodigo().equals(codigo)) return continente.obtenerPoblacion();
            for(Pais pais : continente.getPaises()) {
                if(pais.getCodigo().equals(codigo)) return pais.obtenerPoblacion();
                for(Provincia prov : pais.getProvincias()) {
                    if(prov.getCodigo().equals(codigo)) return prov.obtenerPoblacion();
                    for(Ciudad ciudad : prov.getCiudades()) {
                        if(ciudad.getCodigo().equals(codigo)) return ciudad.obtenerPoblacion();
                        for(Barrio barrio : ciudad.getBarrios()) {
                            if(barrio.getCodigo().equals(codigo)) return barrio.obtenerPoblacion();
                        }
                    }
                }
            }
        }
        return 0;
    }
    public Pais paisMasPoblado() {
        Pais mayor = null;
        int mayorPoblacion = 0;

        for(Continente cont : this.continentes) {
            for(Pais pais : cont.getPaises()) {
                int poblacion = pais.obtenerPoblacion();
                if(poblacion > mayorPoblacion) {
                    mayorPoblacion = poblacion;
                    mayor = pais;
                }
            }
        }
        return mayor;
    }

    public Pais paisMenosPoblado() {
        Pais menor = null;
        int menorPoblacion = Integer.MAX_VALUE;

        for(Continente cont : this.continentes) {
            for(Pais pais : cont.getPaises()) {
                int poblacion = pais.obtenerPoblacion();
                if(poblacion < menorPoblacion) {
                    menorPoblacion = poblacion;
                    menor = pais;
                }
            }
        }
        return menor;
    }

    public Continente continenteMasPoblado() {
        Continente mayor = null;
        int mayorPoblacion = 0;

        for(Continente cont : this.continentes) {
            int poblacion = cont.obtenerPoblacion();
            if(poblacion > mayorPoblacion) {
                mayorPoblacion = poblacion;
                mayor = cont;
            }
        }
        return mayor;
    }

    public Continente continenteMenosPoblado() {
        Continente menor = null;
        int menorPoblacion = Integer.MAX_VALUE;

        for(Continente cont : this.continentes) {
            int poblacion = cont.obtenerPoblacion();
            if(poblacion < menorPoblacion) {
                menorPoblacion = poblacion;
                menor = cont;
            }
        }
        return menor;
    }

    public static void main(String[] args) {
        Barrio b1 = new Barrio("Palermo", "B1", 100000);
        Barrio b2 = new Barrio("Recoleta", "B2", 70000);
        Barrio b3 = new Barrio("San Telmo", "B3", 40000);
        Ciudad c1 = new Ciudad("Buenos Aires", "C1", new HashSet<>());
        c1.agregarBarrio(b1);
        c1.agregarBarrio(b2);
        c1.agregarBarrio(b3);
        Barrio b4 = new Barrio("Centro", "B4", 120000);
        Barrio b5 = new Barrio("Sur", "B5", 80000);
        Ciudad c2 = new Ciudad("Córdoba Capital", "C2", new HashSet<>());
        c2.agregarBarrio(b4);
        c2.agregarBarrio(b5);
        Provincia p1 = new Provincia("Buenos Aires Provincia", "PR1", new HashSet<>());
        p1.agregarciudad(c1);
        Provincia p2 = new Provincia("Córdoba", "PR2", new HashSet<>());
        p2.agregarciudad(c2);
        Pais pais1 = new Pais("Argentina", "P1", new HashSet<>());
        pais1.agregarprovincia(p1);
        pais1.agregarprovincia(p2);

        Barrio b6 = new Barrio("Barrio Viejo", "B6", 50000);
        Ciudad c3 = new Ciudad("Montevideo", "C3", new HashSet<>());
        c3.agregarBarrio(b6);
        Provincia p3 = new Provincia("Montevideo", "PR3", new HashSet<>());
        p3.agregarciudad(c3);
        Pais pais2 = new Pais("Uruguay", "P2", new HashSet<>());
        pais2.agregarprovincia(p3);

        Continente cont1 = new Continente("América del Sur", "CT1", new HashSet<>());
        cont1.agregarPais(pais1);
        cont1.agregarPais(pais2);

        Mundo mundo = new Mundo();
        mundo.agregarContinente(cont1);
        System.out.println("Poblacion de barrio 6 : " + mundo.conocerPoblacionPorCodigo("B6") );
        System.out.println("Poblacion de ciudad 1 : " + mundo.conocerPoblacionPorCodigo("C1") );
        System.out.println("Poblacion de pais 6 : " + mundo.conocerPoblacionPorCodigo("P1") ) ;
        System.out.println("Pais con mayor poblacion: " + mundo.paisMasPoblado().getNombre());
        System.out.println("Pais con menor poblacion: " + mundo.paisMenosPoblado().getNombre());
    }
}