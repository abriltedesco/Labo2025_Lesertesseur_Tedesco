import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class SistemaViviendas {
    private HashSet<Vivienda> viviendas;

    public SistemaViviendas(HashSet<Vivienda> viviendas) {
        this.viviendas = viviendas;
    }

    public SistemaViviendas() {
        this.viviendas = new HashSet<>();
    }

    public HashSet<Vivienda> getViviendas() {
        return viviendas;
    }

    public void setViviendas(HashSet<Vivienda> viviendas) {
        this.viviendas = viviendas;
    }

    public static void main(String[] args) {
        HashMap<Mes, Integer> consumo1 = new HashMap<>();
        consumo1.put(Mes.ENERO, 50);
        consumo1.put(Mes.FEBRERO, 20);
        consumo1.put(Mes.MARZO, 50);
        consumo1.put(Mes.ABRIL, 45);

        HashMap<Mes, Integer> consumo2 = new HashMap<>();
        consumo2.put(Mes.ENERO, 40);
        consumo2.put(Mes.FEBRERO, 65);
        consumo2.put(Mes.MARZO, 55);
        consumo2.put(Mes.ABRIL, 49);
        consumo2.put(Mes.MAYO, 67);

        HashMap<Mes, Integer> consumo3 = new HashMap<>();
        consumo3.put(Mes.ENERO, 70);
        consumo3.put(Mes.FEBRERO, 85);
        consumo3.put(Mes.MARZO, 55);
        consumo3.put(Mes.ABRIL,67);
        consumo3.put(Mes.MAYO, 69);

        Duenio d1 = new Duenio("martin", "perez", "41232323");
        Casa c1 =  new Casa("Albarellos 1111", "1419", d1, consumo1, 95, 65);
        Casa c2 =  new Casa("Habana 1111", "1419", d1, consumo2, 55, 75);
        Departamento dpto1 =  new Departamento("Habana 1111", "1419", d1, consumo3, 4);

        SistemaViviendas sist = new SistemaViviendas();
        sist.viviendas.add(c1);
        sist.viviendas.add(c2);
        sist.viviendas.add(dpto1);

        System.out.println("CASA 1 ) ");
        for(Map.Entry<Mes, Integer> map : c1.getConsumoElectricidad().entrySet()){
            Mes mes = map.getKey();
            Integer KWh = map.getValue();
            System.out.println("En " + mes + " ha gastado: " + KWh + "KWh, pagará: " +  c1.costoTotalDelMes(mes));
        }
        System.out.println("-------------------------");
        System.out.println("CASA 2 ) ");
        for(Map.Entry<Mes, Integer> map : c2.getConsumoElectricidad().entrySet()){
            Mes mes = map.getKey();
            Integer KWh = map.getValue();
            System.out.println("En " + mes + " ha gastado: " + KWh + "KWh, pagará: " +  c2.costoTotalDelMes(mes));
        }
        System.out.println("-------------------------");
        System.out.println("DEPTO 1 ) ");
        for(Map.Entry<Mes, Integer> map : dpto1.getConsumoElectricidad().entrySet()){
            Mes mes = map.getKey();
            Integer KWh = map.getValue();
            System.out.println("En " + mes + " ha gastado: " + KWh + "KWh, pagará: " +  dpto1.costoTotalDelMes(mes));
        }
    }
}
