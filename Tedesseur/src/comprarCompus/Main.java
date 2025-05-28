package comprarCompus;

import dispositivos.*;
import personas.Cliente;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Teclado teclado1 = new Teclado("hdhd", "modelo", 123500, 5, "tipito", 2);
        Teclado teclado2 = new Teclado("lenovo", "a32o", 220000, 10, "tipito", 3);
        Impresora impresora  = new Impresora(5, "inyeccion");
        Cpu cpu1 = new Dispositivo("dsfdsfds", "A2323", 560000, 100);
        Cpu cpu2 = new Dispositivo("fabri", "A2343", 485000, 87);
        Cpu cpu3 = new Dispositivo("cante", "A2344", 497000, 75);
        Mouse mouse = new Mouse();
        Pantalla pantalla = new Pantalla();

        Cliente cliente1 = new Cliente("juansito", "perez", "123456789", "tarjeta", "1234-5678-9876-5432");
        Cliente cliente2 = new Cliente("mila", "lopez", "987654321", "tarjeta", "1234-1234-1234-1234");
        Cliente cliente3 = new Cliente("pedro", "gomez", "456789123", "efectivo", "0000-0000-0000-0000");

        ArrayList<Dispositivo> dispositivos1 = new ArrayList<>();
        SistemaVentaCompus sist = new SistemaVentaCompus(cliente4);
        sist.agregarDisp(cpu1, dispositivos1);
        sist.agregarDisp(teclado1, dispositivos1);
        sist.agregarDisp(impresora, dispositivos1);
        sist.agregarDisp(mouse, dispositivos1);
        sist.agregarDisp(pantalla, dispositivos1);
        if(sist.sePuedeRealizarCompra()){
            sist.mostrarInfoCompra();
            System.out.println("--------------------------------------------");
        } 

        ArrayList<Dispositivo> dispositivos2 = new ArrayList<>();
        SistemaVentaCompus sist2 = new SistemaVentaCompus(cliente2);
        sist2.agregarDisp(teclado2, dispositivos2);
        sist2.agregarDisp(impresora, dispositivos2);
        sist2.agregarDisp(mouse, dispositivos2);
        sist2.agregarDisp(pantalla, dispositivos2);
        if(sist2.sePuedeRealizarCompra()){
            sist2.mostrarInfoCompra();
            System.out.println("--------------------------------------------");
        } 
    }
}
