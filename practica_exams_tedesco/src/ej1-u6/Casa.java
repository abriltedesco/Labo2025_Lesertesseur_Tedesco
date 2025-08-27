import java.util.HashMap;

public class Casa extends Vivienda{
    private int metrosCubiertos;
    private int metrosDescubiertos;

    public Casa(String direccion, String codPostal, Duenio duenio, HashMap<Mes, Integer> consumoElectricidad, int metrosCubiertos, int metrosDescubiertos) {
        super(direccion, codPostal, duenio, consumoElectricidad, 100); // le paso directamente el valor
        this.metrosCubiertos = metrosCubiertos;
        this.metrosDescubiertos = metrosDescubiertos;
    }

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
}
