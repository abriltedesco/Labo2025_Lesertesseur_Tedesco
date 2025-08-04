package Vacunatorio;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Vacuna gripe = new Vacuna(LocalDate.of(2025, 6, 7), LocalDate.of(2025, 8,3), 1, 2, "Gripe");
        Vacuna dengue = new Vacuna(LocalDate.of(2025, 1, 1), LocalDate.of(2025, 8,2), 2, 4, "Dengue");
        Vacuna antitetanica = new Vacuna(LocalDate.of(2023, 6, 7), LocalDate.of(2025, 6,20), 3, 3, "Antitetanica");
        Vacuna vacunaa = new Vacuna(LocalDate.of(2023, 6, 7), LocalDate.of(2025, 6,20), 4, 2, "alguna");
        Vacuna covid = new Vacuna(LocalDate.of(2020, 6, 9), LocalDate.of(2025, 6,30), 4, 1, "covid-19");
        HashSet<Vacuna> vacunas1 = new HashSet<>();
        HashSet<Vacuna> vacunas2 = new HashSet<>();
        HashSet<Vacuna> vacunas3 = new HashSet<>();

        Ciudadano c1 = new Ciudadano("young", "miko", "323232", Provincia.LA_PAMPA, "domi", "miko@mail.com", vacunas1);
        Ciudadano c2 = new Ciudadano("tate", "mcrae", "424242", Provincia.CHUBUT, "aaaaaa", "t8@mail.com", vacunas2);
        Ciudadano c3 = new Ciudadano("tyler", "thecreator", "17565767", Provincia.BUENOS_AIRES, "aaaaaa", "tyler@mail.com", vacunas3);
        Ciudadano c4 = new Ciudadano();
        c1.agregarVacuna(gripe);
        c1.agregarVacuna(dengue);
        c1.agregarVacuna(covid);

        c2.agregarVacuna(covid);
        c2.agregarVacuna(vacunaa);
        c2.agregarVacuna(gripe);
        c2.agregarVacuna(antitetanica);

        c3.agregarVacuna(antitetanica);
        c3.agregarVacuna(covid);
        c3.agregarVacuna(dengue);

        c4.agregarVacuna(dengue);
        c4.agregarVacuna(covid);

        HashSet<Ciudadano> citizens = new HashSet<>();
        citizens.add(c1);
        citizens.add(c2);
        citizens.add(c3);
        citizens.add(c4);
        Vacunatorio sistema = new Vacunatorio();
        sistema.agregarAlHistorial(citizens);

        HashMap<Provincia, Integer> cantPorProvincia = new HashMap<>();
        Provincia [] provincias = Provincia.values();
        for(Provincia provincia : provincias){
            cantPorProvincia.put(provincia, 0);
        }
        sistema.filtrarPorProvincia(citizens, cantPorProvincia);
        for(Map.Entry<String, HashSet<Vacuna>> mapa : sistema.getHistorialVacunas().entrySet()){
            String nombre = mapa.getKey();
            HashSet<Vacuna> vacunas = mapa.getValue();
            System.out.println("Nombre: " + nombre);
            for(Vacuna vacuna : vacunas){
                System.out.println("Vacuna: " + vacuna.getNombreComercial());
            }
        }

        // muestra por provincia
        for(Map.Entry<Provincia, Integer> mapa : cantPorProvincia.entrySet()){
            Provincia prov = mapa.getKey();
            Integer contador = mapa.getValue();
            System.out.println("Provincia: " + prov.name() + " - cant: " + contador);
        }

        // historial por dni
        sistema.buscarPorDni("17565767");
        sistema.buscarPorDni("323232");

        // cumplen con cant de vacunas
        System.out.println("cumplen con cant de vacunas: ");
        for(Ciudadano ciudadano : citizens){
            if(ciudadano.cumplenConCantidad(3)){
                System.out.println("dni: " + ciudadano.getDni());
            }
        }

        // cumplen con la vacuna de :
        System.out.println("cumplen con la vacuna: ");
        for(Ciudadano ciudadano : citizens){
            if(ciudadano.seDioLaVacuna(gripe)){
                System.out.println("dni: " + ciudadano.getDni());
            }
        }
    }
}
