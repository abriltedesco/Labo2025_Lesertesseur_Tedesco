package deportes;

import personas.Jugador;
import fecha.Fecha;

import java.time.LocalDate;
import java.util.ArrayList;

public class Curling {
    private ArrayList<Partido> partidos ;

    public Curling(ArrayList<Partido> partidos) {
        this.partidos = partidos;
    }

    public ArrayList<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(ArrayList<Partido> partidos) {
        this.partidos = partidos;
    }

    public void agregarEquipos(ArrayList<Equipo> equipos, ArrayList<Equipo> equiposMañana, ArrayList<Equipo> equiposTarde, ArrayList<Equipo> equiposNoche) {
        for(Equipo equipo : equipos) {
            if(equipo.getDispHoraria() == Turno.MAÑANA){
                equiposMañana.add(equipo);
            }
            else if(equipo.getDispHoraria() == Turno.TARDE){
                equiposTarde.add(equipo);
            }
            else{
                equiposNoche.add(equipo);
            }
        }
    }

    public void crearPartidos(ArrayList<Partido> partidos, ArrayList<Equipo> equiposMañana, ArrayList<Equipo> equiposTarde, ArrayList<Equipo> equiposNoche) {
        for(int i = 0; i < equiposMañana.size() - 1; i++) {
            Partido partido = new Partido();
            partido.setEquipoLocal(equiposMañana.get(i));
            partido.setEquipoVisitante(equiposMañana.get(i + 1));
            partido.setFecha(new Fecha(30,4,2025));
            partidos.add(partido);
        }
        for(int i = 0; i < equiposTarde.size() - 1; i++) {
            Partido partido = new Partido();
            partido.setEquipoLocal(equiposTarde.get(i));
            partido.setEquipoVisitante(equiposTarde.get(i + 1));
            partido.setFecha(new Fecha(30,4,2025));
            partidos.add(partido);
        }
        for(int i = 0; i < equiposNoche.size() - 1; i++) {
            Partido partido = new Partido();
            partido.setEquipoLocal(equiposNoche.get(i));
            partido.setEquipoVisitante(equiposNoche.get(i + 1));
            partido.setFecha(new Fecha(30,4,2025));
            partidos.add(partido);
        }
    }

    public static void main(String[] args) {
        ArrayList<Partido> partidos = new ArrayList<Partido>();
        Curling campeonato = new Curling(partidos);

        Jugador jugador1 = new Jugador();
        Jugador jugador2 = new Jugador("Leandro", "Nessi", 1, LocalDate.of( 1999,7, 6));
        Jugador jugador3 = new Jugador("Lionel", "Messi", 10, LocalDate.of( 1989, 24, 6));

        Jugador jugador4 = new Jugador("Fernando", "Gago", 9, LocalDate.of(1982, 9, 3 ));
        Jugador jugador5 = new Jugador("Alphonso", "Davies", 19, LocalDate.of( 2000 , 2,11));
        Jugador jugador6 = new Jugador("Tiago", "Livaeres", 33, LocalDate.of( 2001, 2, 3));

        Jugador jugador7 = new Jugador("Lali", "Esposito", 12, LocalDate.of( 1992 , 10, 10 ));
        Jugador jugador8 = new Jugador("Charli", "XCX", 4, LocalDate.of( 1992, 5, 4));
        Jugador jugador9 = new Jugador("Adam", "Yauch", 2, LocalDate.of(1982, 15, 4));

        ArrayList<Jugador> jugadores = new ArrayList<>();
        jugadores.add(jugador1);
        jugadores.add(jugador2);
        jugadores.add(jugador3);
        jugadores.add(jugador4);
        jugadores.add(jugador5);
        jugadores.add(jugador6);
        jugadores.add(jugador7);
        jugadores.add(jugador8);
        jugadores.add(jugador9);

        // ----------------------------------------------------------------------------------------- //

        Equipo equipo1 = new Equipo();
        Equipo equipo2 = new Equipo("All boys", Turno.TARDE, "La Boca", jugadores);
        Equipo equipo3 = new Equipo("Tigre",  Turno.TARDE, "Tigre", jugadores);

        Equipo equipo4 = new Equipo("Coquimbo Unido",  Turno.MAÑANA, "Coquimbo", jugadores);
        Equipo equipo5 = new Equipo("Alianza Lima",  Turno.MAÑANA, "Lima", jugadores);
        Equipo equipo6 = new Equipo("Huachipato",  Turno.MAÑANA, "SANTIAGO", jugadores);

        Equipo equipo7 = new Equipo("GangWong",  Turno.NOCHE, "Corea", jugadores);
        Equipo equipo8 = new Equipo("Everton", Turno.NOCHE, "Liverpool", jugadores);
        Equipo equipo9 = new Equipo("Coventry", Turno.NOCHE, "Coventry", jugadores);

        ArrayList<Equipo> equipos = new ArrayList<>();
        equipos.add(equipo1);
        equipos.add(equipo2);
        equipos.add(equipo3);
        equipos.add(equipo4);
        equipos.add(equipo5);
        equipos.add(equipo6);
        equipos.add(equipo7);
        equipos.add(equipo8);
        equipos.add(equipo9);

        ArrayList<Equipo> equiposManiana = new ArrayList<>();   // 3 equipos
        ArrayList<Equipo> equiposTarde = new ArrayList<>();   // 3 equipos
        ArrayList<Equipo> equiposNoche= new ArrayList<>();    // 3 equipos
        
        campeonato.agregarEquipos(equipos, equiposManiana, equiposTarde, equiposNoche);

        // ---------------------------------------------------------------------------------------- //
        campeonato.crearPartidos(partidos, equiposManiana, equiposTarde, equiposNoche);
        campeonato.setPartidos(partidos);
        for(Partido partido :  partidos){
           System.out.println(partido.getEquipoVisitante() + " VS " + partido.getEquipoVisitante());
           System.out.println(partido.getFecha().getDia() + " / " + partido.getFecha().getMes() + " / " + partido.getFecha().getAnio());
       }
    }
}
