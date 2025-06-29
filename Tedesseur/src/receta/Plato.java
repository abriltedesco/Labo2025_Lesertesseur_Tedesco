package receta;

import java.util.ArrayList;

public abstract class Plato {
    private String nombre;
    private ArrayList<String> pasos;
    private Tipo tipo;

    public Plato(String nombre, ArrayList<String> pasos, Tipo tipo) {
        this.nombre = nombre;
        this.pasos = pasos;
        this.tipo = tipo;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public ArrayList<String> getPasos() {
        return pasos;
    }

    public void setPasos(ArrayList<String> pasos) {
        this.pasos = pasos;
    }

    // METODOS ABSTRACTO //
    abstract void mostrarPasos();
    abstract void recordatorio();
    abstract boolean esDelTipo(Tipo tipo);
}
