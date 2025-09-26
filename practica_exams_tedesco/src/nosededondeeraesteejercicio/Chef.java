package nosededondeeraesteejercicio;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Chef {
    private String nombre;
    private Especialidad esp;
    private HashMap<LocalDate, HashSet<Evento>> eventos;

    public Chef(String nombre, Especialidad esp, HashMap<LocalDate, HashSet<Evento>> eventos) {
        this.nombre = nombre;
        this.esp = esp;
        this.eventos = eventos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Especialidad getEsp() {
        return esp;
    }

    public void setEsp(Especialidad esp) {
        this.esp = esp;
    }

    public HashMap<LocalDate, HashSet<Evento>> getEventos() {
        return eventos;
    }

    public void setEventos(HashMap<LocalDate, HashSet<Evento>> eventos) {
        this.eventos = eventos;
    }

    public void crearEvento(Cliente cliente, LocalDate fecha){
        Evento eventoNuevo = new Evento(cliente, esp);
        if(!this.eventos.containsKey(fecha)){
            HashSet<Evento> eventosNuevos = new HashSet<>();
            eventosNuevos.add(eventoNuevo);
            eventos.put(fecha, eventosNuevos);
            return;
        }

        for(Evento evento : eventos.get(fecha)){
            if(evento.getCliente().equals(cliente)){
                System.out.println("este cliente ya tiene evento registrado este dia");
                return;
            }
        }

        eventos.get(fecha).add(eventoNuevo);
    }

    public void valorizarEventos(){
        for(HashSet<Evento> ev : eventos.values()){
            for(Evento e : ev){
                e.setValor(esp);
            }
        }
    }

    public int cantGanadaEn(LocalDate dia){
        int cant = 0 ;
        if(eventos.containsKey(dia)){
            cant = eventos.get(dia).size() * Empresa.getPrecioBase().get(esp);
        }
        return cant;
    }

    public double conocerSueldo(){
        double total = 0;
        for(HashSet<Evento> eventitos : eventos.values()){
            int totalDia = eventitos.size() * Empresa.getPrecioBase().get(esp);
            total += totalDia + (totalDia * Empresa.getComisiones().get(esp));
        }
        return total;
    }

    public int cantEventos(){
        int cant = 0;
        for(HashSet<Evento> e : eventos.values()){ cant += e.size(); }
        return cant;
    }

    public void resumenCompleto(){
        for(Map.Entry<LocalDate, HashSet<Evento>> mapa : this.eventos.entrySet()){
            LocalDate fecha = mapa.getKey();
            System.out.println("EVENTOS DEL DIA: " + fecha.toString());
            for(Evento evento : mapa.getValue()){
                double conComision = evento.getValor() + (evento.getValor() * Empresa.getComisiones().get(esp));
                double comision = conComision - evento.getValor() ;
                System.out.println("nosededondeeraesteejercicio.Cliente: " + evento.getCliente() + "Monto: " + conComision + "Comision: " + comision);
            }
        }
    }

}
