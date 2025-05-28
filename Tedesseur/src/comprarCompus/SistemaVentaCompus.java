package comprarCompus;

import dispositivos.*;
import personas.Cliente;

import java.util.ArrayList;

public class SistemaVentaCompus {
    private ArrayList<Dispositivo> dispositivos;
    private Cliente cliente;

    public ArrayList<Dispositivo> getDispositivos() {
        return dispositivos;
    }

    public void setDispositivos(ArrayList<Dispositivo> dispositivos) {
        this.dispositivos = dispositivos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public SistemaVentaCompus() {
        this.dispositivos = new ArrayList<>();
        Cpu cpu = new Cpu();
        dispositivos.add(cpu);
        this.cliente = new Cliente();
    }

    public SistemaVentaCompus(ArrayList<Dispositivo> dispositivos, Cliente cliente) {
        this.dispositivos = dispositivos;
        this.cliente = cliente;
    }

    public SistemaVentaCompus(Cliente cliente) {
        this.cliente = cliente;
    }

    public void agregarDisp(Dispositivo dispositivo, ArrayList<Dispositivo> dispositivos) {
        if (dispositivo.hayStock()) {
            dispositivos.add(dispositivo);
            dispositivo.reducirStock();
        } else {
            System.out.println("No hay stock");
        }
    }

    public double calcularTotal(){
        double total = 0.0;
        for (Dispositivo dispositivo : dispositivos){
            total += dispositivo.getPrecio();
        }
        if (cliente.getMetodoPago().equals("tarjeta")) {
            total *= 1.05; 
        }
        return total;
    }

    public int contarDispEntrada() {
        int contador = 0;
        for (Dispositivo dispositivo : dispositivos) {
            if (dispositivo instanceof Entrada) contador++;
        }
        return contador;
    }

    public int contarDispSalida() {
        int contador = 0;
        for (Dispositivo dispositivo : dispositivos) {
            if (dispositivo instanceof Salida) contador++;
        }
        return contador;
    }

    public boolean hayCPU() {
        for (Dispositivo dispositivo : dispositivos) {
            if (dispositivo instanceof Cpu) {
                return true;
            }
        }
        return false;
    }

    public boolean sePuedeRealizarCompra(){
        if(!hayCPU()) {
            System.out.println("No se puede realizar la compra porque no hay CPU");
            return false;
        }
        return true; 
    }

    public void mostrarInfoCompra() {
        if (this.sePuedeRealizarCompra()) {
            System.out.println("Cliente: " + cliente.getNombre() + " " + cliente.getApellido());
            System.out.println("Cant disp de entrada: " + this.contarDispEntrada());
            System.out.println("Cant disp de salida: " + this.contarDispSalida());
            System.out.println("El total de la compra es: " + this.calcularTotal());
        }
    }
}
