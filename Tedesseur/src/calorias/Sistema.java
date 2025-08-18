package calorias;

import control.Registro;
import personas.Persona;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Sistema {
    private HashSet<Familia> familias;

    public static void main(String[] args) {
        Ingrediente paqFideos = new Ingrediente("fideos", 380);
        Ingrediente paqTuco = new Ingrediente("tuco", 160);
        HashMap<Ingrediente, Integer> platoFideos = new HashMap<>();
        platoFideos.put(paqFideos, 1);
        platoFideos.put(paqTuco, 2);

        HashMap<Ingrediente, Integer> platoNioquis = new HashMap<>();
        Ingrediente paqNioquis = new Ingrediente("noiquis", 450);
        Ingrediente paqQueso = new Ingrediente("queso", 65);
        Ingrediente paqTuco2 = new Ingrediente("bolognesa", 100);
        platoNioquis.put(paqNioquis, 1);
        platoNioquis.put(paqQueso, 5);
        platoNioquis.put(paqTuco2, 2);


        Plato p1 = new Plato("fideos con tuco", platoFideos);
        Plato p2 = new Plato("nioquis", platoNioquis);
        HashMap<Plato, Integer> platos1 = new HashMap<>();
        HashMap<Plato, Integer> platos2 = new HashMap<>();
        platos1.put(p1, 50);
        platos1.put(p2, 65);

        HashMap<Ingrediente, Integer> chocotortaelamordeaby = new HashMap<>();
        Ingrediente paqChocolinas = new Ingrediente("chocolinas", 103);
        Ingrediente paqDDL = new Ingrediente("dulce de leche", 250);
        Ingrediente paqQuesoCrema = new Ingrediente("queso crema", 80);
        chocotortaelamordeaby.put(paqChocolinas, 4);
        chocotortaelamordeaby.put(paqDDL, 2);
        chocotortaelamordeaby.put(paqQuesoCrema, 2);
        Plato p3 = new Plato("Chocotorta", chocotortaelamordeaby);
        platos1.put(p3, 5);
        platos2.put(p3, 7);

        Ingrediente paqMasa = new Ingrediente("masa", 150);
        Ingrediente churrasco = new Ingrediente("carne", 320);
        HashMap<Ingrediente, Integer> platoEmpanada = new HashMap<>();
        platoEmpanada.put(paqMasa, 1);
        platoEmpanada.put(churrasco, 2);

        Plato p4 = new Plato("empanada", platoEmpanada);
        platos2.put(p1, 5);
        platos2.put(p4, 9);

        HashSet<Familia> flias = new HashSet<>();
        HashSet<Familiar> fliaLista = new HashSet<>();
        Familiar f1 = new Familiar("Pit", "Bull", LocalDate.of(1981, 1, 15), platos1);
        Familiar f2 = new Familiar("Sha", "Kira", LocalDate.of(1977, 2, 2), platos2);
        Familiar f3 = new Familiar();
        fliaLista.add(f1);
        fliaLista.add(f2);
        fliaLista.add(f3);
        Familia flia = new Familia(fliaLista);
        flias.add(flia);
    }
}
