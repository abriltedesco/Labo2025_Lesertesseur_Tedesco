package tiendaProds;

public class Televisor extends Producto {
    private Tecnologia tecnologia;

    public Tecnologia getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(Tecnologia tecnologia) {
        this.tecnologia = tecnologia;
    }

    public Televisor(String nombre, double precio, int stock, Seccion seccion, Tecnologia tecnologia) {
        super(nombre, precio, stock, Seccion.MULTIMEDIA);
        this.tecnologia = tecnologia;
    }
}
