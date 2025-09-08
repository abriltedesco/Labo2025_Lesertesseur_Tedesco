package dispositivos;

public abstract class Dispositivo extends DispositivoPadre {
    private int stock;
    private double precio;

    public Dispositivo(String fabricante, String modelo, double precio, int stock) {
        super(fabricante, modelo);
        this.stock = stock;
        this.precio = precio;
    }

    public Dispositivo() {
        super("fab", "model");
        this.stock = 5;
        this.precio = 0.5;
    }

    public Dispositivo(String fabricante, String modelo, double precio) {
        super(fabricante, modelo);
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void reducirStock() throws NoHayStockException {
        if (chequearStock()) stock--;
    }

    public boolean hayStock() {
        return stock > 0;
    }

    public boolean chequearStock() throws NoHayStockException {
        if (!hayStock()) {
            throw new NoHayStockException("no es posible realizar la accion ya que no hay stock");
        }
        return true;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getInfo() {
        return getFabricante() + " " + getModelo() + " ($" + precio + ")";
    }
}
