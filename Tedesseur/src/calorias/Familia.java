package calorias;

import personas.Persona;

import java.util.HashMap;
import java.util.HashSet;

public class Familia {
    private HashMap<Persona, HashSet<Plato>> registro;

    public HashMap<Persona, HashSet<Plato>> getRegistro() {
        return registro;
    }

    public void setRegistro(HashMap<Persona, HashSet<Plato>> registro) {
        this.registro = registro;
    }

    public Familia(HashMap<Persona, HashSet<Plato>> registro) {
        this.registro = registro;
    }

    public Familia() {
        this.registro = new HashMap<>();
    }
}
