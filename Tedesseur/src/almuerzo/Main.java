package almuerzo;

import personas.Persona;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Plato p1 = new Plato("Fideos", 12000);
        Plato p2 = new Plato("Nuggets", 20000);
        Plato p3 = new Plato("Pizza", 12500);
        Plato p4 = new Plato("Empanada", 4500);
        SistemaAlmuerzo s1 = new SistemaAlmuerzo();
        Pedido pd1 = new Pedido(LocalDate.of(2025, 2, 12), new Plato("Pure", 3000), new Persona(), 19, "Realizado");
        Pedido pd2 = new Pedido(LocalDate.of(2025, 12, 20), new Plato("Pure", 3000), new Persona(), 19, "Realizado");

        s1.agregarPlato(p1);
        s1.agregarPlato(p2);
        s1.mostrarPlatos();
        s1.modificarPlato(p2, p3);
        s1.mostrarPlatos();
        System.out.println("--------------------------------------------------------------");
        s1.registrarPedido(pd1);
        s1.registrarPedido(pd2);
        s1.mostrarPedidos();
        System.out.println("--------------------------------------------------------------");
        s1.chequeoFechaPedido(LocalDate.of(2025, 2, 12));
    }
}
