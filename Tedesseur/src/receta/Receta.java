package receta;

import java.util.ArrayList;

public class Receta {
    private Plato plato;
    private Dificultad dificultad;

    public Receta() {
        ArrayList <String> pasos = new ArrayList<>();
        pasos.add("paso 1");
        pasos.add("paso 2");
        pasos.add("paso 3");
        this.plato = new Entrada("rabas", pasos, Tipo.ENTRADA,Temperatura.CALIENTE);
        this.dificultad = Dificultad.MEDIO;
    }

    public Receta(Plato plato, Dificultad dificultad) {
        this.plato = plato;
        this.dificultad = dificultad;
    }


    public Plato getPlato() {
        return plato;
    }

    public void setPlato(Plato plato) {
        this.plato = plato;
    }

    public Dificultad getDificultad() {
        return dificultad;
    }

    public void setDificultad(Dificultad dificultad) {
        this.dificultad = dificultad;
    }

    public int cantPasosReceta(){
        return this.plato.getPasos().size();
    }
}
