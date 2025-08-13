package calorias;

import control.Registro;
import personas.Persona;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Sistema {
    private HashSet<Familia> familias;
    //Calorias por persona
    public int caloriasPorPersona(Persona persona){
        int totalCalorias = 0;
        for(Familia flia : this.familias) {
            if(flia.getRegistro().containsKey(persona)) {
                for (Map.Entry<Persona, HashSet<Plato>> mapa : flia.getRegistro().entrySet()) {
                    HashSet<Plato> platos = mapa.getValue();
                    for (Plato plato : platos) {
                        totalCalorias += plato.getCalorias();
                    }
                }
            }
        }
        return totalCalorias;
    }

    //promedio calorias por familia
    public double promedioCalorias(Familia familia){
        double totalCaloriasPorFamilia = 0;
        double promedioCaloriasPorFamilia = 0;
        for(Map.Entry<Persona, HashSet<Plato>> mapa : familia.getRegistro().entrySet() ) {
            Persona personaFlia = mapa.getKey();
            HashSet<Plato> platos = mapa.getValue();
            totalCaloriasPorFamilia += caloriasPorPersona(personaFlia);
        }
        promedioCaloriasPorFamilia = totalCaloriasPorFamilia / familia.getRegistro().size();
        return promedioCaloriasPorFamilia;
    }

    public Persona personaMasCalorias(Familia familia){
        Persona personaMasCalorias = new Persona();
        int caloriasPorPersona = 0;

        for (Map.Entry<Persona, HashSet<Plato>> mapa : familia.getRegistro().entrySet()) {
             Persona personaFlia = mapa.getKey();
             HashSet<Plato> platos = mapa.getValue();
             if (caloriasPorPersona(personaFlia) > caloriasPorPersona) {
                 personaMasCalorias = personaFlia;
                 caloriasPorPersona = caloriasPorPersona(personaFlia);
             }
        }
        return personaMasCalorias;
    }

    public Persona personaMenosCalorias(Familia familia){
        Persona personaMenosCalorias = new Persona();
        int caloriasPorPersona = caloriasPorPersona(personaMasCalorias(familia));

        for (Map.Entry<Persona, HashSet<Plato>> mapa : familia.getRegistro().entrySet()) {
             Persona personaFlia = mapa.getKey();
             HashSet<Plato> platos = mapa.getValue();
             if (caloriasPorPersona(personaFlia) > caloriasPorPersona) {
                 personaMenosCalorias = personaFlia;
                 caloriasPorPersona = caloriasPorPersona(personaFlia);
             }
        }
        return personaMenosCalorias;
    }


    public static void main(String[] args) {
        HashSet<String> ingred1 = new HashSet<>();
        ingred1.add("fideos");
        ingred1.add("tuco");

        HashSet<String> ingred2 = new HashSet<>();
        ingred2.add("noiquis");
        ingred2.add("queso");
        ingred2.add("bolognesa");

        Plato p1 = new Plato("fideos con tuco", ingred1,100);
        Plato p2 = new Plato("nioquis", ingred2,150);
        HashSet<Plato> platos1 = new HashSet<>();
        platos1.add(p1);
        platos1.add(p2);

        HashSet<String> ingred3 = new HashSet<>();
        ingred1.add("chocolinas");
        ingred1.add("dulce de leche");
        ingred1.add("queso crema");

        HashSet<String> ingred4 = new HashSet<>();
        ingred2.add("masa");
        ingred2.add("carne");

        Plato p3 = new Plato("chocotorta", ingred3,200);
        Plato p4 = new Plato("empanada", ingred4,90);
        HashSet<Plato> platos2 = new HashSet<>();
        platos2.add(p3);
        platos2.add(p4);

        HashMap<Persona, HashSet<Plato>>flia = new HashMap<>();
        Persona pe1 = new Persona("Pit", 41, "Bull", LocalDate.of(1981, 1, 15 ));
        Persona pe2 = new Persona("Sha", 48, "Kira", LocalDate.of(1977, 2, 2 ));
        flia.put(pe1, platos1);
        flia.put(pe2, platos2);
    }
}
