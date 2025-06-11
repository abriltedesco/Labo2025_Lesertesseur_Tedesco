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

    @Override
    void recordatorio() {
        System.out.println("Mantener la cocina limpia y el horno al mínimo.");
    }

    @Override
    void mostrarPasos() {
        for(int i = 0 ; i < this.getPasos().size(); i ++ ) {
            System.out.println("Paso " + (i+1) + getPasos().get(i));
            System.out.println();
            recordatorio();
        }
    }


}
