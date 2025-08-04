package tickets;

import java.time.LocalDateTime;
import java.util.ArrayList;

public abstract class Ticket {
    private Cliente cliente;
    private String descripcion;
    private LocalDateTime creacion;
    private LocalDateTime finalizacion;
    private ArrayList<Comentario> comentarios;

}
