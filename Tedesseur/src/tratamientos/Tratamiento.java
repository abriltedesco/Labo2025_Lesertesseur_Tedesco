package tratamientos;

public interface Tratamiento {
     boolean tieneEdadRequerida();
     void comunicadoIncumplimientoEdad();
     void mensajeTratamiento();
     int costoTotalTratamiento();
}
