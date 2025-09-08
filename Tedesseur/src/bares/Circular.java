package bares;

import java.util.HashMap;

public class Circular extends Diana implements Calculos{
    private static int radio = 13;

    public Circular(String nombre, Nivel dificultad, HashMap<Integer, Color> puntajesPorColor) {
        super(nombre, dificultad, puntajesPorColor);
    }

    public static int getRadio() {
        return radio;
    }

    public static void setRadio(int radio) {
        Circular.radio = radio;
    }

    @Override
    public double calcularArea() {
        return (3.14*radio*radio);
    }
}
