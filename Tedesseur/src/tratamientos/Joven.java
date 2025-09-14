package tratamientos;

import java.time.LocalDate;

public class Joven extends Paciente implements Tratamiento {
    private static int edadMin = 20;
    private static int edadMax = 30;
    private int cantActividades;

    public Joven(String nombre, int edad, String apellido, LocalDate fechaNacimiento, Genero genero,
            TipoSangre tipoSangre, int cantActividades) {
        super(nombre, edad, apellido, fechaNacimiento, genero, tipoSangre);
        this.cantActividades = cantActividades;
    }

    @Override
    public boolean tieneEdadRequerida() {
        if (this.getEdad() > edadMin && this.getEdad() < (edadMax - 2)) {
            return false;
        }
        return true;
    }

    // @Override
    // public void comunicadoIncumplimientoEdad() {
    // if(!tieneEdadRequerida() && (cantActividades%2 !=0) ){
    // System.out.println("Lamentamos comunicarte que tu sangre aún no va a poder
    // ser modificada");
    // }
    // }

    @Override
    public String mensajeTratamiento() {
        String mensajeApto = "Será un tratamiento costoso, pero lo vamos a lograr";
        String mensajeNoApto = "Lamentamos comunicarte que tu sangre aún no va a poder ser modificada";

        if ((cantActividades % 2 != 0) && (getEdad() < edadMax - 2)) {
            return mensajeNoApto;
        } else {
            return mensajeApto;
        }

    }

    @Override
    public int costoTotalTratamiento() {
        if (getFechaNacimiento().getYear() % 2 == 0) {
            return getFechaNacimiento().getMonthValue() * 760000;
        } else {
            return getFechaNacimiento().getDayOfMonth() * 145000;
        }
    }
}
