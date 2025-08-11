package control;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona();

        Registro r1 = new Registro(1.76f, 80f);
        Registro r2 = new Registro(1.77f, 82f);
        Registro r3 = new Registro(1.78f, 82f);
        HashMap<LocalDate, Registro> registros = new HashMap<>();
        registros.put(LocalDate.of(2025, 6,9), r1);
        registros.put(LocalDate.of(2025, 7,9), r2);
        registros.put(LocalDate.of(2025, 8,9), r3);
        Persona p2 = new Persona("chop", "suey", LocalDate.of(2000, 8, 25), registros);

        Registro r4 = new Registro(1.65f, 65f);
        Registro r5 = new Registro(1.70f, 70f);
        HashMap<LocalDate, Registro> registros2 = new HashMap<>();
        registros2.put(LocalDate.of(2024, 3,12), r4);
        registros2.put(LocalDate.of(2025, 4,12), r5);
        Persona p3 = new Persona("serj", "suey", LocalDate.of(1999, 11, 2), registros2);


        HashSet<Persona> personitas = new HashSet<>();
        personitas.add(p1);
        personitas.add(p2);
        personitas.add(p3);

        p1.conocerRegistroDelDia(LocalDate.of(2024,3,4));
        p2.conocerRegistroDelDia(LocalDate.of(2025,7,9));

        for(Persona persona : personitas){
            System.out.println("Promedio de " + persona.getNombre() + " " + persona.getApellido() + ": ");
            persona.promedioPesoAltura();
        }

        System.out.println("Porcentaje de crecimiento: ");
        p2.porcentajeCrecimiento(LocalDate.of(2025, 6, 9) , LocalDate.of(2025, 8, 9));

    }
}
