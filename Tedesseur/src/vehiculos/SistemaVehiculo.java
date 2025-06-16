package vehiculos;

import objetos.Color;

import java.util.ArrayList;

public class SistemaVehiculo {
    private ArrayList<Vehiculo> vehiculos;

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }
    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public SistemaVehiculo() {
        this.vehiculos = new ArrayList<>();
    }

    public SistemaVehiculo(ArrayList<Coche> coches, ArrayList<Bicicleta> bicicletas, ArrayList<Camioneta> camionetas) {
        this.vehiculos = new ArrayList<>();
        this.vehiculos.addAll(coches);
        this.vehiculos.addAll(bicicletas);
        this.vehiculos.addAll(camionetas);
    }


    public void saberMayorCantidadDeTipoDeVehiculo(){
        int mayorCantidad = 0;
        String tipoVehiculo = "Coches";
        for(Vehiculo vehiculo : vehiculos){
            if(vehiculo instanceof Coche){
                if(vehiculos.size() > mayorCantidad){
                    mayorCantidad = vehiculos.size();
                    tipoVehiculo = "Coches";
                }
            }
            else if(vehiculo instanceof Bicicleta){
                if(vehiculos.size() > mayorCantidad){
                    mayorCantidad = vehiculos.size();
                    tipoVehiculo = "Bicicleta";
                }
            }
            else if(vehiculo instanceof Camioneta){
                if(vehiculos.size() > mayorCantidad){
                    mayorCantidad = vehiculos.size();
                    tipoVehiculo = "Camioneta";
                }
            }
        }
        System.out.println("Cantidad: " + mayorCantidad + " de tipo: " + tipoVehiculo);
    }
    

public float porcentajeDescapotables(){
    float porcentaje = 0.0F;
    int cantDescapotables = 0;
    int cantAutos = 0;

    for(Vehiculo coche : vehiculos){
        if(coche instanceof Coche){
            if(((Coche) coche).isEsDescapotable()){
                cantDescapotables ++;
            }
            cantAutos ++;
        }
    }

    porcentaje = (float) (cantDescapotables * 100) / cantAutos;
    return porcentaje;
}

public static void main(String[] args) {
    Bicicleta b1 = new Bicicleta();
    Bicicleta b2 = new Bicicleta("BMC", "Speeddrive", Color.ROSA, 2, 2018);
    Bicicleta b3 = new Bicicleta("DSDAD", "California", Color.NEGRO, 2, 1999);
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
    camionetas.add(cam2);
    camionetas.add(cam3);

    SistemaVehiculo sistema = new SistemaVehiculo(coches, bicicletas, camionetas);
    sistema.saberMayorCantidadDeTipoDeVehiculo();

    float porcentaje = sistema.porcentajeDescapotables();
    System.out.println("Porcentaje de descapotables: " + porcentaje + "%");

    cam1.aniadirCarga(36.7F);
}
}