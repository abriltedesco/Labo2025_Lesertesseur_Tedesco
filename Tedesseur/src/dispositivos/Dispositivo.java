package dispositivos;

public class Dispositivo {
    private String fabricante;
    private String modelo;
    private double precio;
    private int stock;

    public Dispositivo(String fabricante, String modelo, double precio, int stock) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.precio = precio;
        this.stock = stock;
    }

    public Dispositivo(String fabricante, String modelo, double precio) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.precio = precio;
    }

    public Dispositivo() {
        this.fabricante = "SADDADDFD";
        this.modelo = "modelito";
        this.precio = 5;
        this.stock = 5;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

     public void ajustarPorInflacion(double porcentaje) {
        precio += precio * (porcentaje / 100);
    }

    public void reducirStock() {
        if (stock > 0) stock--;
    }

    public boolean hayStock() {
        return stock > 0;
    }

    public String getInfo() {
        return fabricante + " " + modelo + " ($" + precio + ")";
    }
}
