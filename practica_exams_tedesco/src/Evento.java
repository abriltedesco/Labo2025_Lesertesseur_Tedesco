public class Evento {
    private Cliente cliente;
    private double valor;

    public Evento(Cliente cliente, Especialidad esp) {
        this.cliente = cliente;
        this.valor = Empresa.getPrecioBase().get(esp);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(Especialidad esp) {
        this.valor = Empresa.getPrecioBase().get(esp);
    }
}
