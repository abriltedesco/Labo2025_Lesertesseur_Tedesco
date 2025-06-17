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

        ArrayList<String> pasosEntrada = new ArrayList<>(Arrays.asList("Cortar ingredientes", "Mezclar", "Servir"));
        ArrayList<String> pasosPrincipal = new ArrayList<>(Arrays.asList("Preparar carne", "Cocinar", "Servir"));
        ArrayList<String> pasosPostre = new ArrayList<>(Arrays.asList("Acomodar galltetitas", "Batir queso crema y ddl", "Hechar la mezcla sobre las galletitas", "Dejar por 3 horas en la heladera"));

        Receta entrada = new Receta(new Entrada("Ensalada Caesar", pasosEntrada,Tipo.ENTRADA, Temperatura.FRIA),  Dificultad.FACIL);
        Receta principal = new Receta(new Principal("Asado", pasosPrincipal, Tipo.PRINCIPAL, 120, 6),  Dificultad.AVANZADO);
        Receta postre = new Receta(new Postre("Chocotorta", pasosPostre, Tipo.POSTRE, 0, false), Dificultad.MEDIO);
        Receta postre1 = new Receta(new Postre("Tarta de frutas", pasosPostre1, Tipo.POSTRE, 0, true), Dificultad.AVANZADO);
        Receta postre2 = new Receta(new Postre("Rogel", pasosPostre2, Tipo.POSTRE, 160, false), Dificultad.AVANZADO);

        sistema.agregarReceta(entrada);
        sistema.agregarReceta(principal);
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

    }
}