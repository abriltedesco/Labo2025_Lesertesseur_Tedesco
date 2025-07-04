package tickets;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Desarrollador d1 = new Desarrollador("Carlos", "Martínez");
        Desarrollador d2 = new Desarrollador("Laura", "Pérez");
        Desarrollador d3 = new Desarrollador("Manuel", "Rodríguez");

        Comentario c1 = new Comentario(d1, "Inicio revisión", Estado.EN_PROGRESO);
        Comentario c2 = new Comentario(d1, "Bug identificado", Estado.EN_PROGRESO);
        Comentario c3 = new Comentario(d2, "Aplicando parche", Estado.EN_PROGRESO);
        Comentario c4 = new Comentario(d2, "Parche aplicado", Estado.RESUELTO);
        Comentario c5 = new Comentario(d3, "Componente dañado", Estado.EN_PROGRESO);
        Comentario c6 = new Comentario(d3, "Reemplazo hecho", Estado.RESUELTO);

        ArrayList<Comentario> coms1 = new ArrayList<>();
        coms1.add(c1); coms1.add(c2);

        ArrayList<Comentario> coms2 = new ArrayList<>();
        coms2.add(c1); coms2.add(c3); coms2.add(c4);

        ArrayList<Comentario> coms3 = new ArrayList<>();
        coms3.add(c5); coms3.add(c6);

        ArrayList<Comentario> coms4 = new ArrayList<>();
        coms4.add(c2); coms4.add(c3);

        ArrayList<Comentario> coms5 = new ArrayList<>();
        coms5.add(c1); coms5.add(c5); coms5.add(c6);

        ArrayList<Comentario> coms6 = new ArrayList<>();
        coms6.add(c1); coms6.add(c2); coms6.add(c3); coms6.add(c4);

        Cliente cl1 = new Cliente("Andrés", "Gómez");
        Cliente cl2 = new Cliente("Lucía", "Fernández");
        Cliente cl3 = new Cliente("Martín", "García");

        Dispositivo disp1 = new Dispositivo(Tipo.CAMARA, true);
        Dispositivo disp2 = new Dispositivo(Tipo.RADAR, false);

        Software t1 = new Software(cl1, "Error en login", coms1, LocalDateTime.of(2025,6,1,10,0), LocalDateTime.of(2025,6,2,12,0), true);
        Software t2 = new Software(cl2, "Fallo al guardar", coms2, LocalDateTime.of(2025,6,3,9,0), LocalDateTime.of(2025,6,4,14,0), true);
        Software t3 = new Software(cl3, "Crash en pantalla principal", coms6, LocalDateTime.of(2025,6,5,8,0), LocalDateTime.of(2025,6,6,11,30), true);

        Hardware t4 = new Hardware(cl1, "Cámara rota", coms3, LocalDateTime.of(2025,6,2,10,0), LocalDateTime.of(2025,6,2,15,0), disp1);
        Hardware t5 = new Hardware(cl2, "Radar no responde", coms4, LocalDateTime.of(2025,6,4,10,0), null, disp2);
        Hardware t6 = new Hardware(cl3, "Sensor suelto", coms5, LocalDateTime.of(2025,6,1,8,0), LocalDateTime.of(2025,6,1,20,0), disp1);

        ArrayList<Ticket> tickets = new ArrayList<>();
        tickets.add(t1); tickets.add(t2); tickets.add(t3);
        tickets.add(t4); tickets.add(t5); tickets.add(t6);

        Sistema sistema = new Sistema(tickets);

        System.out.println("Cantidad total de tickets: " + sistema.cantTicketsTotal());
        System.out.println("Tickets RESUELTOS: " + sistema.cantTicketsEnEstado(Estado.RESUELTO));
        System.out.println("Tickets EN PROGRESO: " + sistema.cantTicketsEnEstado(Estado.EN_PROGRESO));
        System.out.println("Tickets ABIERTOS: " + sistema.cantTicketsEnEstado(Estado.ABIERTO));

        Ticket masAntiguo = sistema.masAntiguo();
        System.out.println("Ticket más antiguo no tomado por desarrollador: " + masAntiguo.getDescripcion());

        System.out.println("Desarrollador con más tickets resueltos: " + sistema.desarrolladorQueMasResuelve().getNombre());

        System.out.println("Tickets trabajados por Manuel Rodríguez: " + sistema.ticketsDesarrolladosPor(d3).size());

        System.out.println("Desarrolladores que trabajaron en el ticket t2:");
        for (Desarrollador d : sistema.desarrolladoresDelTicket(t2)) {
            System.out.println("- " + d.getNombre() + " " + d.getApellido());
        }

        System.out.println("Promedio de resolución (en horas): " + sistema.promedioResolucion());
    }
}
