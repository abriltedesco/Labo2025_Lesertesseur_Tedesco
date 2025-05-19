package vehiculos;

public class Camioneta extends Vehiculo{
    private String patente;
    private float capacidadCargaTotal;
    private float capacidadCargaActual;

    public Camioneta(){
        super();
        this.patente = "AD105MF";
        this.capacidadCargaTotal = 95.5F;
        this.capacidadCargaActual = 5.5F;
    }

    public Camioneta(String marca, String modelo, String color,String patente, float capacidadCargaTotal, float capacidadCargaActual) {
        super(marca, modelo, color);
        this.patente = patente;
        this.capacidadCargaTotal = capacidadCargaTotal;
        this.capacidadCargaActual = capacidadCargaActual;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
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
