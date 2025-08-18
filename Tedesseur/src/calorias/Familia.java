package calorias;

import personas.Persona;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;

public class Familia {
    private HashSet<Familiar> familiares;

    public Familia(HashSet<Familiar> familiares) {
        this.familiares = familiares;
    }

    public Familia() {
        Ingrediente i1 = new Ingrediente("chocolate", 100);
        Ingrediente i2 = new Ingrediente("dulce de leche", 80);
        HashMap<Ingrediente, Integer> ingredientes = new HashMap<>();
        ingredientes.put(i1, 3);
        ingredientes.put(i2, 4);
        Plato p1 = new Plato("bombones", ingredientes);
        HashMap<Plato, Integer> platos = new HashMap<>();
        Familiar f1 = new Familiar("martin", "cirio", LocalDate.of(2007,3,2), platos);
        this.familiares = new HashSet<>();
    }

    public HashSet<Familiar> getFamiliares() {
        return familiares;
    }

    public void setFamiliares(HashSet<Familiar> familiares) {
        this.familiares = familiares;
    }

    public double promedioCalorias() {
        int suma = 0;
        for (Familiar f : familiares) {
            suma += f.calcularCaloriasTotal();
        }
        return (double) suma / familiares.size();
    }

    public Familiar masCalorias(){
        Familiar aux = null;

        for(Familiar f : familiares){
            if(aux == null || f.calcularCaloriasTotal() > aux.calcularCaloriasTotal()){
                aux = f;
            }
        }
        return aux;
    }

    public Familiar menoCalorias(){
        Familiar aux = null;
        for(Familiar f : familiares){
            if(aux == null || f.calcularCaloriasTotal() < aux.calcularCaloriasTotal()){
                aux = f;
            }
        }
        return aux;
    }
}
