import java.time.LocalDate;
import java.util.HashMap;

public class ConSueldo extends Participante{
    private LocalDate fechaAlta;
    private HashMap<LocalDate, Sueldo> sueldos;

    public ConSueldo(String nombre, String apellido, LocalDate fechaNacimiento, String direccion, String codPostal, boolean registrado, LocalDate fechaAlta, HashMap<LocalDate, Sueldo> sueldos) {
        super(nombre, apellido, fechaNacimiento, direccion, codPostal, registrado);
        this.fechaAlta = fechaAlta;
        this.sueldos = sueldos;
    }

    public LocalDate getFechaAlta() { 
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public HashMap<LocalDate, Sueldo> getSueldos() {
        return sueldos;
    }

    public void setSueldos(HashMap<LocalDate, Sueldo> sueldos) {
        this.sueldos = sueldos;
    }
}
