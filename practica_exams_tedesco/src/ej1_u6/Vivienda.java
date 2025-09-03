import java.util.HashMap;

public abstract class Vivienda {
    private String direccion;
    private String codPostal;
    private Duenio duenio;
    private HashMap<Mes, Integer> consumoElectricidad;
    private int valorPorKWh;

    public Vivienda(String direccion, String codPostal, Duenio duenio, HashMap<Mes, Integer> consumoElectricidad, int valorPorKWh) {
        this.direccion = direccion;
        this.codPostal = codPostal;
        this.duenio = duenio;
        this.consumoElectricidad = consumoElectricidad;
        this.valorPorKWh = valorPorKWh;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }

    public Duenio getDuenio() {
        return duenio;
    }

    public void setDuenio(Duenio duenio) {
        this.duenio = duenio;
    }

    public HashMap<Mes, Integer> getConsumoElectricidad() {
        return consumoElectricidad;
    }

    public void setConsumoElectricidad(HashMap<Mes, Integer> consumoElectricidad) {
        this.consumoElectricidad = consumoElectricidad;
    }

    public int getValorPorKWh() {
        return valorPorKWh;
    }

    public void setValorPorKWh(int valorPorKWh) {
        this.valorPorKWh = valorPorKWh;
    }

    public int calcularTotalSinDescuento(Mes mes){
        return consumoElectricidad.get(mes) * valorPorKWh;
    }

    public double reduccionConsumo(Mes mes){
        Mes mesAnterior = mesAnteriorDe(mes);
        Integer consumoMesAnterior = consumoElectricidad.get(mesAnterior);
        if(consumoMesAnterior == null){
            return 0;
        }
        return consumoMesAnterior * 0.9;
    }

    public Mes mesAnteriorDe(Mes mes){
        Mes mesAnterior = null;
        if(mes.ordinal() == 0){
            mesAnterior = Mes.values()[11];
        }
        else{
            mesAnterior = Mes.values()[ mes.ordinal() - 1];
        }
        return mesAnterior;
    }

    public double costoTotalDelMes(Mes mes){
        if(consumoElectricidad.get(mes) <= reduccionConsumo(mes)){
           return calcularTotalSinDescuento(mes) * 0.95;
        }
        return calcularTotalSinDescuento(mes);
    }



}
