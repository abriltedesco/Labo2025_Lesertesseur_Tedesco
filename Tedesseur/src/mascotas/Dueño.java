package mascotas;

public class Dueño {
    private String nombreCompleto;
    private String nombreUsuario;


    public Dueño() {
        this.nombreCompleto = "manuela rodriguez";
        this.nombreUsuario = "manu_rodriguezz";
    }


    public Dueño(String nombreCompleto, String nombreUsuario) {
        this.nombreCompleto = nombreCompleto;
        this.nombreUsuario = nombreUsuario;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
}
