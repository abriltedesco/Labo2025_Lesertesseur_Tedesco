package receta;

import java.util.ArrayList;

public class Principal extends Plato{
    int tiempoCoccion;
    int cantComensales;

    public Principal(String nombre, ArrayList<String> pasos, Tipo tipo, int tiempoCoccion, int cantComensales) {
        super(nombre, pasos, tipo);
        this.tiempoCoccion = tiempoCoccion;
        this.cantComensales = cantComensales;
    }

    @Override
    void mostrarPasos() {
        for(int i = 0 ; i < this.getPasos().size(); i ++ ) {
            System.out.println("Paso " + (i+1) + getPasos().get(i));
        }
    }

    @Override
    void recordatorio() {
        System.out.println("");
    }

    @Override
    public boolean esDelTipo(Tipo tipo) {
        return tipo == Tipo.PRINCIPAL;
    }
}
