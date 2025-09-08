package tickets;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Hardware extends Ticket{
    private Dispositivo dispositivo;

    public Hardware(Cliente cliente, String descripcion, ArrayList<Comentario> comentarios, LocalDateTime creacion, LocalDateTime finalizacion, Dispositivo dispositivo) {
        super(cliente, descripcion, comentarios, creacion, finalizacion);
        this.dispositivo = dispositivo;
    }

    public Dispositivo getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    @Override
    boolean resuelto() {
        /*if(dispositivo.isHay_repuestos_disp() && this.estadoTicket() == Estado.EN_PROGRESO){
            return true;
        }*/
        return false;
    }
}
