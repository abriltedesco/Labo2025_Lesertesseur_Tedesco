package bebidas;

import java.util.ArrayList;

import personas.PersonaPadre;

public class Persona extends PersonaPadre {
    private String dni;
    private ArrayList<Consumicion> bebidas;


    public Persona(String nombre, String apellido, String dni, ArrayList<Consumicion> bebidas) {
        super(nombre, apellido);
        this.dni = dni;
        this.bebidas = bebidas;
    }

    public String getDni() {

        return dni;
    }

    public void setDni(String dni) {

        this.dni = dni;
    }

    public ArrayList<Consumicion> getBebidas() {
        return bebidas;
    }

    public void setBebidas(ArrayList<Consumicion> bebidas) {

        this.bebidas = bebidas;
    }

    public int cantBebidas() {
        return bebidas.size();
    }

    public double getCoeficiente(){
        double coeficiente = 0;
        for(Consumicion bebida : bebidas){
            coeficiente += bebida.calcularImpacto();
        }
        return coeficiente;
    }

    public void agregarConsumicion(Bebida bebida, int cant){
        this.bebidas.add(new Consumicion(bebida,cant));
    }


}
