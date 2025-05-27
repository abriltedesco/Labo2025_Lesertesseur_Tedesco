package vehiculos;

public class Motorizado extends Vehiculo{
    private String patente;

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public Motorizado() {
        super("Porsche", "Cayman", "Rosita");
        this.patente = "J4JA4J4";
    }
    
    public Motorizado(String patente, String marca, String modelo, String color) {
        super(marca, modelo, color);
        this.patente = patente;
    }

    public Motorizado(String patente, String marca, String modelo, String color, int cantidadRuedas, int anio) {
        super(marca, modelo, color, cantidadRuedas, anio);
        this.patente = patente;
    }
}