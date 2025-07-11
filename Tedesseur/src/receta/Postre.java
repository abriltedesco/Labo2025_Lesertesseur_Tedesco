package receta;

import java.util.ArrayList;

public class Postre extends Plato{
    private double tempHorno;
    private boolean aptoDiabetico;

    public double getTempHorno() {
        return tempHorno;
    }

    public void setTempHorno(double tempHorno) {
        this.tempHorno = tempHorno;
    }

    public boolean isAptoDiabetico() {
        return aptoDiabetico;
    }

    public void setAptoDiabetico(boolean aptoDiabetico) {
        this.aptoDiabetico = aptoDiabetico;
    }

    public Postre(String nombre, ArrayList<String> pasos, Tipo tipo, double tempHorno, boolean aptoDiabetico) {
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

    @Override
    public boolean esDelTipo(Tipo tipo) {
        return tipo == Tipo.POSTRE;
    }
}
