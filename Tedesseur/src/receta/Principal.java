package receta;

import java.util.ArrayList;

public class Principal extends Plato{
    int tiempoCoccion;
    int cantComensales;

    public Principal(int tiempoCoccion, int cantComensales, String nombre, ArrayList<String> pasos, Tipo tipo) {
        super(nombre, pasos, tipo);
        this.tiempoCoccion = tiempoCoccion;
        this.cantComensales = cantComensales;
    }
}
