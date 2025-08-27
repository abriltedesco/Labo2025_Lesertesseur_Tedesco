import java.time.LocalDate;

public class VoluntarioMiembro extends Participante{
    private int puntaje;

    public VoluntarioMiembro(String nombre, String apellido, LocalDate fechaNacimiento, String direccion, String codPostal, boolean registrado, int puntaje) {
        super(nombre, apellido, fechaNacimiento, direccion, codPostal, registrado);
        this.puntaje = puntaje;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
}
