package bares;

import java.util.HashMap;

public class Cuadrada extends Diana implements Calculos{
    private  int lado;

    public Cuadrada(String nombre, Nivel dificultad, HashMap<Integer, Color> puntajesPorColor, int lado) {
        super(nombre, dificultad, puntajesPorColor);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return (this.lado * this.lado);
    }
}
