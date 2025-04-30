package deportes;

import unidad1.Fecha;

import java.util.ArrayList;

public class Curling {
    private ArrayList<Partido> partidos;

    public Curling(ArrayList<Partido> partidos) {
        this.partidos = partidos;
    }

    public ArrayList<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(ArrayList<Partido> partidos) {
        this.partidos = partidos;
    }



    public static void main(String[] args) {

        Jugador jugador1 = new Jugador();
        Jugador jugador2 = new Jugador("Leandro", "Nessi", 1, new Fecha(17, 6, 1999));
        Jugador jugador3 = new Jugador("Lionel", "Messi", 10, new Fecha(24, 6, 1989));

        Jugador jugador4 = new Jugador("Fernando", "Gago", 9, new Fecha(9, 3, 1982));
        Jugador jugador5 = new Jugador("Alphonso", "Davies", 19, new Fecha(2, 11, 2000));
        Jugador jugador6 = new Jugador("Tiago", "Livaeres", 33, new Fecha(2, 3, 2001));

        Jugador jugador7 = new Jugador("Lali", "Esposito", 12, new Fecha(10, 10, 1992));
        Jugador jugador8 = new Jugador("Charli", "XCX", 4, new Fecha(15, 4, 1992));
        Jugador jugador9 = new Jugador("Adam", "Yauch", 2, new Fecha(15, 4, 1982));

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
        Equipo equipo2 = new Equipo("All boys", "Tarde", "La Boca", jugadores);
        Equipo equipo3 = new Equipo("Tigre", "Tarde", "Tigre", jugadores);

        Equipo equipo4 = new Equipo("Coquimbo Unido", "Mañana", "Coquimbo", jugadores);
        Equipo equipo5 = new Equipo("Alianza Lima", "Mañana", "Lima", jugadores);
        Equipo equipo6 = new Equipo("Huachipato", "Mañana", "SANTIAGO", jugadores);

        Equipo equipo7 = new Equipo("GangWong", "Noche", "Corea", jugadores);
        Equipo equipo8 = new Equipo("Everton", "Noche", "Liverpool", jugadores);
        Equipo equipo9 = new Equipo("Coventry", "Noche", "Coventry", jugadores);

        ArrayList<Equipo> equiposMañana = new ArrayList<>();   // 3 equipos
        ArrayList<Equipo> equiposTarde = new ArrayList<>();   // 3 equipos
        ArrayList<Equipo> equiposNoche= new ArrayList<>();    // 3 equipos

        equiposMañana.add(equipo1);
        equiposMañana.add(equipo2);
        equiposMañana.add(equipo3);

        equiposTarde.add(equipo4);
        equiposTarde.add(equipo5);
        equiposTarde.add(equipo6);

        equiposNoche.add(equipo7);
        equiposNoche.add(equipo8);
        equiposNoche.add(equipo9);

        // ---------------------------------------------------------------------------------------- //

        Partido partido = new Partido();
        Partido partido1 = new Partido();

        partido.getEquipoLocal().getDispHoraria().equals(partido.getEquipoVisitante().getDispHoraria());
    }
}

