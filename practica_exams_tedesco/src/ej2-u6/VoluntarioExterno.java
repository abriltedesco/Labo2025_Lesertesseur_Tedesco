import java.time.LocalDate;

public class VoluntarioExterno extends Participante{
    private Institucion institucion;

    public VoluntarioExterno(String nombre, String apellido, LocalDate fechaNacimiento, String direccion, String codPostal, boolean registrado, Institucion institucion) {
        super(nombre, apellido, fechaNacimiento, direccion, codPostal, registrado);
        this.institucion = institucion;
    }

    public Institucion getInstitucion() {
        return institucion;
    }

    public void setInstitucion(Institucion institucion) {
        this.institucion = institucion;
    }
}
