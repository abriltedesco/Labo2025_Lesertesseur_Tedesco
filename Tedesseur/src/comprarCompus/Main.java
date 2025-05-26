package comprarCompus;

import dispositivos.*;
import personas.Cliente;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Teclado teclado1 = new Teclado("hdhd", "modelo", 123500, 5, "tipito", 2);
        Teclado teclado2 = new Teclado("lenovo", "a32o", 220000, 10, "tipito", 3);
        Impresora impresora  = new Impresora(5, "inyeccion");
        Dispositivo cpu1 = new Dispositivo("dsfdsfds", "A2323", 560000, 100);
        Dispositivo cpu2 = new Dispositivo("fabri", "A2343", 485000, 87);
        Dispositivo cpu3 = new Dispositivo("cante", "A2344", 497000, 75);
        Mouse mouse = new Mouse();
        Pantalla pantalla = new Pantalla();

        ArrayList<Dispositivo> dispositivos1 = new ArrayList<>();
        dispositivos1.add(cpu1);
        dispositivos1.add(teclado1);
        dispositivos1.add(impresora);
        dispositivos1.add(mouse);
        dispositivos1.add(pantalla);

        Cliente cliente1 = new Cliente();
        SistemaVentaCompus svc = new SistemaVentaCompus(dispositivos1, cliente1);

    }
}
