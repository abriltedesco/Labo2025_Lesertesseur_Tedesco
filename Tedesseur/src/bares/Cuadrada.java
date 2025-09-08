package bares;

import java.util.HashMap;

public class Cuadrada extends Diana implements Calculos{
    private  int lado;

    public Cuadrada(String nombre, Nivel dificultad, HashMap<Integer, Color> puntajesPorColor) {
        super(nombre, dificultad, puntajesPorColor);
    }

    @Override
    public double calcularArea() {
        return (this.lado * this.lado);
    }
}
