package elecciones;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Trabajador t1 = new Trabajador("Shakira", 40, "Lerolore", LocalDate.of(1980, 4, 13), "32545432", "45545432", "Colombia", 555, LocalTime.of(7,0), LocalTime.of(13,30));
        Trabajador t2 = new Trabajador("tere", 50, "sita", LocalDate.of(1975, 6, 20), "32745432", "45596432", "Kasajistan", 77777, LocalTime.of(10,30), LocalTime.of(18,30));
        PalomaMensajera p1 = new PalomaMensajera("palomita", "azul", true);
        PalomaMensajera p2 = new PalomaMensajera("palomota", "violeta", false);
        PalomaMensajera p3 = new PalomaMensajera("polomota", "verde", true);
        PalomaMensajera p4 = new PalomaMensajera("palamata", "rojo", false);
        PalomaMensajera p5 = new PalomaMensajera("palamita", "negro", false);
        TelefonoMovil tel1 = new TelefonoMovil("Samsung", "A nose cuanto", 365, Compania.PERSONAL, "54554",true, 399);
        TelefonoMovil tel2 = new TelefonoMovil("Motorola", "G7", 365, Compania.CLARO, "5467864652",true, 1000);
        TelefonoMovil tel3 = new TelefonoMovil("Iphone", "XV", 9, Compania.TUENTI, "3536834983",false, 8);
        TelefonoMovil tel4 = new TelefonoMovil("Iphone", "X", 3, Compania.TUENTI, "6875424",true, 0);

        HashSet<Mensajes> mensajeros1 = new HashSet<>();
        mensajeros1.add(t1);
        mensajeros1.add(t2);
        mensajeros1.add(p1);
        mensajeros1.add(p2);
        mensajeros1.add(tel1);
        mensajeros1.add(tel2);

        HashSet<Mensajes> mensajeros2 = new HashSet<>();
        mensajeros2.add(p3);
        mensajeros2.add(tel3);
        mensajeros2.add(tel4);

        Partido partido1 = new Partido("Partido Pit", "Bull", 305, mensajeros1);
        Partido partido2 = new Partido("Partido Pink", "Panthress", 5, mensajeros2);

        partido1.agregarMensajero(p5);
        partido2.agregarMensajero(p4);

        partido1.hacerCampania();
        System.out.println("------------------------------------");
        partido2.hacerCampania();
    }
}
