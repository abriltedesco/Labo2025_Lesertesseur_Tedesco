package tratamientos;

import java.util.HashSet;

public class Sistema {
    private HashSet<Paciente> pacientesTotales;
    private HashSet<Tratamiento> pacientesConTratamiento;

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


}
