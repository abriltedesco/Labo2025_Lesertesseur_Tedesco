package drones;

import java.time.LocalDate;

public class Carga extends Dron{
    private double pesoCarga;

    public Carga(){
        super();
        this.pesoCarga = 57;
    }

    public Carga(String nombreModelo, LocalDate fechaAdquisicion, double bateria, Estado estado, double latitudDestino, double longitudDestino, double pesoCarga) {
        super(nombreModelo, fechaAdquisicion, bateria, estado, latitudDestino, longitudDestino);
        this.pesoCarga = pesoCarga;
    }

    public double getPesoCarga() {
        return pesoCarga;
    }

    public void setPesoCarga(double pesoCarga) {
        this.pesoCarga = pesoCarga;
    }

    @Override
    public void ejecutarMision (){
        double distancia = this.calcularDistanciaEnKm();
        if(distancia <= 30){
            if(this.getBateria() < 20){
                recargarBateria();
            }
            else if(this.getBateria() >= 50){
                System.out.println("La misión fue exitosa.");
            }
            else{
                System.out.println("Misión ha fallado, dron sin bateria");
            }
        }
    }
}
