package bares;

import java.util.HashMap;

public class Rectangular extends Diana implements Calculos{
    private int altura;
    private int base;

    public Rectangular(String nombre, Nivel dificultad, HashMap<Integer, Color> puntajesPorColor, int altura, int base) {
        super(nombre, dificultad, puntajesPorColor);
        this.altura= altura;
        this.base= base;
    }

    @Override
    public double calcularArea() {
        return (base * altura);
    }
}
