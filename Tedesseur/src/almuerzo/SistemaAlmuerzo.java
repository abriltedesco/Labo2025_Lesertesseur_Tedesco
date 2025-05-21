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
            System.out.println(pedido.getFechaCreacion() + " " + pedido.getPlato() + " " + pedido.getSolicitante() + " " + pedido.getHoraEntrega() + " " + pedido.getEstadoEntrega());
        }
    }
    public boolean chequeoFechaPedido(LocalDate fecha){
        boolean esIgual = false;
        for(Pedido pedido: pedidos){
            if(pedido.getFechaCreacion() == fecha){
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
}
