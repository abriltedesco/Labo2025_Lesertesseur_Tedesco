package poblacion;

import java.util.HashMap;
import java.util.HashSet;

public class Mundo {
    public static String nombre = "Tierra";
    private HashMap<String, Continente> continentes;

    public Mundo(HashMap<String, Continente> continentes) {
        this.continentes = continentes;
    }

    public Mundo() {
        this.continentes = new HashMap<>();
    }

    public static String getNombre() {
        return nombre;
    }
    public static void setNombre(String nombre) {
        Mundo.nombre = nombre;
    }

    public HashMap<String, Continente> getContinentes() {
        return continentes;
    }

    public void setContinentes(HashMap<String, Continente> continentes) {
        this.continentes = continentes;
    }

    public void agregarContinente(String codigo, Continente cont) { this.continentes.put(codigo, cont); }
    public void borrarContinente(String codigo) { this.continentes.remove(codigo); }
    public void modificarContinente(String codigoNuevo, Continente contNuevo, String codigoViejo) {
        agregarContinente(codigoNuevo, contNuevo);
        borrarContinente(codigoViejo);
    }


    public int conocerPoblacionPorCodigo(String codigo) {
        if (continentes.containsKey(codigo)) {
            return continentes.get(codigo).obtenerPoblacion();
        }
        else{
            for (Continente cont : continentes.values()) {
                if (cont.getPaises().containsKey(codigo)) return cont.getPaises().get(codigo).obtenerPoblacion();
                for (Pais pais : cont.getPaises().values()) {
                    if (pais.getProvincias().containsKey(codigo)) return pais.getProvincias().get(codigo).obtenerPoblacion();
                    for (Provincia prov : pais.getProvincias().values()) {
                        if (prov.getCiudades().containsKey(codigo)) return prov.getCiudades().get(codigo).obtenerPoblacion();
                        for (Ciudad ciudad : prov.getCiudades().values()) {
                            if (ciudad.getBarrios().containsKey(codigo)) return ciudad.getBarrios().get(codigo).getPoblacion();
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

        for(Continente cont : this.continentes.values()) {
            for(Pais pais : cont.getPaises().values()) {
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

        for(Continente cont : this.continentes.values()) {
            for(Pais pais : cont.getPaises().values()) {
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

        for(Continente cont : this.continentes.values()) {
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

        for(Continente cont : this.continentes.values()) {
            int poblacion = cont.obtenerPoblacion();
            if(poblacion < menorPoblacion) {
                menorPoblacion = poblacion;
                menor = cont;
            }
        }
        return menor;
    }

    public static void main(String[] args) {
        Barrio b1 = new Barrio("Palermo", 100000);
        Barrio b2 = new Barrio("Recoleta", 70000);
        Barrio b3 = new Barrio("San Telmo", 40000);
        Ciudad c1 = new Ciudad("Buenos Aires",  new HashMap<>());
        c1.agregarBarrio("B1", b1);
        c1.agregarBarrio("B2", b2);
        c1.agregarBarrio("B3", b3);

        Barrio b4 = new Barrio("Centro",  120000);
        Barrio b5 = new Barrio("Sur", 80000);
        Ciudad c2 = new Ciudad("Córdoba Capital",  new HashMap<>());
        c2.agregarBarrio("B4", b4);
        c2.agregarBarrio("B5", b5);

        Provincia p1 = new Provincia("Buenos Aires Provincia", new HashMap<>());
        p1.agregarciudad("C1", c1);
        Provincia p2 = new Provincia("Córdoba", new HashMap<>());
        p2.agregarciudad("C2", c2);

        Pais pais1 = new Pais("Argentina",  new HashMap<>());
        pais1.agregarprovincia("PR1", p1);
        pais1.agregarprovincia("PR2", p2);

        Barrio b6 = new Barrio("Barrio Viejo",  50000);
        Ciudad c3 = new Ciudad("Montevideo", new HashMap<>());
        c3.agregarBarrio("B6", b6);

        Provincia p3 = new Provincia("Montevideo",  new HashMap<>());
        p3.agregarciudad("C3", c3);

        Pais pais2 = new Pais("Uruguay",  new HashMap<>());
        pais2.agregarprovincia("PR3", p3);

        Continente cont1 = new Continente("América del Sur", new HashMap<>());
        cont1.agregarPais("P1", pais1);
        cont1.agregarPais("P2", pais2);

        Mundo mundo = new Mundo();
        mundo.agregarContinente("CT1", cont1);

        System.out.println("Poblacion de barrio B6: " + mundo.conocerPoblacionPorCodigo("B6"));
        System.out.println("Poblacion de ciudad C1: " + mundo.conocerPoblacionPorCodigo("C1"));
        System.out.println("Poblacion de pais P1: " + mundo.conocerPoblacionPorCodigo("P1"));

        System.out.println("Pais con mayor poblacion: " + mundo.paisMasPoblado().getNombre());
        System.out.println("Pais con menor poblacion: " + mundo.paisMenosPoblado().getNombre());

    }
}

