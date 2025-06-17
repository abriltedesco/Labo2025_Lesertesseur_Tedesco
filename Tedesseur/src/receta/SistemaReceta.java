package receta;

import java.util.ArrayList;
import java.util.Arrays;

public class SistemaReceta {
    private ArrayList<Receta> recetas;

    public SistemaReceta(ArrayList<Receta> recetas) {
        this.recetas = recetas;
    }
    public SistemaReceta() {
        this.recetas = new ArrayList<>();
    }

    public ArrayList<Receta> getRecetas() {
        return recetas;
    }

    public void setRecetas(ArrayList<Receta> recetas) {
        this.recetas = recetas;
    }

    // abm recetas
    public void agregarReceta (Receta receta){
        this.recetas.add(receta);
    }

    public void bajarReceta (Receta receta){
        this.recetas.remove(receta);
    }

    public void modificarReceta(Receta nueva, Receta vieja){
        this.agregarReceta(nueva);
        this.bajarReceta(vieja);
    }

    // cant
    public int cantRecetasCargadas(){
        return this.recetas.size();
    }

    public Receta recetaConMasCantPasos (){
        Receta masLarga = new Receta();
        for(Receta receta: this.recetas){
            receta.cantPasosReceta() > masLarga.cantPasosReceta()? masLarga = receta;
        }
        return masLarga;
    }

    public ArrayList<Receta> recetasPorDificultad (Dificultad dificultad){
        ArrayList<Receta> recetitas = new ArrayList<>();
        for(Receta receta : this.recetas) {
            if (receta.getDificultad() == dificultad) {
                recetitas.add(receta);
            }
        }
        return recetitas;
    }

    // con un solo if
    public ArrayList<Receta> listaPorTipo(Tipo tipo){
        ArrayList<Receta> lista = new ArrayList<>();
        for(Receta receta : this.recetas) {
            Plato plato = receta.getPlato();
            if (plato.esDelTipo(tipo)) {
                lista.add(p);
            }
        }
        return lista;
    }

    // con varios if (por si se quiere tener lista de cada uno)
    /* 
    public void filtrarRecetasPorTipo (Tipo tipo){
        ArrayList<Receta> entradas = new ArrayList<>();
        ArrayList<Receta> postres = new ArrayList<>();
        ArrayList<Receta> principales = new ArrayList<>();

        for(Receta receta : this.recetas) {
            Plato plato = receta.getPlato();
            if (plato.esDelTipo(Tipo.ENTRADA)) {
                entradas.add(receta);
            } 
            else if (plato.esDelTipo(Tipo.POSTRE)) {
                postres.add(receta);
            } 
            else {
                principales.add(receta);
            }
        }

    }
    */

