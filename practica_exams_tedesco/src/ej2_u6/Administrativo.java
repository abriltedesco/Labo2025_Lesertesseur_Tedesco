package ej2_u6;

import java.time.LocalDate;
import java.util.HashMap;

public class Administrativo extends ConSueldo{
    private String nomUser;
    private String contrasenia;
    private String codigo;

    public Administrativo(String nombre, String apellido, int edad, LocalDate fechaNacimiento, String direccion, String codPostal, boolean registrado, LocalDate fechaAlta, HashMap<LocalDate, Sueldo> sueldos, String nomUser, String contrasenia, String codigo) {
        super(nombre, apellido, edad, fechaNacimiento, direccion, codPostal, registrado, fechaAlta, sueldos);
        this.nomUser = nomUser;
        this.contrasenia = contrasenia;
        this.codigo = codigo;
    }

    public String getNomUser() {
        return nomUser;
    }

    public void setNomUser(String nomUser) {
        this.nomUser = nomUser;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public boolean seAceptaContrasenia(){
        if(this.contrasenia.length() < 8){ // falta ORs
            return false;
        }
        return true;
    }

    @Override
    public void realizarAccionSolidaria() {
        System.out.println(codigo + "" + this.getNombre());
    }
}
