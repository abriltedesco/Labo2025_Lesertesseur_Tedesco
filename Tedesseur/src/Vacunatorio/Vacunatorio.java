package Vacunatorio;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Vacunatorio {
    private HashMap<String, HashSet<Vacuna>> historialVacunas;

    public Vacunatorio(HashMap<String, HashSet<Vacuna>> historialVacunas) {
        this.historialVacunas = historialVacunas;
    }

    public Vacunatorio() {
        this.historialVacunas = new HashMap<>();
    }

    public HashMap<String, HashSet<Vacuna>> getHistorialVacunas() {
        return historialVacunas;
    }

    public void setHistorialVacunas(HashMap<String, HashSet<Vacuna>> historialVacunas) {
        this.historialVacunas = historialVacunas;
    }

    public void agregarAlHistorial(HashSet<Ciudadano> ciudadanos){
        for(Ciudadano ciudadano : ciudadanos){
            this.historialVacunas.put(ciudadano.getDni(), ciudadano.getVacunas());
        }
    }

    public void buscarPorDni(String dni){
        for(Vacuna vacuna : this.historialVacunas.get(dni)){
            System.out.println("Nombre:" + vacuna.getNombreComercial() + " - fecha: " + vacuna.getAplicacion());
        }
    }

    public void filtrarPorProvincia(HashSet<Ciudadano> ciudadanos, HashMap<Provincia, Integer> cantPorProvincia){
        for(Ciudadano ciudadano : ciudadanos){
            int contador = cantPorProvincia.get(ciudadano.getProvincia());
            contador ++ ;
            cantPorProvincia.remove(ciudadano.getProvincia());
            cantPorProvincia.put(ciudadano.getProvincia(), contador);
        }
    }


}
