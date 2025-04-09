package unidad1;

public class Coche {
    private String marca;
    private String modelo;
    private String color;


    public Coche() {
        this.marca = "Porsche";
        this.modelo = "Cayman";
        this.modelo = "Rosita";
    }

    public Coche(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    public static void main(String[] args) {
        Coche c1 = new Coche();
        Coche c2 = new Coche("Mazda", "RX7", "Blanco");
    }

}
