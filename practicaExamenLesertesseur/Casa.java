import java.util.HashMap;

public class Casa extends Vivienda {
    private int metrosCubiertos;
    private int metrosDescubiertos;

    public int getMetrosCubiertos() {
        return metrosCubiertos;
    }

    public void setMetrosCubiertos(int metrosCubiertos) {
        this.metrosCubiertos = metrosCubiertos;
    }

    public int getMetrosDescubiertos() {
        return metrosDescubiertos;
    }

    public void setMetrosDescubiertos(int metrosDescubiertos) {
        this.metrosDescubiertos = metrosDescubiertos;
    }

        private Consumo obtenerConsumoAnioMes(Integer anio, Mes mes) {
        Consumo consumo = null;
        HashMap<Integer, HashMap<Mes, Consumo>> consumoAnual = getRegistroConsumo();
        if (consumoAnual.containsKey(anio)) {
            HashMap<Mes, Consumo> consumoMensual = consumoAnual.get(anio);
            if (consumoMensual.containsKey(mes)) {
                consumo = consumoMensual.get(mes);
            }
        }
        return consumo;
    }

    @Override
    public double calculoPago(Integer anio, Mes mes) {
        double porcentajeParaDescuento = 0.10;
        double pagoTotal = 0;
        double costoKWh = 100.0;
        double descuento = 0.05;
        Consumo actual = obtenerConsumoAnioMes(anio, mes);
        Consumo anioAnterior = obtenerConsumoAnioMes(anio - 1, mes);

        if (actual != null) {
            pagoTotal = actual.getKwhConsumidos() * costoKWh;
            if(anioAnterior != null){
                double porcentajeDeConsumo = anioAnterior.getKwhConsumidos() * porcentajeParaDescuento;
                double valorMinimoParaDescuento = anioAnterior.getKwhConsumidos() - porcentajeDeConsumo;
                if(actual.getKwhConsumidos() <= valorMinimoParaDescuento){
                    double descuentoEnPesos = pagoTotal * descuento;
                    pagoTotal -= descuentoEnPesos;
                }
            }
        }

        return pagoTotal;
    }
}
