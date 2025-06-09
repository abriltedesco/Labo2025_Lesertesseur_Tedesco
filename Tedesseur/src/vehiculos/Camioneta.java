package vehiculos;

import objetos.Color;

public class Camioneta extends Motorizado{
    private float capacidadCargaTotal;
    private float capacidadCargaActual;

    public Camioneta(){
        super();
        this.capacidadCargaTotal = 95.5F;
        this.capacidadCargaActual = 5.5F;
    }

    public Camioneta(String marca, String modelo, Color color, String patente, float capacidadCargaTotal, float capacidadCargaActual) {
        super(patente, marca, modelo, color);
        this.capacidadCargaTotal = capacidadCargaTotal;
        this.capacidadCargaActual = capacidadCargaActual;
    }

    public float getCapacidadCargaTotal() {
        return capacidadCargaTotal;
    }

    public void setCapacidadCargaTotal(float capacidadCargaTotal) {
        this.capacidadCargaTotal = capacidadCargaTotal;
    }

    public float getCapacidadCargaActual() {
        return capacidadCargaActual;
    }

    public void setCapacidadCargaActual(float capacidadCargaActual) {
        this.capacidadCargaActual = capacidadCargaActual;
    }

    public void aniadirCarga(float cargaPorAniadir){
        float cargaTotal = 0.0F;
        if(cargaPorAniadir < capacidadCargaTotal) {
            cargaTotal = cargaPorAniadir + capacidadCargaActual;
            if (cargaTotal < capacidadCargaTotal) {
                capacidadCargaActual = cargaTotal;
            }
            else{
                System.out.println("La suma de la carga que quiere añadir y la carga actual superan la cantidad maxima");
            }
        }
        else{
            System.out.println("La suma de la carga que quiere añadir supera la cantidad maxima");
        }
    }
}
