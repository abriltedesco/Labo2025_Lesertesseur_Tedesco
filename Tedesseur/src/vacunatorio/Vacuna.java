package vacunatorio;

import java.time.LocalDate;

public class Vacuna {
    private LocalDate fabricacion;
    private LocalDate aplicacion;
    private int numLote;
    private int numFabricacion;
    private String nombreComercial;

    public Vacuna(LocalDate fabricacion, LocalDate aplicacion, int numLote, int numFabricacion, String nombreComercial) {
        this.fabricacion = fabricacion;
        this.aplicacion = aplicacion;
        this.numLote = numLote;
        this.numFabricacion = numFabricacion;
        this.nombreComercial = nombreComercial;
    }

    public LocalDate getFabricacion() {
        return fabricacion;
    }

    public void setFabricacion(LocalDate fabricacion) {
        this.fabricacion = fabricacion;
    }

    public LocalDate getAplicacion() {
        return aplicacion;
    }

    public void setAplicacion(LocalDate aplicacion) {
        this.aplicacion = aplicacion;
    }

    public int getNumLote() {
        return numLote;
    }

    public void setNumLote(int numLote) {
        this.numLote = numLote;
    }

    public int getNumFabricacion() {
        return numFabricacion;
    }

    public void setNumFabricacion(int numFabricacion) {
        this.numFabricacion = numFabricacion;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }
}
