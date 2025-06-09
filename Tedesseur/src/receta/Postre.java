package receta;

import java.util.ArrayList;

public class Postre extends Plato{
    private double tempHorno;
    private boolean aptoDiabetico;

    public Postre(double tempHorno, boolean aptoDiabetico, String nombre, ArrayList<String> pasos, Tipo tipo) {
        super(nombre, pasos, tipo);
        this.tempHorno = tempHorno;
        this.aptoDiabetico = aptoDiabetico;
    }
}
