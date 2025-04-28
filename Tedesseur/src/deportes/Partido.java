package deportes;

import unidad1.Fecha;

public class Partido {
    private Equipo equipoLocal;
    private Equipo equipoVisitante;
    private Fecha fecha;

    public Partido(Equipo equipoLocal, Fecha fecha, Equipo equipoVisitante) {
        this.equipoLocal = equipoLocal;
        this.fecha = fecha;
        this.equipoVisitante = equipoVisitante;
    }

    public Partido(){
        this.equipoLocal = new Equipo("Boca", "Tarde", "La Boca");
        this.equipoVisitante = new Equipo("Racing", "Tarde", "Avellaneda");
        this.fecha = new Fecha(28,4,2025);
    }

    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(Equipo equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(Equipo equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }
}
