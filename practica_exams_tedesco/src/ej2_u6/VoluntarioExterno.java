package ej2_u6;

import java.time.LocalDate;

public class VoluntarioExterno extends Participante{
    private Institucion institucion;

    public VoluntarioExterno(String nombre, String apellido,int edad, LocalDate fechaNacimiento, String direccion, String codPostal, boolean registrado, Institucion institucion) {
        super(nombre, apellido,edad, fechaNacimiento, direccion, codPostal, registrado);
        this.institucion = institucion;
    }

    public Institucion getInstitucion() {
        return institucion;
    }

    public void setInstitucion(Institucion institucion) {
        this.institucion = institucion;
    }

    @Override
    public void realizarAccionSolidaria() {
        System.out.println("Ofrezco mi ayuda para lo que necesiten");
    }
}
