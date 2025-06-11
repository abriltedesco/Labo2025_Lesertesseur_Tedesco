package receta;

import java.util.ArrayList;
import java.util.Arrays;

public class SistemaReceta {
    private ArrayList<Plato> platos;
    private ArrayList<Receta> recetas;

    public SistemaReceta(ArrayList<Plato> platos, ArrayList<Receta> recetas) {
        this.platos = platos;
        this.recetas = recetas;
    }
    public SistemaReceta() {
        this.platos = new ArrayList<>();
        this.recetas = new ArrayList<>();
    }

    public ArrayList<Plato> getPlatos() {
        return platos;
    }

    public void setPlatos(ArrayList<Plato> platos) {
        this.platos = platos;
    }

    public ArrayList<Receta> getRecetas() {
        return recetas;
    }

    public void setRecetas(ArrayList<Receta> recetas) {
        this.recetas = recetas;
    }

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

    public int cantRecetasCargadas(){
        return this.recetas.size();
    }

    public Receta recetaConMasCantPasos (){
        Receta masLarga = new Receta();
        for(Receta receta: this.recetas){
            if(receta.cantPasosReceta() > masLarga.cantPasosReceta()){
                masLarga = receta;
            }
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

    public ArrayList<Receta> devolverListaConTipo(Tipo tipo, ArrayList<Receta> entradas, ArrayList<Receta> postres, ArrayList<Receta> principales){
        ArrayList<Receta> lista ;

        if (tipo == Tipo.ENTRADA) {
            lista = entradas;
        }
        else if(tipo == Tipo.POSTRE){
           lista = postres;
        }
        else{
            lista = principales;
        }

        return lista;
    }

    public void filtrarRecetasPorTipo (Tipo tipo){
        ArrayList<Receta> entradas = new ArrayList<>();
        ArrayList<Receta> postres = new ArrayList<>();
        ArrayList<Receta> principales = new ArrayList<>();

        for(Receta receta : this.recetas) {
            if (receta.getPlato().getTipo() == Tipo.ENTRADA) {
                entradas.add(receta);
            }
            else if(receta.getPlato().getTipo() == Tipo.POSTRE){
                postres.add(receta);
            }
            else{
                principales.add(receta);
            }
        }

        devolverListaConTipo(tipo, entradas, postres, principales);
    }

}
