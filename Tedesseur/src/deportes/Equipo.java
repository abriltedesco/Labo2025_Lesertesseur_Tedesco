package deportes;

import personas.Jugador;

import java.util.ArrayList;

public class Equipo {
    private String nombreEquipo;
    private String barrio;
    private Turno dispHoraria;
    private ArrayList<Jugador> jugadores;

    public Equipo(String nombreEquipo, Turno dispHoraria, String barrio) {
        this.nombreEquipo = nombreEquipo;
        this.dispHoraria = dispHoraria;
        this.barrio = barrio;
        this.jugadores = new ArrayList<Jugador>();
    }

    public Equipo(String nombreEquipo, Turno dispHoraria, String barrio, ArrayList<Jugador> jugadores) {
        this.nombreEquipo = nombreEquipo;
        this.dispHoraria = dispHoraria;
        this.barrio = barrio;
        this.jugadores = jugadores;
    }

    public Equipo(){
        this.nombreEquipo = "River";
        this.dispHoraria = Turno.TARDE;
        this.barrio = "Nuñez";
        this.jugadores = new ArrayList<Jugador>();
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public Turno getDispHoraria() {
        return dispHoraria;
    }

    public void setDispHoraria(Turno dispHoraria) {
        this.dispHoraria = dispHoraria;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
}
