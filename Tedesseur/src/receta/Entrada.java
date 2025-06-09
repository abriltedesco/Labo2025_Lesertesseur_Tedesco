package receta;

import java.util.ArrayList;

public class Entrada extends Plato{
    private Temperatura temperatura;

    public Entrada(int tiempoCoccion, int cantComensales, String nombre, ArrayList<String> pasos, Tipo tipo, Temperatura temperatura) {
        super(nombre, pasos, tipo);
        this.temperatura = temperatura;

    }
}
