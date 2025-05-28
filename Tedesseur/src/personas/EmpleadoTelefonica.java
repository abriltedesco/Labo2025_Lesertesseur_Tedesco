package personas;

import telefonica.Telefono;

public class EmpleadoTelefonica {
    private String nombre;
    private String apellido;
    private String dni;
    private String pais;
    private Telefono telefono;

    public EmpleadoTelefonica(String nombre, String apellido, String dni, String pais, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.pais = pais;
        this.telefono = new Telefono();
    }

    public EmpleadoTelefonica() {
        this.nombre = "andre";
        this.apellido = "benjamin";
        this.dni = "4848484848";
        this.pais = "argentina";
        this.telefono = new Telefono("4343535567");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Telefono getTelefono() {
        return telefono;
    }

    public void setTelefono(Telefono telefono) {
        this.telefono = telefono;
    }
}
