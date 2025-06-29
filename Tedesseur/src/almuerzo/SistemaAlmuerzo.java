package almuerzo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Formattable;

public class SistemaAlmuerzo {
    private ArrayList<Plato> platos = new ArrayList<>();
    private ArrayList<Pedido> pedidos = new ArrayList<>();

    public ArrayList<Plato> getPlatos() {
        return platos;
    }

    public void setPlatos(ArrayList<Plato> platos) {
        this.platos = platos;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public void agregarPlato(Plato platoaAgregar){
        platos.add(platoaAgregar);
    }

    public void eliminarPlato(Plato platoaEliminar){
        platos.remove(platoaEliminar);
    }

    public void modificarPlato(Plato platoViejo, Plato platoNuevo){
        eliminarPlato(platoViejo);
        agregarPlato(platoNuevo);
    }

    public void mostrarPlatos() {
        for(Plato plato: platos){
            System.out.println(plato.getNombre() + " " + plato.getPrecio());
        }
    }

    public void registrarPedido(Pedido pd){
        pedidos.add(pd);
    }

    public void mostrarPedidos() {
        for(Pedido pedido: pedidos){
            System.out.println(pedido.getFechaCreacion() + " " + pedido.getPlato().getNombre() + " " + pedido.getSolicitante().getNombre() + " " + pedido.getHoraEntrega() + " " + pedido.getEstadoEntrega());
        }
    }

    public boolean chequeoFechaPedido(LocalDate fecha){
        boolean esIgual = false;
        for(Pedido pedido: pedidos){
            if(pedido.getFechaCreacion().equals(fecha)){
                System.out.println(pedido.getFechaCreacion());
                System.out.println(fecha);
                System.out.println("La fecha coincide");
                esIgual = true;
            }
            else{
                System.out.println(pedido.getFechaCreacion());
                System.out.println(fecha);
                System.out.println("La fecha NO coincide");
            }
        }
    return esIgual;
    }

    public void listarPlatosDelDia(LocalDate fecha){
        for (Pedido pedido : pedidos){
            if(pedido.getFechaCreacion().equals(fecha) && pedido.getEstadoEntrega().equals("A cocinar")){
                if(pedido.isEsProfesor()) {
                    double descuento = ( pedido.ConseguirPorcDescuento() * pedido.getPlato().getPrecio() ) / 100;
                    double precioConDesc = pedido.getPlato().getPrecio() - descuento;
                    System.out.println("Plato: " + pedido.getPlato().getNombre() + " | precio: " + precioConDesc);
                }
                else{
                    System.out.println("Plato: " + pedido.getPlato().getNombre() + " | precio: " + pedido.getPlato().getPrecio());
                }
            }
        }
    }

    public void actualizarCantPedida(){
        for(Pedido pedido : pedidos){
            for(Plato plato : platos){
                if(pedido.getPlato().equals(plato)){
                    plato.setCantPedida(plato.getCantPedida() + 1);
                }
            }
        }
    }

    public void topTresPlatosMasPedidos() {
        Plato plato1 = null;
        Plato plato2 = null;
        Plato plato3 = null;

        for (Plato plato : platos) {
            if (plato1 == null || plato.getCantPedida() > plato1.getCantPedida()) {
                plato3 = plato2;
                plato2 = plato1;
                plato1 = plato;
            } else if (plato2 == null || plato.getCantPedida() > plato2.getCantPedida()) {
                plato3 = plato2;
                plato2 = plato;
            } else if (plato3 == null || plato.getCantPedida() > plato3.getCantPedida()) {
                plato3 = plato;
            }
        }

        System.out.println("Top 3 platos más pedidos:");
        if (plato1 != null) System.out.println("1. " + plato1.getNombre() + " - Pedidos: " + plato1.getCantPedida());
        if (plato2 != null) System.out.println("2. " + plato2.getNombre() + " - Pedidos: " + plato2.getCantPedida());
        if (plato3 != null) System.out.println("3. " + plato3.getNombre() + " - Pedidos: " + plato3.getCantPedida());
    }
}
