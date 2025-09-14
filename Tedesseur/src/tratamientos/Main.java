package tratamientos;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Ninio n1 = new Ninio("Juan", 5, "Lopez", LocalDate.of(2020, 1, 12), Genero.MASCULINO, TipoSangre.AB_NEG, 7);
        Ninio n2 = new Ninio("Monica", 7, "Sanchez", LocalDate.of(2016, 3, 9), Genero.FEMENINO, TipoSangre.AB_NEG, 3);
        Ninio n3 = new Ninio("Juan", 5, "Lopez", LocalDate.of(2020, 1, 12), Genero.MASCULINO, TipoSangre.AB_NEG, 7);
    
        Joven j1 = new Joven("Tito", 20, "Melgarejo", LocalDate.of(2000, 12, 1), Genero.MASCULINO, TipoSangre.AB_NEG, 2);
        Joven j2 = new Joven("Santino", 20, "Vuotto", LocalDate.of(2000, 11, 10), Genero.MASCULINO, TipoSangre.AB_NEG, 1);
        Joven j3 = new Joven("Nahun", 20, "De la cuesta", LocalDate.of(2000, 11, 10), Genero.MASCULINO, TipoSangre.AB_NEG, 3);
        Sistema sistema = new Sistema();

        sistema.agregarPacienteTotal(n1);
        sistema.agregarPacienteTotal(n2);
        sistema.agregarPacienteTotal(n3);
        sistema.agregarPacienteTotal(j1);
        sistema.agregarPacienteTotal(j2);
        sistema.agregarPacienteTotal(j3);

        sistema.agregarPacienteConTratamiento(n1);
        sistema.agregarPacienteConTratamiento(n3);
        sistema.agregarPacienteConTratamiento(j1);
        sistema.agregarPacienteConTratamiento(j3);

        System.out.println( "Pacientes con tratamiento: " + sistema.cantPacientesConTratamiento());
        System.out.println("Pacientes que no aplican tratamiento: " + sistema.cantQueNoAplicanTratamiento());
        System.out.println( "Pacientes en total: " + sistema.cantPacientesTotal());
        System.out.println("----------------------------------");
        //System.out.println(n1.comunicadoIncumplimientoEdad());
    }
}
