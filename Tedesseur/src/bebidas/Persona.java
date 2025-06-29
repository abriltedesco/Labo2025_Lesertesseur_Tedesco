package bebidas;

import java.util.ArrayList;

import personas.PersonaPadre;

public class Persona extends PersonaPadre {
    private String dni;
    private ArrayList<Bebida> bebidas;
   // private int cantBebidas = setCantBebidas(bebidas.size());

    public Persona(String nombre, String apellido, String dni, ArrayList bebidas /*int cantBebidas*/) {
        super(nombre, apellido);
        this.dni = dni;
        this.bebidas = bebidas;
        //this.cantBebidas = cantBebidas;
    }


    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public ArrayList<Bebida> getBebidas() {
        return bebidas;
    }

    public void setBebidas(ArrayList<Bebida> bebidas) {
        this.bebidas = bebidas;
    }


  /*   public int getCantBebidas() {
        return cantBebidas;
    }


    public int setCantBebidas(int cantBebidas) {
        this.cantBebidas = cantBebidas;
        return cantBebidas;
    }
   
*/
}
