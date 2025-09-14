package tratamientos;

import java.time.LocalDate;

public class Ninio extends Paciente implements Tratamiento {
    private int nivelTolerancia;
    private static int costoFijo = 450000;

    public Ninio(String nombre, int edad, String apellido, LocalDate fechaNacimiento, Genero genero,
            TipoSangre tipoSangre, int nivelTolerancia) {
        super(nombre, edad, apellido, fechaNacimiento, genero, tipoSangre);
        this.nivelTolerancia = nivelTolerancia;
    }

    @Override
    public boolean tieneEdadRequerida() {
        if (this.getEdad() < 3) {
            return false;
        }
        return true;
    }

    @Override
    public String mensajeTratamiento() {
        String mensajeApto = "Tu tratamiento tardará esta cantidad de días: " + nivelTolerancia * 2;
        String mensajeNoApto = "Aún es chico para probar el tratamiento";
        if (tieneEdadRequerida()) {
            return mensajeApto;
        } else {
            return mensajeNoApto;
        }

    }

    //@Override
    //public void mensajeTratamiento() {
    //    System.out.println("Tu tratamiento tardará esta cantidad de días: " + nivelTolerancia * 2);
    //}

    @Override
    public int costoTotalTratamiento() {
        return nivelTolerancia * costoFijo;
    }

}
