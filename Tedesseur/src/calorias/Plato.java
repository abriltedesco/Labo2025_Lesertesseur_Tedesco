package calorias;

import java.util.HashMap;
import java.util.Map;

public class Plato {
    private String nombre;
    private HashMap<Ingrediente, Integer> ingredientes;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashMap<Ingrediente, Integer> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(HashMap<Ingrediente, Integer> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public Plato(String nombre, HashMap<Ingrediente, Integer>  ingredientes) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
    }

    public Plato() {
        this.nombre = "milanesa";
        this.ingredientes = new HashMap<>();
        Ingrediente i1 = new Ingrediente("carne", 300);
        Ingrediente i2 = new Ingrediente("pan rallado", 170);
        ingredientes.put(i1, 1);
        ingredientes.put(i2, 1);
    }

    public int calcularCalorias(){
        int sumaTotal = 0;
        for(Map.Entry<Ingrediente, Integer> mapa : ingredientes.entrySet()){
            sumaTotal += mapa.getKey().getCalorias() * mapa.getValue();
        }
        return sumaTotal;
    }
}
