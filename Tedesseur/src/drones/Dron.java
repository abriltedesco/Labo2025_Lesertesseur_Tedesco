package drones;

import java.time.LocalDate;

public abstract class Dron {
    private String nombreModelo;
    private LocalDate fechaAdquisicion;
    private Bateria bateria;
    private Estado estado;
    private static double latitudOrigen = -34.573195;
    private static double longitudOrigen = -58.504111;

    // constructores
    public Dron(String nombreModelo, LocalDate fechaAdquisicion, Bateria bateria, Estado estado) {
        this.nombreModelo = nombreModelo;
        this.fechaAdquisicion = fechaAdquisicion;
        this.bateria = bateria;
        this.estado = estado;
    }

    public Dron() {
        this.nombreModelo = "polaris";
        this.fechaAdquisicion = LocalDate.of(2025,6,22);
        this.bateria = Bateria.CINCUENTA;
        this.estado = Estado.OPERATIVO;
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

    public Bateria getBateria() {
        return bateria;
    }

    public void setBateria(Bateria bateria) {
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


    // metodos
    public boolean rastrearDron(){
        return estado.isRastreable();
    }

    public void recargarBateria(){
        if(this.bateria.getValor() <= 20){
            this.bateria = Bateria.CIEN;
        }
        else{
            /* this.bateria += ;*/
        }
    }

    // metodos abstractos
    abstract void ejecutarMision(double latitudDestino, double longitudDestino);
    abstract String getTipo();
}
