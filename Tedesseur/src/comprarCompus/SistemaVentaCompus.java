package comprarCompus;

import dispositivos.Dispositivo;
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
}
