package ej1_u7y8;

public interface Cocina {
    void prepararPlato(Plato plato) throws IngredientesException, TiempoInsuficienteExc;
    boolean puedePrepararPlato(Plato plato) throws IngredientesException, TiempoInsuficienteExc;
}
