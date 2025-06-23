package receta;
/*
import java.util.ArrayList;

public class Entrada extends Plato{
    private Temperatura temperatura;

    public Entrada(String nombre, ArrayList<String> pasos, Tipo tipo, Temperatura temperatura) {
        super(nombre, pasos, tipo);
        this.temperatura = temperatura;
    }

    public Temperatura getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Temperatura temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    void recordatorio() {
        if(this.temperatura == temperatura.FRIA){
            System.out.println("Guarda preparacion en heladera");
        }
        else{
            System.out.println("Prende el horno");
        }
    }

    @Override
    void mostrarPasos() {
        if(this.temperatura == temperatura.FRIA){
            for(int i = 0 ; i < this.getPasos().size(); i ++ ) {
                System.out.println("Paso " + (i+1) + getPasos().get(i));
            }
            recordatorio();
        }
        else{
            recordatorio();
            for(int i = 0 ; i < this.getPasos().size(); i ++ ) {
                System.out.println("Paso " + (i+1) + getPasos().get(i));
            }
        }
    }

    @Override
    boolean esDelTipo(Tipo tipo) {
        return tipo == Tipo.ENTRADA;
    }
}
