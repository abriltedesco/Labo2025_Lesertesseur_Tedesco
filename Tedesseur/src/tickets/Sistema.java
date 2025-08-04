package tickets;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Sistema {
    private ArrayList<Ticket> tickets;

    public Sistema(ArrayList<Ticket> tickets) {
        this.tickets = tickets;
    }

    public ArrayList<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(ArrayList<Ticket> tickets) {
        this.tickets = tickets;
    }

    public Ticket masAntiguo(){
        Ticket mas_antiguo = tickets.get(0);
        for(Ticket ticket : this.tickets){
            if(ticket.noAgarradoPorDesarrollador() && ticket.getCreacion().isBefore(mas_antiguo.getCreacion()) ){
                mas_antiguo = ticket;
            }
        }

        return mas_antiguo;
    }

    public int cantTicketsTotal(){
        return this.tickets.size();
    }

    public int cantTicketsEnEstado(Estado estado){
        int cant = 0;
        for(Ticket ticket : this.tickets){
            if (ticket.estadoTicket() == estado){
                cant ++;
            }
        }
        return cant;
    }

    public ArrayList<Ticket> ticketsDesarrolladosPor(Desarrollador desarrollador){
        ArrayList<Ticket> tickets = new ArrayList<>();
        for(Ticket ticket : this.tickets) {
            for (Comentario comentario : ticket.getComentarios()) {
                if (comentario.getDesarrollador() == desarrollador) {
                    tickets.add(ticket);
                }
            }
        }
        return tickets;
    }


    public Desarrollador desarrolladorQueMasResuelve(){
        Desarrollador desarrolladorsito = new Desarrollador("x", "y");
        for(Ticket ticket : this.tickets) {
            for (Comentario comentario : ticket.getComentarios()) {
                if(comentario.getEstado() == Estado.RESUELTO){
                    desarrolladorsito = comentario.getDesarrollador();
                }
            }
        }
        return desarrolladorsito;
    }


    public void chequearQueNoSeRepitanDesarolladores (ArrayList<Desarrollador> desarrolladores){
        for(int i = 0; i < desarrolladores.size() - 1; i++){
            if(desarrolladores.get(i) == desarrolladores.get(i + 1)){
                desarrolladores.remove(i);
            }
        }
    }

    public ArrayList<Desarrollador> desarrolladoresDelTicket(Ticket ticket){
        ArrayList<Desarrollador> desarrolladores = new ArrayList<>();
        for(Comentario comentario : ticket.getComentarios()){
            desarrolladores.add(comentario.getDesarrollador());
            // solo para q no devuelva dos veces el mismo nombre
            chequearQueNoSeRepitanDesarolladores(desarrolladores);
        }
        return desarrolladores;
    }

    public void chequearSiEstanResueltos(){
        for(Ticket ticket : this.tickets){
            if(ticket.resuelto() && ticket.estadoTicket() != Estado.RESUELTO){
                Desarrollador d = ticket.getComentarios().getLast().getDesarrollador();
                Comentario nuevo_comentario = new Comentario(d, "el desarrollador resolvio el problema", Estado.RESUELTO);
                ticket.getComentarios().add(nuevo_comentario);
            }
        }
    }

    public long promedioResolucion(){
        long horasTotal = 0;
        int ticket_validos = 0;

        for (Ticket ticket : tickets){
            Duration duracion = ticket.tiempoResolucion();
            if (!duracion.isZero()) {
                horasTotal += duracion.toHours();
                ticket_validos++;
            }
        }

        return ticket_validos > 0 ? horasTotal / ticket_validos : 0;
    }



/*

    public static void main(String[] args) {
        Software ticket1 = new Software();

        Desarrollador d1= new Desarrollador("2", "pac");
        Comentario c1 = new Comentario(d1, "anotacion", Estado.EN_PROGRESO);
        Comentario c2 = new Comentario(d1, "anotacion2", Estado.EN_PROGRESO);
        ArrayList<Comentario> comments = new ArrayList<>();
        comments.add(c1);
        comments.add(c2);
        Software ticket2 = new Software(new Cliente("cliente", "apellido"), "descripcion", comments, LocalDateTime.of(2025,6,30, 14, 5), null, true);

        Desarrollador d2= new Desarrollador("2", "pac");
        Comentario co1 = new Comentario(d1, "anotacion", Estado.EN_PROGRESO);
        Comentario co2 = new Comentario(d1, "anotacion2", Estado.EN_PROGRESO);
        ArrayList<Comentario> comments2 = new ArrayList<>();
        comments2.add(co1);
        comments2.add(c1);
        comments2.add(co2);
        Software ticket3 = new Software(new Cliente("cliente", "apellido"), "descripcion", comments2, LocalDateTime.of(2025,6,30, 15, 5), null, true);

        Desarrollador d3 = new Desarrollador("manuelita", "peguajo");
        Comentario com1 = new Comentario(d3, "anotacion", Estado.EN_PROGRESO);
        Comentario com2 = new Comentario(d3, "anotacion2", Estado.RESUELTO);
        ArrayList<Comentario> comments3 = new ArrayList<>();
        comments3.add(com1);
        comments3.add(c1);
        comments3.add(co1);
        comments3.add(com2);
        Hardware ticket4 = new Hardware(new Cliente("nombresote", "apellidote"), "description", comments3, LocalDateTime.of(2025,6,30, 15, 5), LocalDateTime.now(), new Dispositivo(Tipo.CAMARA, true));

        ArrayList<Comentario> comments4 = new ArrayList<>();
        comments4.add(c1);
        comments4.add(com2);
        Hardware ticket5 = new Hardware();

        Hardware ticket6 = new Hardware();
        ArrayList<Ticket> tickets = new ArrayList<>();
        tickets.add(ticket1);
        tickets.add(ticket2);
        tickets.add(ticket3);
        tickets.add(ticket4);
        tickets.add(ticket5);
        tickets.add(ticket6);

        Sistema sistema = new Sistema(tickets);


        sistema.ticketsDesarrolladosPor(d3);
        sistema.ticketsDesarrolladosPor(d1);
        sistema.ticketsDesarrolladosPor(d2);
    } */
}