    public static void main(String[] args) {
        SistemaReceta sistema = new SistemaReceta();

        ArrayList<String> pasosEntrada = new ArrayList<>();
        pasosEntrada.add("Lavar lechuga");
        pasosEntrada.add("Cortar tomate");
        pasosEntrada.add("Agregar aderezo");
        pasosEntrada.add("Mezclar ingredientes");
        pasosEntrada.add("Servir en plato hondo");

        ArrayList<String> pasosPrincipal = new ArrayList<>();
        pasosPrincipal.add("Preparar la parrilla");
        pasosPrincipal.add("Colocar la carne en la parrilla");
        pasosPrincipal.add("Cocinar durante 1 hora");
        pasosPrincipal.add("Servir con ensalada");

        ArrayList<String> pasosPostre = new ArrayList<>();
        pasosPostre.add("Acomodar galltetitas");
        pasosPostre.add("Batir queso crema y ddl");
        pasosPostre.add("Hechar la mezcla sobre las galletitas");
        pasosPostre.add("Dejar por 3 horas en la heladera");

        ArrayList<String> pasosEntrada2 = new ArrayList<>();
        pasosEntrada2.add("Cortar salmón");
        pasosEntrada2.add("Preparar salsa");
        pasosEntrada2.add("Servir con limón");

        ArrayList<String> pasosPrincipal1 = new ArrayList<>();
        pasosPrincipal1.add("Salpimentar pollo");
        pasosPrincipal1.add("Cocinar al horno");
        pasosPrincipal1.add("Servir caliente");

        ArrayList<String> pasosPrincipal2 = new ArrayList<>();
        pasosPrincipal2.add("Hervir fideos");
        pasosPrincipal2.add("Preparar salsa bolognesa");
        pasosPrincipal2.add("Mezclar y servir");

        ArrayList<String> pasosPostre1 = new ArrayList<>();
        pasosPostre1.add("Batir huevos y azúcar");
        pasosPostre1.add("Hornear"); 
        pasosPostre1.add("Decorar con frutas");

        ArrayList<String> pasosPostre2 = new ArrayList<>();
        pasosPostre2.add("Preparar masa");
        pasosPostre2.add("Agregar dulce de leche");
        pasosPostre2.add("Hornear"); 
        pasosPostre2.add("Espolvorear azúcar impalpable");


        Receta entrada2 = new Entrada("Salmón Gravlax", Dificultad.MEDIO, pasosEntrada2, Temperatura.FRIA);
        Receta entrada = new Receta(new Entrada("Ensalada Caesar", pasosEntrada,Tipo.ENTRADA, Temperatura.FRIA),  Dificultad.FACIL);
        Receta principal = new Receta(new Principal("Asado", pasosPrincipal, Tipo.PRINCIPAL, 120, 6),  Dificultad.AVANZADO);
        Receta principal1 = new Receta(new Principal("Pollo al horno", pasosPrincipal1, Tipo.PRINCIPAL, 90, 4), Dificultad.FACIL);
        Receta principal2 = new Receta(new Principal("Spaghetti Bolognesa", pasosPrincipal2, Tipo.PRINCIPAL, 45, 6), Dificultad.MEDIO);    
        Receta postre = new Receta(new Postre("Chocotorta", pasosPostre, Tipo.POSTRE, 0, false), Dificultad.MEDIO);
        Receta postre1 = new Receta(new Postre("Tarta de frutas", pasosPostre1, Tipo.POSTRE, 0, true), Dificultad.AVANZADO);
        Receta postre2 = new Receta(new Postre("Rogel", pasosPostre2, Tipo.POSTRE, 160, false), Dificultad.AVANZADO);

        sistema.agregarReceta(entrada);
        sistema.agregarReceta(entrada2);
        sistema.agregarReceta(principal1);
        sistema.agregarReceta(principal);
        sistema.agregarReceta(principal2);
        sistema.agregarReceta(postre1);
        sistema.agregarReceta(postre2);
        sistema.agregarReceta(postre);

        System.out.println("Total de recetas: " + sistema.cantRecetasCargadas());
        System.out.println("Receta con más pasos: " + sistema.recetaConMasCantPasos().getPlato().getNombre());
        System.out.println(" ");
        System.out.println("--- ENTRADAS ---");
        for (Plato plato : sistema.listaPorTipo(TipoPlato.ENTRADA)) {
            plato.mostrarPasos();
            System.out.println();
        }
        System.out.println("--- PRINCIPALES ---");
        for (Plato plato : sistema.listaPorTipo(TipoPlato.PRINCIPAL)) {
            plato.mostrarPasos();
            System.out.println();
        }
        System.out.println("--- POSTRES ---");
        for (Plato plato : sistema.listaPorTipo(TipoPlato.POSTRE)) {
            plato.mostrarPasos();
            System.out.println();
        }

        System.out.println("Recetas de dificultad fácil:");
        for (Receta receta : sistema.recetasPorDificultad(Dificultad.FACIL)) {
            System.out.println(receta.getPlato().getNombre());
        }
        System.out.println("Recetas de dificultad media:");
        for (Receta receta : sistema.recetasPorDificultad(Dificultad.MEDIO)) {
            System.out.println(receta.getPlato().getNombre());
        }
        System.out.println("Recetas de dificultad avanzada:");
        for (Receta receta : sistema.recetasPorDificultad(Dificultad.AVANZADO)) {
            System.out.println(receta.getPlato().getNombre());
        }

    }
}