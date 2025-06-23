package drones;

import java.time.LocalDate;

public abstract class Dron {
    private String nombreModelo;
    private LocalDate fechaAdquisicion;
    private double bateria;
    private Estado estado;
    private static double latitudOrigen = -34.573195;
    private static double longitudOrigen = -58.504111;
    private double latitudDestino;
    private double longitudDestino;

    // constructores
    public Dron(String nombreModelo, LocalDate fechaAdquisicion, double bateria, Estado estado, double latitudDestino, double longitudDestino) {
        this.nombreModelo = nombreModelo;
        this.fechaAdquisicion = fechaAdquisicion;
        this.bateria = bateria;
        this.estado = estado;
        this.latitudDestino = latitudDestino;
        this.longitudDestino = longitudDestino;
    }

    public Dron() {
        this.nombreModelo = "polaris";
        this.fechaAdquisicion = LocalDate.of(2025,6,22);
        this.bateria = 50;
        this.estado = Estado.OPERATIVO;
        this.latitudDestino = -34.53332;
        this.longitudDestino = -57.56166;
    }

    // getters y setters
    public String getNombreModelo() {
        return nombreModelo;
    }

    public void setNombreModelo(String nombreModelo) {
        this.nombreModelo = nombreModelo;
    }

    public LocalDate getFechaAdquisicion() {
        return fechaAdquisicion;
    }

    public void setFechaAdquisicion(LocalDate fechaAdquisicion) {
        this.fechaAdquisicion = fechaAdquisicion;
    }

    public double getBateria() {
        return bateria;
    }

    public void setBateria(double bateria) {
        this.bateria = bateria;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public static double getLatitudOrigen() {
        return latitudOrigen;
    }

    public static void setLatitudOrigen(double latitudOrigen) {
        Dron.latitudOrigen = latitudOrigen;
    }

    public static double getLongitudOrigen() {
        return longitudOrigen;
    }

    public static void setLongitudOrigen(double longitudOrigen) {
        Dron.longitudOrigen = longitudOrigen;
    }

    public double getLatitudDestino() {
        return latitudDestino;
    }

    public void setLatitudDestino(double latitudDestino) {
        this.latitudDestino = latitudDestino;
    }

    public double getLongitudDestino() {
        return longitudDestino;
    }

    public void setLongitudDestino(double longitudDestino) {
        this.longitudDestino = longitudDestino;
    }

    // metodos
    public double calcularDistanciaEnKm(){
        // Convertir a radianes
        double lat1Rad = Math.toRadians(latitudOrigen);
        double lon1Rad = Math.toRadians(longitudOrigen);
        double lat2Rad = Math.toRadians(latitudDestino);
        double lon2Rad = Math.toRadians(longitudDestino);

        // Fórmula de Haversine
        double dLat = lat2Rad - lat1Rad;
        double dLon = lon2Rad - lon1Rad;
        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) +  Math.cos(lat1Rad) * Math.cos(lat2Rad) * Math.sin(dLon / 2) * Math.sin(dLon / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double radioTierraKm = 6371;
        return radioTierraKm * c;
    }

    public void recargarBateria(){
        if(this.bateria <= 20){
            this.bateria = 100;
        }
        else{
            this.bateria += 10;
        }
    }

    // metodos abstractos
    abstract void ejecutarMision();

}
