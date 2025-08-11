package control;

import diseño.Proyecto;
import personas.PersonaPadre;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Persona extends PersonaPadre {
    private LocalDate fechaNacimiento;
    private HashMap<LocalDate, Registro> registros;

    public Persona(String nombre, String apellido, LocalDate fechaNacimiento, HashMap<LocalDate, Registro> registros) {
        super(nombre, apellido);
        this.fechaNacimiento = fechaNacimiento;
        this.registros = registros;
    }
    public Persona() {
        super("juansito", "pepito");
        this.fechaNacimiento = LocalDate.of(2003,4, 8);
        this.registros = new HashMap<>();
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public HashMap<LocalDate, Registro> getRegistros() {
        return registros;
    }

    public void setRegistros(HashMap<LocalDate, Registro> registros) {
        this.registros = registros;
    }

    public void conocerRegistroDelDia(LocalDate fecha){
        for(Map.Entry<LocalDate, Registro> mapa : registros.entrySet() ){
            LocalDate fechaRegistrada = mapa.getKey();
            Registro registro = mapa.getValue();
           if(fechaRegistrada.isEqual(fecha)){
               System.out.println("Peso: " + registro.getPeso() + "Altura: " + registro.getAltura());
           }
        }
    }

    public void promedioPesoAltura(){
        float promPeso = 0;
        float promAltura = 0;
        for(Map.Entry<LocalDate, Registro> mapa : registros.entrySet() ){
            LocalDate fechaRegistrada = mapa.getKey();
            Registro registro = mapa.getValue();
            float sumaPeso = 0;
            float sumaAltura = 0;
            int contador = 0;
            if(fechaRegistrada.getYear() == LocalDate.now().getYear()){
                sumaPeso += registro.getPeso();
                sumaAltura += registro.getAltura();
                contador ++;
            }
            promPeso = sumaPeso / contador;
            promAltura = sumaAltura / contador;
        }

        System.out.println("Peso: " + promPeso + "Altura: " + promAltura);
    }


}
