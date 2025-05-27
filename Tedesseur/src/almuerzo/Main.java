package almuerzo;

import colegio.Profesor;
import personas.Persona;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Plato p1 = new Plato("Fideos", 12000, 3);
        Plato p2 = new Plato("Nuggets", 20000, 2);
        Plato p3 = new Plato("Pizza", 12500, 6);
        Plato p4 = new Plato("Empanada", 4500, 5);
        Profesor prof1 = new Profesor("SFSFS", "sfsdfd", 15);
        Profesor prof2 = new Profesor("SFSFS", "sfsdfd", 25);
        SistemaAlmuerzo s1 = new SistemaAlmuerzo();
        Pedido pd1 = new Pedido(LocalDate.of(2025, 2, 12), new Plato("Pure", 3000,0), new Persona(), 19, "A cocinar");
        Pedido pd2 = new Pedido(LocalDate.of(2025, 2, 12), p4, prof1, 19, "A cocinar");
        Pedido pd3 = new Pedido(LocalDate.of(2025, 2, 12), p3, prof2, 17, "A cocinar");
        Pedido pd4 = new Pedido(LocalDate.of(2025, 12, 20), new Plato("Pure", 3000,0), new Persona(), 19, "Realizado");

        s1.agregarPlato(p1);
        s1.agregarPlato(p2);
        s1.agregarPlato(p3);
        s1.agregarPlato(p4);
        s1.mostrarPlatos();
        s1.modificarPlato(p2, p3);
        s1.mostrarPlatos();
        System.out.println("--------------------------------------------------------------");
        s1.registrarPedido(pd1);
        s1.registrarPedido(pd2);
        s1.registrarPedido(pd3);
        s1.registrarPedido(pd4);
        s1.mostrarPedidos();
        System.out.println("--------------------------------------------------------------");
        s1.chequeoFechaPedido(LocalDate.of(2025, 2, 12));
        s1.listarPlatosDelDia(LocalDate.of(2025, 2, 12));
        System.out.println("--------------------------------------------------------------");
        s1.topTresPlatosMasPedidos();
    
    }
}
