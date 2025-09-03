package ej2_u6;

import java.util.HashMap;
import java.util.HashSet;

public class ONG {
    private static HashMap<TipoParticipante, HashSet<String>> barrios = ONG.asignacionBarrios();
    private HashSet<Participante> participantes;

    public static HashSet<String> agregarBarriosProfe(){
        HashSet<String> barrios = new HashSet<>();
        barrios.add("Puerto Madero");
        barrios.add("San Cristobal");
        barrios.add("Palermo");
        barrios.add("Monte Castro");
        barrios.add("Versalles");
        barrios.add("Villa Santa Rita");
        barrios.add("Colegiales");
        return barrios;
    }

    public static HashSet<String> agregarBarriosAdmin(){
        HashSet<String> barrios = new HashSet<>();
        barrios.add("Flores");
        barrios.add("Floresta");
        barrios.add("Agronomia");
        barrios.add("Colegiales");
        barrios.add("Parque Chas");
        return barrios;
    }

    public static HashSet<String> agregarBarriosExt(){
        HashSet<String> barrios = new HashSet<>();
        barrios.add("Palermo");
        barrios.add("Coghlan");
        barrios.add("Parque Patricios");
        barrios.add("Barracas");
        barrios.add("Retiro");
        barrios.add("Saavedra");
        return barrios;
    }

    public static HashSet<String> agregarBarriosMiembro(){
        HashSet<String> barrios = new HashSet<>();
        barrios.add("Monserrat");
        barrios.add("Nueva Pompeya");
        barrios.add("Nuñez");
        barrios.add("Belgrano");
        barrios.add("Constuticion");
        return barrios;
    }

    public static HashMap<TipoParticipante, HashSet<String>> asignacionBarrios(){
        HashMap<TipoParticipante, HashSet<String>> barrios = new HashMap<>();
        HashSet<String> barriosProfesor = agregarBarriosProfe();
        HashSet<String> barriosAdmin = agregarBarriosAdmin();
        HashSet<String> barriosExterno = agregarBarriosExt();
        HashSet<String> barriosMiembro = agregarBarriosMiembro();
        barrios.put(TipoParticipante.PROFESOR, barriosProfesor);
        barrios.put(TipoParticipante.ADMINISTRATIVO, barriosAdmin);
        barrios.put(TipoParticipante.VOLUNTARIO_EXTERNO, barriosExterno);
        barrios.put(TipoParticipante.VOLUNTARIO_MIEMBRO, barriosMiembro);
        return barrios;
    }
    public int cantTrabajadoresDelBanco(Banco banco){
        int contador = 0;
        for(Participante participante : this.participantes) {
            if(participante instanceof ConSueldo){
                for (Sueldo sueldo : ((ConSueldo) participante).getSueldos().values()) {
                    if (sueldo.getBanco() == banco) {
                        contador++;
                    }
                }
            }
        }
        return contador;
    }

    public void cantTrabajadoresPorBanco(){
        for(Banco banco : Banco.values()){
            System.out.println("Banco: " + banco.name() + " - cant: " + cantTrabajadoresDelBanco(banco));
        }
    }

    public void mostrarNombreIntegrantes(){
        for(Participante participante : this.participantes) {
            if(participante instanceof ConSueldo){
               if( ((ConSueldo) participante).entroHaceMenosDe2Meses() ){
                   System.out.println(participante.getNombre());
               }
            }
        }
    }

    public static void main(String[] args) {
        // faltaria completar aca
    }
}
