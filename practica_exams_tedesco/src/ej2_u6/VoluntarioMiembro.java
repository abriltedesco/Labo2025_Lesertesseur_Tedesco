package ej2_u6;

import java.time.LocalDate;

public class VoluntarioMiembro extends Participante{
    private int puntaje;

    public VoluntarioMiembro(String nombre, String apellido,int edad, LocalDate fechaNacimiento, String direccion, String codPostal, boolean registrado, int puntaje) {
        super(nombre, apellido, edad, fechaNacimiento, direccion, codPostal, registrado);
        this.puntaje = puntaje;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    @Override
    public void realizarAccionSolidaria() {
        System.out.println("Ofrezco mi ayuda para lo que necesiten");
        this.puntaje ++;
    }

}
