package calorias;

import personas.Persona;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Familiar extends Persona {
    private HashMap<Plato, Integer> registroPlatos;

    public Familiar(String nombre, String apellido, LocalDate fechaNacimiento, HashMap<Plato, Integer> registroPlatos) {
        super(nombre, apellido, fechaNacimiento);
        this.registroPlatos = registroPlatos;
    }

    public Familiar() {
        super("nombre", "apellido", LocalDate.now());
        this.registroPlatos = new HashMap<>();
    }


    public HashMap<Plato, Integer> getRegistroPlatos() {
        return registroPlatos;
    }

    public void setRegistroPlatos(HashMap<Plato, Integer> registroPlatos) {
        this.registroPlatos = registroPlatos;
    }

    public int calcularCaloriasTotal(){
        int sumaTotal = 0;
        for(Map.Entry<Plato, Integer> mapa : registroPlatos.entrySet()){
            sumaTotal += mapa.getKey().calcularCalorias() * mapa.getValue();
        }
        return sumaTotal;
    }

}
