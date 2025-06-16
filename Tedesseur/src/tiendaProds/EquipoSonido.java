package tiendaProds;

public class EquipoSonido extends Producto{
    private boolean tieneBluetooth;

    public boolean isTieneBluetooth() {
        return tieneBluetooth;
    }

    public void setTieneBluetooth(boolean tieneBluetooth) {
        this.tieneBluetooth = tieneBluetooth;
    }

    public EquipoSonido(String nombre, double precio, int stock, boolean tieneBluetooth) {
        super(nombre, precio, stock, Seccion.MULTIMEDIA);
        this.tieneBluetooth = tieneBluetooth;
    }
}
