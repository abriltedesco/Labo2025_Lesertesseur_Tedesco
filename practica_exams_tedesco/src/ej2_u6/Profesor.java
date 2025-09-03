package ej2_u6;

import java.time.LocalDate;
import java.util.HashMap;

public class Profesor extends ConSueldo{
    private HashMap<String, Integer> materias;
    private Tipo tipo;

    public Profesor(String nombre, String apellido, int edad, LocalDate fechaNacimiento, String direccion, String codPostal, boolean registrado, LocalDate fechaAlta, HashMap<LocalDate, Sueldo> sueldos, HashMap<String, Integer> materias, Tipo tipo) {
        super(nombre, apellido,edad, fechaNacimiento, direccion, codPostal, registrado, fechaAlta, sueldos);
        this.materias = materias;
        this.tipo = tipo;
    }

    public HashMap<String, Integer> getMaterias() {
        return materias;
    }

    public void setMaterias(HashMap<String, Integer> materias) {
        this.materias = materias;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public void realizarAccionSolidaria() {
        for(String materia : this.materias.keySet()){
            System.out.println(materia);
        }
    }
}
