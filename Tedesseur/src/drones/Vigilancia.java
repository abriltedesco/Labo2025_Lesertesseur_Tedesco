package drones;

import java.time.LocalDate;

public class Vigilancia extends Dron{
    private SD memoriaSD;

    public Vigilancia(String nombreModelo, LocalDate fechaAdquisicion, double bateria, Estado estado, double latitudDestino, double longitudDestino, SD memoriaSD) {
        super(nombreModelo, fechaAdquisicion, bateria, estado, latitudDestino, longitudDestino);
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

    public void chequearAntesDeMision(){
        double distancia = this.calcularDistanciaEnKm();
        int cantFotos = (int)distancia / 2 ;
        int cantMemoriaQueOcupara = cantFotos * 12;

        if(memoriaSD.getAlmacenamiento() >= cantMemoriaQueOcupara){
            memoriaSD.setAlmacenamiento(memoriaSD.getAlmacenamiento() - cantMemoriaQueOcupara);
            ejecutarMision();
        }
        else{
            System.out.println("No hay suficiente espacio para las fotos");
        }
    }

    @Override
    public void ejecutarMision(){
        // asumimos que se queda sin bateria al realizar la misionn : setBateria(0);

        if (chequearAntesDeMision()){
            System.out.println("Mision exitosa");
        }

    }
}
