package tickets;

public class Dispositivo {
    private Tipo tipo;
    private boolean hay_repuestos_disp;

    public Dispositivo(Tipo tipo, boolean hay_repuestos_disp) {
        this.tipo = tipo;
        this.hay_repuestos_disp = hay_repuestos_disp;
    }

    public Dispositivo() {
        this.tipo = Tipo.CAMARA;
        this.hay_repuestos_disp = true;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public boolean isHay_repuestos_disp() {
        return hay_repuestos_disp;
    }

    public void setHay_repuestos_disp(boolean hay_repuestos_disp) {
        this.hay_repuestos_disp = hay_repuestos_disp;
    }
}
