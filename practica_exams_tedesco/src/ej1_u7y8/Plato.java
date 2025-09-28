package ej1_u7y8;

import java.util.HashSet;

public class Plato {
    private Tipo tipo;
    private int duracion;
    private HashSet<String> ingredientesRequeridos;

    public Plato(Tipo tipo, int duracion, HashSet<String> ingredientesRequeridos) {
        this.tipo = tipo;
        this.duracion = duracion;
        this.ingredientesRequeridos = ingredientesRequeridos;
    }

    public Plato() {
        this.tipo = Tipo.ENTRADA;
        this.duracion = 40;
        this.ingredientesRequeridos = new HashSet<>();
        ingredientesRequeridos.add("Calamar");
        ingredientesRequeridos.add("Harina");
        ingredientesRequeridos.add("Sal");
        ingredientesRequeridos.add("Ajo");
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public HashSet<String> getIngredientesRequeridos() {
        return ingredientesRequeridos;
    }

    public void setIngredientesRequeridos(HashSet<String> ingredientesRequeridos) {
        this.ingredientesRequeridos = ingredientesRequeridos;
    }
}
