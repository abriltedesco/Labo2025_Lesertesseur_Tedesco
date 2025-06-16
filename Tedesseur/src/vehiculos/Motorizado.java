package vehiculos;

import objetos.Color;

public class Motorizado extends Vehiculo{
    private String patente;

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public Motorizado() {
        super("Porsche", "Cayman", Color.ROSA);
        this.patente = "J4JA4J4";
    }
    
    public Motorizado(String patente, String marca, String modelo, Color color) {
        super(marca, modelo, color);
        this.patente = patente;
    }

    public Motorizado(String patente, String marca, String modelo, Color color, int cantidadRuedas, int anio) {
        super(marca, modelo, color, cantidadRuedas, anio);
        this.patente = patente;
    }
}