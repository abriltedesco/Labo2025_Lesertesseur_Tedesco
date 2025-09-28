package ej1_u7y8;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;

public class MasterChefApp {
    public static void main(String[] args){
        /* people */
        HashSet <String> ingProhibidos = new HashSet<>();
        ingProhibidos.add("Calamar");
        Principiante p1 = new Principiante("luke", "hemmings", LocalDate.of(1994, 7, 16), "australia", Color.AZUL, ingProhibidos);
        Experto e1 = new Experto("calum", "hood", LocalDate.of(1993, 1, 25), "australia", Color.AZUL);
        HashMap<String, Integer> cantXing = new HashMap<>();
        cantXing.put("pan rallado", 3);
        cantXing.put("carne", 5);
        cantXing.put("papa", 1);
        Intermedio i1=  new Intermedio("ashton", "irwin", LocalDate.of(1993, 7, 7), "australia", Color.ROJO, cantXing);

        /* platitos */
        Plato rabas = new Plato();
        HashSet<String> ingmila = new HashSet<>();
        HashSet<String> ingpastel = new HashSet<>();
        ingmila.add("carne");
        ingpastel.add("carne");
        ingmila.add("pan rallado");
        ingmila.add("papa");
        ingpastel.add("papa");
        Plato milaConPapas = new Plato(Tipo.PRINCIPAL, 35, ingmila);
        Plato pastelDePapa = new Plato(Tipo.PRINCIPAL, 35, ingpastel);

        /* pruebas */
        p1.prepararLugarDeTrabajo();
        e1.prepararLugarDeTrabajo();
        i1.prepararLugarDeTrabajo();
        try{
            p1.prepararPlato(rabas);
        } catch (IngredientesException e) {
            System.out.println(e.getMessage());
        }

        try{
            e1.prepararPlato(rabas);
        } catch (TiempoInsuficienteExc e) {
            System.out.println(e.getMessage());
        }

        try{
            e1.prepararPlato(milaConPapas);
        } catch (TiempoInsuficienteExc e) {
            System.out.println(e.getMessage());
        }

        try{
            i1.puedePrepararPlato(milaConPapas);
        } catch (IngredientesException e) {
            System.out.println(e.getMessage());
        }

        try{
            i1.puedePrepararPlato(pastelDePapa);
        } catch (IngredientesException e) {
            System.out.println(e.getMessage());
        }
    }
}
