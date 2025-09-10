package bares;

public class Beneficio {
    private String nombre;
    private String usuario;

    public Beneficio(String nombre, String usuario) {
        this.nombre = nombre;
        this.usuario = usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
