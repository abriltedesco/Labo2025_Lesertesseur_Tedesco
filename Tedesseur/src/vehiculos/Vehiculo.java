package vehiculos;

import objetos.Color;

public class Vehiculo {
    private String marca;
    private String modelo;
    private Color color;
    private int cantRuedas;
    private int anioFabricacion;

    public Vehiculo() {
        this.marca = "BMC";
        this.modelo = "Speedmachine";
        this.color = Color.NEGRO;
        this.cantRuedas = 2;
        this.anioFabricacion = 2020;
    }

    public Vehiculo(String marca, String modelo, Color color, int cantRuedas, int anioFabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.cantRuedas = cantRuedas;
        this.anioFabricacion = anioFabricacion;
    }

    public Vehiculo(String marca, String modelo, Color color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getCantRuedas() {
        return cantRuedas;
    }

    public void setCantRuedas(int cantRuedas) {
        this.cantRuedas = cantRuedas;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
