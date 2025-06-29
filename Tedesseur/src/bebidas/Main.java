package bebidas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SistemaBebidas sistema = new SistemaBebidas();

        Neutra n1 = new Neutra("SmartWater" , Tipo.NEUTRAS);
        Neutra n2 = new Neutra("VillaVicencio",  Tipo.NEUTRAS);

        Azucarada az1 = new Azucarada("Coca Cola", 15, Tipo.AZUCARADAS, 50);
        Azucarada az2 = new Azucarada("Fanta", 10, Tipo.AZUCARADAS, 25);

        Alcohol al1 = new Alcohol("Fernet", 70, 40, Tipo.ALCOHOLICAS, 40);
        Alcohol al2 = new Alcohol("Aperol", 30, 70, Tipo.ALCOHOLICAS, 80);

        Persona p1 = new Persona("Pink", "Pantheress", "4444444", new ArrayList<Consumicion>());
        Persona p2 = new Persona("Charli", "XCX", "4444444", new ArrayList<Consumicion>());
        Persona p3 = new Persona("Billie", "Eilish", "55555555", new ArrayList<Consumicion>());

        p1.agregarConsumicion(n1, 2);
        p1.agregarConsumicion(n2, 4);
        p1.agregarConsumicion(al1, 3);

        p3.agregarConsumicion(az1, 2);
        p3.agregarConsumicion(az2, 2);
        p3.agregarConsumicion(al2, 1);
        p3.agregarConsumicion(n2, 4);

        p2.agregarConsumicion(az1, 3);
        p2.agregarConsumicion(az2, 2);
        p2.agregarConsumicion(al2, 5);

        ArrayList<Persona> personasMain = new ArrayList<>();
        personasMain.add(p1);
        personasMain.add(p2);
        personasMain.add(p3);

        // para agregar y verificar al mismo tiepo lo del dni
        sistema.agregarPersona(personasMain);

        // todas las personas + la de mayor y menor coef
        sistema.mostrarCoeficientes();

        sistema.usuarioElijeConsumicion();

    }
}
