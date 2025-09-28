package ej1_u7y8;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Intermedio extends Participante implements Cocina{
    private HashMap<String, Integer> cantPorIngrediente;

    public Intermedio(String nombre, String apellido, LocalDate fechaNacimiento, String localidad, Color equipo, HashMap<String, Integer> cantPorIngrediente) {
        super(nombre, apellido, fechaNacimiento, localidad, equipo);
        this.cantPorIngrediente = cantPorIngrediente;
    }

    public HashMap<String, Integer> getCantPorIngrediente() {
        return cantPorIngrediente;
    }

    public void setCantPorIngrediente(HashMap<String, Integer> cantPorIngrediente) {
        this.cantPorIngrediente = cantPorIngrediente;
    }

    public boolean verificarDisponibilidadIngredientesPara(Plato plato) throws IngredientesException{
        for(String ing : plato.getIngredientesRequeridos()){
            if(!cantPorIngrediente.containsKey(ing)){
                throw new IngredientesException("No se tiene los ingredientes necesarios. ");
            }
            if(cantPorIngrediente.get(ing) < 1){
                throw new IngredientesException("insuficiente stock del ingrediente " + ing);
            }
            int cantNueva = cantPorIngrediente.get(ing) - 1;
            cantPorIngrediente.replace(ing, cantPorIngrediente.get(ing), cantNueva);
        }
        return true;
    }

    @Override
    public void prepararLugarDeTrabajo() {
        System.out.println("Mi stock a utilizar es de:");
        for(Map.Entry<String, Integer> ingredientes : cantPorIngrediente.entrySet()){
            int cant = ingredientes.getValue();
            String ing = ingredientes.getKey();
            if(cant>1){
                System.out.println(" - " + ing + " | " + cant);
            }
        }
    }

    @Override
    public void prepararPlato(Plato plato) throws IngredientesException {
        if(puedePrepararPlato(plato)){
            System.out.println("Intermedio cocina y sirve plato principal exitosamente. ");
        }
    }

    @Override
    public boolean puedePrepararPlato(Plato plato) throws IngredientesException {
       if(plato.getTipo() == Tipo.ENTRADA || !verificarDisponibilidadIngredientesPara(plato)){
           throw new IngredientesException("No puedes cocinar ni servir este plato");
       }
        return false;
    }
}
