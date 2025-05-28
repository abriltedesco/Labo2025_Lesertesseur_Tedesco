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

    public SistemaVentaCompus(ArrayList<Dispositivo> dispositivos, Cliente cliente) {
        this.dispositivos = dispositivos;
        this.cliente = cliente;
    }

    public SistemaVentaCompus() {
        this.dispositivos = new ArrayList<>();
        this.cliente = new Cliente();
    }
    public SistemaVentaCompus(Cliente cliente) {
        this.cliente = cliente;
    }
    public void agregarDisp(Dispositivo dispositivo, ArrayList<Dispositivo> dispositivos) {
        if (dispositivo.hayStock()) {
            dispositivos.add(d);
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
            total *= 1.05; // 5% recargo
        }
        return total;
    }

    public int contarEntrada() {
        int contador = 0;
        for (Dispositivo dispositivo : dispositivos) {
            if (dispositivo instanceof Entrada) contador++;
        }
        return contador;
    }

    public int contarSalida() {
        int contador = 0;
        for (Dispositivo dispositivo : dispositivos) {
            if (dispositivo instanceof Salida) contador++;
        }
        return contador;
    }
}
