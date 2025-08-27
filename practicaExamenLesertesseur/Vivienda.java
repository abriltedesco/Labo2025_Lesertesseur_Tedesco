import java.util.HashMap;

public abstract class Vivienda {
    private String direccion;
    private String codigoPostal;
    private Duenio duenio;
    private HashMap<Integer, HashMap<Mes, Consumo>> registroConsumoAnual;
    // año, mes, consumo

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public HashMap<Integer, HashMap<Mes, Consumo>> getRegistroConsumo() {
        return registroConsumoAnual;
    }

    public void setRegistroConsumo(HashMap<Integer, HashMap<Mes, Consumo>> registroConsumo) {
        this.registroConsumoAnual = registroConsumo;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public Duenio getDuenio() {
        return duenio;
    }

    public void setDuenio(Duenio duenio) {
        this.duenio = duenio;
    }

    public void cargarConsumo(Integer anio, Mes mes, double kwhConsumidos) {
        Consumo consumo = new Consumo(kwhConsumidos);

        if (registroConsumoAnual.containsKey(anio)) {
            HashMap<Mes, Consumo> consumoMensual = registroConsumoAnual.get(anio);
            if (!consumoMensual.containsKey(mes)) {
                consumoMensual.put(mes, consumo);
            }

        } else {

            HashMap<Mes, Consumo> data = new HashMap<>();

            registroConsumoAnual.put(anio, data);
            data.put(mes, consumo);
        }

    }

    public abstract double calculoPago(Integer anio, Mes mes);

}
