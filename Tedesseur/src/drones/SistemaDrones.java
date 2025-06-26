package drones;

import java.time.LocalDate;
import java.util.ArrayList;

public class SistemaDrones {
    private ArrayList<Dron> drones;
    private static int contador;

    public SistemaDrones(ArrayList<Dron> drones) {
        this.drones = drones;
    }

    public SistemaDrones() {
        this.drones = new ArrayList<>();
    }

    public ArrayList<Dron> getDrones() {
        return drones;
    }

    public void setDrones(ArrayList<Dron> drones) {
        this.drones = drones;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        SistemaDrones.contador = contador;
    }

    public void agregarAlistaDeDrones(Dron dron){
        if(dron.getEstado() == Estado.OPERATIVO){
            this.drones.add(dron);
        }
    }

    public int cantDrones(){
        return this.drones.size();
    }

    public void mostrarDrones(){
        for(int i = 0; i < this.drones.size(); i++){
            Dron dron = drones.get(i);
            System.out.println("Dron" + (i+1) + " | nombre: " + dron.getNombreModelo() + " de tipo: " + dron.getTipo());
        }
    }

    public static void main(String[] args) {
        Vigilancia dron1 = new Vigilancia();
        Vigilancia dron2 = new Vigilancia("nombre", LocalDate.now(), Bateria.CINCUENTA, Estado.OPERATIVO, new SD(90));
        Vigilancia dron3 = new Vigilancia("nombre", LocalDate.now(), Bateria.CINCUENTA, Estado.INACTIVO, new SD(0));
        Carga dron4 = new Carga();
        Carga dron5 = new Carga("nombre", LocalDate.now(),Bateria.OCHENTA, Estado.INACTIVO, 70);
        Carga dron6 = new Carga("nombre", LocalDate.now(), Bateria.OCHENTA, Estado.OPERATIVO, 90);
        Carga dron7 = new Carga("nombre", LocalDate.now(), Bateria.SETENTA, Estado.OPERATIVO, 80);
        Carga dron8 = new Carga("nombre", LocalDate.now(), Bateria.OCHENTA, Estado.OPERATIVO, 90);

        SistemaDrones sistema = new SistemaDrones();
        sistema.agregarAlistaDeDrones(dron1);
        sistema.agregarAlistaDeDrones(dron2);
        sistema.agregarAlistaDeDrones(dron3);
        sistema.agregarAlistaDeDrones(dron4);
        sistema.agregarAlistaDeDrones(dron5);
        sistema.agregarAlistaDeDrones(dron6);
        sistema.agregarAlistaDeDrones(dron7);
        sistema.agregarAlistaDeDrones(dron8);

        sistema.mostrarDrones();
        System.out.println( "cantidad de drones: "  + sistema.cantDrones());
        sistema.setContador(sistema.cantDrones());

        dron8.ejecutarMision(-87.9999, -12.999);
        dron5.ejecutarMision(-55.34503, -72.29502);
        dron2.ejecutarMision(-33.432, -35.678);
    }
}
