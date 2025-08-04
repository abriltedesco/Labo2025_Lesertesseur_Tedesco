package vacunatorio;

import personas.PersonaPadre;

import java.util.HashSet;

public class Ciudadano extends PersonaPadre {
    private String dni;
    private Provincia provincia;
    private String domicilio;
    private String mail;
    private HashSet<Vacuna> vacunas = new HashSet<>();

    public Ciudadano(String nombre, String apellido, String dni, Provincia provincia, String domicilio, String mail, HashSet<Vacuna> vacunas) {
        super(nombre, apellido);
        this.dni = dni;
        this.provincia = provincia;
        this.domicilio = domicilio;
        this.mail = mail;
        this.vacunas = vacunas;
    }

    public Ciudadano() {
        this.dni = "12345678";
        this.provincia = Provincia.CHUBUT;
        this.domicilio = "domicilio";
        this.mail = "aa@yahoo.com";
        this.vacunas = new HashSet<>();
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public HashSet<Vacuna> getVacunas() {
        return vacunas;
    }

    public void setVacunas(HashSet<Vacuna> vacunas) {
        this.vacunas = vacunas;
    }

    public void agregarVacuna(Vacuna vacuna){
        this.vacunas.add(vacuna);
    }

    public void borrarVacuna(Vacuna vacuna){
        this.vacunas.remove(vacuna);
    }

    public void modificarVacuna(Vacuna vacunaVieja, Vacuna vacunaNueva){
        borrarVacuna(vacunaVieja);
        agregarVacuna(vacunaNueva);
    }

    public boolean cumplenConCantidad(int cantVacunas){
        return this.vacunas.size() >= cantVacunas ? true :  false;
    }

    public boolean seDioLaVacuna(Vacuna vacuna){
        return this.vacunas.contains(vacuna) ? true : false;
    }
}
