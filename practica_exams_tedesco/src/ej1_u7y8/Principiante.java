package ej1_u7y8;

import java.time.LocalDate;
import java.util.HashSet;

public class Principiante extends Participante implements Cocina{
    private HashSet<String> ingredientesProhibidos;

    public Principiante(String nombre, String apellido, LocalDate fechaNacimiento, String localidad, Color equipo, HashSet<String> ingredientesProhibidos) {
        super(nombre, apellido, fechaNacimiento, localidad, equipo);
        this.ingredientesProhibidos = ingredientesProhibidos;
    }

    public HashSet<String> getIngredientesProhibidos() {
        return ingredientesProhibidos;
    }

    public void setIngredientesProhibidos(HashSet<String> ingredientesProhibidos) {
        this.ingredientesProhibidos = ingredientesProhibidos;
    }

    public boolean tieneProhibido(Plato plato){
        for(String ing : plato.getIngredientesRequeridos()){
            if(ingredientesProhibidos.contains(ing)){
                return true;
            }
        }
        return false;
    }

    @Override
    public void prepararLugarDeTrabajo() {
        System.out.println("Ya guarde todos los elementos prohibidos y no voy a usar: ");
        for(String ing : ingredientesProhibidos){
            System.out.println(" - " + ing);
        }
    }

    @Override
    public void prepararPlato(Plato plato) throws IngredientesException {
        if(puedePrepararPlato(plato)){
            System.out.println("Principiante cocina y sirve el plato de entrada con exito");
        }
    }

    @Override
    public boolean puedePrepararPlato(Plato plato) throws IngredientesException {
        if(plato.getTipo() == Tipo.PRINCIPAL || tieneProhibido(plato)){
            throw new IngredientesException("Tienes ingrediente prohibido o es otro tipo asi que no puedes cocinar ni servir este plato");
        }
        return true;
    }
}
