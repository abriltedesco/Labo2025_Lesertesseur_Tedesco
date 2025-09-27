import ej2_u6.Persona;

public class Duenio extends Persona {
    private String dni;

    public Duenio(String nombre, String apellido, String dni) {
    super(nombre,apellido);
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
