package vehiculos;

import java.util.ArrayList;

public class SistemaVehiculo {
    private ArrayList<Coche> coches;
    private ArrayList<Bicicleta> bicicletas;
    private ArrayList<Camioneta> camionetas;

    public ArrayList<Coche> getCoches() {
        return coches;
    }

    public void setCoches(ArrayList<Coche> coches) {
        this.coches = coches;
    }

    public ArrayList<Bicicleta> getBicicletas() {
        return bicicletas;
    }

    public void setBicicletas(ArrayList<Bicicleta> bicicletas) {
        this.bicicletas = bicicletas;
    }

    public ArrayList<Camioneta> getCamionetas() {
        return camionetas;
    }

    public void setCamionetas(ArrayList<Camioneta> camionetas) {
        this.camionetas = camionetas;
    }

    public SistemaVehiculo() {
        this.coches = new ArrayList<>();
        this.bicicletas = new ArrayList<>();
        this.camionetas = new ArrayList<>();
    }

    public SistemaVehiculo(ArrayList<Coche> coches, ArrayList<Bicicleta> bicicletas, ArrayList<Camioneta> camionetas) {
        this.coches = coches;
        this.bicicletas = bicicletas;
        this.camionetas = camionetas;
    }

    public void saberMayorCantidadDeTipoDeVehiculo(){
        int mayorCantidad = coches.size();
        String tipoVehiculo = "Coches";
        if(bicicletas.size() > mayorCantidad){
            mayorCantidad = bicicletas.size();
            tipoVehiculo = "Bicicleta";
        }
        else if(camionetas.size() > mayorCantidad){
            mayorCantidad = camionetas.size();
            tipoVehiculo = "Camioneta";
        }
        System.out.println("Cantidad: " + mayorCantidad + " de tipo: " + tipoVehiculo);
    }

    public float porcentajeDescapotables(){
        float porcentaje = 0.0F;
        int cantDescapotables = 0;

        for(Coche coche : coches){
            if(coche.isEsDescapotable()){
                cantDescapotables ++;
            }
        }

        porcentaje = (float) (cantDescapotables * 100) / coches.size();
        return porcentaje;
    }

    public static void main(String[] args) {
        Bicicleta b1 = new Bicicleta();
        Bicicleta b2 = new Bicicleta("BMC", "Speeddrive", "rosa", 2, 2018);
        Bicicleta b3 = new Bicicleta("DSDAD", "California", "blanco", 2, 1999);
        ArrayList<Bicicleta> bicicletas = new ArrayList<>();
        bicicletas.add(b1);
        bicicletas.add(b2);
        bicicletas.add(b3);

        Coche c1 = new Coche ();
        Coche c2 = new Coche ();
        ArrayList<Coche> coches= new ArrayList<>();
        coches.add(c1);
        coches.add(c2);

        Camioneta cam1 = new Camioneta();
        Camioneta cam2 = new Camioneta();
        Camioneta cam3 = new Camioneta();
        ArrayList<Camioneta> camionetas= new ArrayList<>();
        camionetas.add(cam1);

        SistemaVehiculo sistema = new SistemaVehiculo(coches, bicicletas, camionetas);
        sistema.saberMayorCantidadDeTipoDeVehiculo();

        float porcentaje = sistema.porcentajeDescapotables();
        System.out.println("Porcentaje de descapotables: " + porcentaje + "%");

        cam1.aniadirCarga(36.7F);
    }
}
