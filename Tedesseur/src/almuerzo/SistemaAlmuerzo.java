package almuerzo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Formattable;

public class SistemaAlmuerzo {
    private ArrayList<Plato> platos = new ArrayList<>();
    private ArrayList<Pedido> pedidos = new ArrayList<>();

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

    public void platoMasPedidos(){
        Plato plato1 = new Plato();
        Plato plato2 = new Plato();
        Plato plato3 = new Plato();
        ArrayList<Plato> platosMayorAMenorCantPedida = new ArrayList<>();
        for(Plato plato : platos){
            if(plato.getCantPedida() > plato1.getCantPedida()){
                plato1 = plato;
                plato2 = plato1;
                plato3 = plato2;
            }
            else if(plato.getCantPedida() > plato2.getCantPedida()){
                plato = plato1;
            }
        }
    }
}
