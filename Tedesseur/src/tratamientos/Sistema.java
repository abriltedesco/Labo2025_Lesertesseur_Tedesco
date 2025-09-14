package tratamientos;

import java.util.HashSet;

public class Sistema {
    private HashSet<Paciente> pacientesTotales;
    private HashSet<Tratamiento> pacientesConTratamiento;

    public Sistema() {
        this.pacientesTotales = new HashSet<>();
        this.pacientesConTratamiento = new HashSet<>();
    }

    public HashSet<Paciente> getPacientesTotales() {
        return pacientesTotales;
    }

    public void setPacientesTotales(HashSet<Paciente> pacientesTotales) {
        this.pacientesTotales = pacientesTotales;
    }

    public HashSet<Tratamiento> getPacientesConTratamiento() {
        return pacientesConTratamiento;
    }

    public void setPacientesConTratamiento(HashSet<Tratamiento> pacientesConTratamiento) {
        this.pacientesConTratamiento = pacientesConTratamiento;
    }

    public int cantQueNoAplicanTratamiento(){
        return pacientesTotales.size() - pacientesConTratamiento.size();
    }

    public void agregarPacienteTotal(Paciente paciente){
        this.pacientesTotales.add(paciente);
    }
    
    public void agregarPacienteConTratamiento(Tratamiento pacienteTratamiento){
        this.pacientesConTratamiento.add(pacienteTratamiento);
    }

    public int cantPacientesConTratamiento(){
        return this.pacientesConTratamiento.size();
    }  
    
    public int cantPacientesTotal(){
        return this.pacientesTotales.size();
    }
}
