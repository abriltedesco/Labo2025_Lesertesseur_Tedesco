package tickets;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Software extends Ticket{
    private static int cantMaxIntentos = 3;
    private boolean parche_aplicable;


    public Software(Cliente cliente, String descripcion, ArrayList<Comentario> comentarios, LocalDateTime creacion, LocalDateTime finalizacion, boolean parche_aplicable) {
        super(cliente, descripcion, comentarios, creacion, finalizacion);
        this.parche_aplicable = parche_aplicable;
    }

    public Software() {
        super(new Cliente("a", "d"), "descripcion", new ArrayList<>(), LocalDateTime.now(), LocalDateTime.now());
        this.parche_aplicable = true;
    }


    public static int getCantMaxIntentos() {
        return cantMaxIntentos;
    }

    public static void setCantMaxIntentos(int cantMaxIntentos) {
        Software.cantMaxIntentos = cantMaxIntentos;
    }

    public boolean isParche_aplicable() {
        return parche_aplicable;
    }

    public void setParche_aplicable(boolean parche_aplicable) {
        this.parche_aplicable = parche_aplicable;
    }

    @Override
    boolean resuelto() {
       /* if(this.estadoTicket() == Estado.EN_PROGRESO && cantMaxIntentos > 0){
            return true;
        }*/
        return false;
    }
}
