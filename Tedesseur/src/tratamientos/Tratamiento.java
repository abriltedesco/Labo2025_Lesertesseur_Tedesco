package tratamientos;

public interface Tratamiento {
     boolean tieneEdadRequerida();
     //String comunicadoIncumplimientoEdad();
     String mensajeTratamiento();
     int costoTotalTratamiento();
}
