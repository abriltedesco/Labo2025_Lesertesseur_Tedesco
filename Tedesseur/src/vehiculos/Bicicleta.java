package vehiculos;

import objetos.Color;

public class Bicicleta extends Vehiculo{
    public Bicicleta(){
        super();
    }

    public Bicicleta(String marca, String modelo, Color color, int cantRuedas, int anioFabricacion) {
        super(marca, modelo, color, cantRuedas, anioFabricacion);
    }
}
