package drones;

import java.time.LocalDate;

public class Carga extends Dron{
    private double pesoCarga;

    public Carga(){
        super();
        this.pesoCarga = 57;
    }

    public Carga(String nombreModelo, LocalDate fechaAdquisicion, Bateria bateria, Estado estado, double pesoCarga) {
        super(nombreModelo, fechaAdquisicion, bateria, estado);
        this.pesoCarga = pesoCarga;
    }

    public double getPesoCarga() {
        return pesoCarga;
    }

    public void setPesoCarga(double pesoCarga) {
        this.pesoCarga = pesoCarga;
    }

    @Override
    public void ejecutarMision(double latitud, double longitud){
        double distancia = Distancia.calcularDistanciaAKm(this.getLatitudOrigen(), this.getLongitudOrigen(), latitud, longitud);
        if(distancia <= 30){
            if(this.getBateria().getValor() < 20){
                recargarBateria();
            }
            else if(this.getBateria().getValor() >= 50){
                System.out.println("La misión fue exitosa.");
            }
            else{
                System.out.println("Misión ha fallado, dron sin bateria");
            }
        }
    }

    @Override
    public String getTipo(){
        return "Carga";
    }
}
