package bares;

import java.util.HashMap;

public abstract class Diana {
    private String nombre;
    private Nivel dificultad;
    private HashMap<Integer, Color> puntajesPorColor;

    public Diana(String nombre, Nivel dificultad, HashMap<Integer, Color> puntajesPorColor) {
        this.nombre = nombre;
        this.dificultad = dificultad;
        this.puntajesPorColor = puntajesPorColor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Nivel getDificultad() {
        return dificultad;
    }

    public void setDificultad(Nivel dificultad) {
        this.dificultad = dificultad;
    }

    public HashMap<Integer, Color> getPuntajesPorColor() {
        return puntajesPorColor;
    }

    public void setPuntajesPorColor(HashMap<Integer, Color> puntajesPorColor) {
        this.puntajesPorColor = puntajesPorColor;
    }

    public int cantPuntajes(){
       return this.puntajesPorColor.size();
    }

}
