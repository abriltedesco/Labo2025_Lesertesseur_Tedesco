package drones;

import java.time.LocalDate;

public class Vigilancia extends Dron{
    private SD memoriaSD;

    public Vigilancia(String nombreModelo, LocalDate fechaAdquisicion, Bateria bateria, Estado estado, SD memoriaSD) {
        super(nombreModelo, fechaAdquisicion, bateria, estado);
        this.memoriaSD = memoriaSD;
    }

    public Vigilancia() {
        super();
        this.memoriaSD = new SD(150);
    }

    public SD getMemoriaSD() {
        return memoriaSD;
    }

    public void setMemoriaSD(SD memoriaSD) {
        this.memoriaSD = memoriaSD;
    }

    public boolean chequearAntesDeMision(double latitud, double longitud){
        double distancia = Distancia.calcularDistanciaAKm(this.getLatitudOrigen(), this.getLongitudOrigen(), latitud, longitud);
        int cantFotos = (int)distancia / 2 ;
        int cantMemoriaQueOcupara = cantFotos * 12;

        if(memoriaSD.getAlmacenamiento() >= cantMemoriaQueOcupara){
            memoriaSD.setAlmacenamiento(memoriaSD.getAlmacenamiento() - cantMemoriaQueOcupara);
            return true;
        }
        return false;
    }

    @Override
    public void ejecutarMision(double latitud, double longitud){
        if(chequearAntesDeMision(latitud, longitud)){
            // asumimos que se queda sin bateria al realizar la misionn : setBateria(0);
            System.out.println("Mision exitosa");
        }
        else{
            System.out.println("No hay suficiente espacio para las fotos, no se realiza la mision");
        }

    }
    @Override
    public String getTipo(){
        return "Vigilancia";
    }
}
