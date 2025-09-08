package bares;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, Color> puntajes1 = new HashMap<>();
        puntajes1.put(5, Color.BLANCO);
        puntajes1.put(15, Color.AMARILLO);
        puntajes1.put(25, Color.VERDE);
        HashMap<Integer, Color> puntajes2 = new HashMap<>();
        puntajes1.put(15, Color.BLANCO);
        puntajes1.put(5, Color.ROJO);
        puntajes1.put(25, Color.NEGRO);
        HashMap<Integer, Color> puntajes3 = new HashMap<>();
        puntajes1.put(15, Color.ROJO);
        puntajes1.put(10, Color.VERDE);
        puntajes1.put(5, Color.NEGRO);
        puntajes1.put(20, Color.BLANCO);
        Rectangular rectangular1 = new Rectangular("diana 1", Nivel.DIFICIL, puntajes1);
        Circular circular1 = new Circular("diana 2", Nivel.FACIL, puntajes2);
        Cuadrada cuadrada1 = new Cuadrada("diana 3", Nivel.MEDIO, puntajes3);

        Bar b1 = new Bar();
        b1.agregarDianas(rectangular1);
        b1.agregarDianas(circular1);
        b1.agregarDianas(cuadrada1);

    }
}
