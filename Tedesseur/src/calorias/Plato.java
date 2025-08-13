package calorias;

import java.util.HashSet;

public class Plato {
    private String nombre;
    private HashSet<String> ingredientes;
    private int calorias;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashSet<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(HashSet<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public Plato(String nombre, HashSet<String> ingredientes, int calorias) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
        this.calorias = calorias;
    }

    public Plato() {
        this.nombre = "milanesa";
        this.ingredientes = new HashSet<>();
        ingredientes.add("carne");
        ingredientes.add("pan rallado");
        this.calorias = 140;
    }
}
