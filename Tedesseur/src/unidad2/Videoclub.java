package unidad2;

import java.util.ArrayList;

public class Videoclub {
    private ArrayList<ArrayList<Pelicula>> estanteria;
    private String direccion;
    private int codigoPostal;

    public Videoclub(){
        ArrayList<Pelicula> estante1 = new ArrayList<>();
        ArrayList<Pelicula> estante2 = new ArrayList<>();
        this.estanteria = new ArrayList<>();
        estanteria.add(estante1);
        estanteria.add(estante2);
        this.direccion = "constituyentes 2424";
        this.codigoPostal = 1419;
    }

    public Videoclub(ArrayList<ArrayList<Pelicula>> estanteria, String direccion, int codigoPostal) {
        this.estanteria = estanteria;
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
    }

    public ArrayList<ArrayList<Pelicula>> getEstanteria() {
        return estanteria;
    }

    public void setEstanteria(ArrayList<ArrayList<Pelicula>> estanteria) {
        this.estanteria = estanteria;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
}
