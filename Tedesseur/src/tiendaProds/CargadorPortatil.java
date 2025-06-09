package tiendaProds;

public class CargadorPortatil extends Producto{
    private int cantCargas;

    public int getCantCargas() {
        return cantCargas;
    }

    public void setCantCargas(int cantCargas) {
        this.cantCargas = cantCargas;
    }

    public CargadorPortatil(String nombre, double precio, int stock, Seccion seccion, int cantCargas) {
        super(nombre, precio, stock, Seccion.CARGADORES);
        this.cantCargas = cantCargas;
    }


}
