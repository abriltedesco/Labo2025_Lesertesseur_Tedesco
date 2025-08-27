import java.time.LocalDate;

public class Participante extends Persona{
    private LocalDate fechaNacimiento;
    private String direccion;
    private String codPostal;
    private boolean registrado;

    public Participante(String nombre, String apellido, LocalDate fechaNacimiento, String direccion, String codPostal, boolean registrado) {
        super(nombre, apellido);
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.codPostal = codPostal;
        this.registrado = registrado;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }

    public boolean isRegistrado() {
        return registrado;
    }

    public void setRegistrado(boolean registrado) {
        this.registrado = registrado;
    }
}
