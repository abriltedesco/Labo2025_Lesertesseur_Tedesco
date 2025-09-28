package ej1_u7y8;

import java.time.LocalDate;

public class Experto extends Participante implements Cocina{
    private static int tiempoLimite = 80;

    public Experto(String nombre, String apellido, LocalDate fechaNacimiento, String localidad, Color equipo) {
        super(nombre, apellido, fechaNacimiento, localidad, equipo);
    }

    @Override
    public void prepararLugarDeTrabajo() {
        System.out.println("Perdi 5 minutos preparando la mesa por lo que mi tiempo restante es: " + (tiempoLimite - 5) + "min.");
    }

    @Override
    public void prepararPlato(Plato plato) throws TiempoInsuficienteExc {
        if(puedePrepararPlato(plato)){
            System.out.println("Experto ha cocinado y servido el plato de tipo  " + plato.getTipo().toString());
        }
    }

    @Override
    public boolean puedePrepararPlato(Plato plato) throws TiempoInsuficienteExc {
        if(plato.getDuracion() > (tiempoLimite - 5) ) {
            throw new TiempoInsuficienteExc("No alcanza el tiempo para realizar este plato");
        }
        return true;
    }
}
