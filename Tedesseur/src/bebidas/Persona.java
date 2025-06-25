package bebidas;

import personas.PersonaPadre;

public class Persona extends PersonaPadre {
    private String dni;

    public Persona(String nombre, String apellido, String dni) {
        super(nombre, apellido);
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
