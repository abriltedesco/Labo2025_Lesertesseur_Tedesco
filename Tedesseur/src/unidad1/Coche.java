package unidad1;

public class Coche {
    private String marca;
    private String modelo;
    private String color;
    private double velocidad;

    public double getVelocidad(){
        return velocidad;
    }

    public void setVelocidad(double v){
        this.velocidad = v;
    }

    public String getMarca(){
        return marca;
    }
    public void setMarca(String m){
        this.marca = m;
    }

    public String getColor(){
        return color;
    }
    public void setColor(String c){
        this.color = c;
    }

    public String getModelo(){
        return modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }

    public Coche() {
        this.marca = "Porsche";
        this.modelo = "Cayman";
        this.color = "Rosita";
        this.velocidad = 37.4;
    }

    public Coche(String marca, String modelo, String color, double velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.velocidad = velocidad ;
    }

    public double acelerar(){
        return velocidad++;
    }

    public double frenar(){
        return velocidad = 0;
    }
    public void mostrarVelocidadActual(){
        System.out.println(velocidad);
    }

    public static void main(String[] args) {
        Coche c1 = new Coche();
        Coche c2 = new Coche("Mazda", "RX7", "Blanco", 23.3);

        c1.setVelocidad(76);
        c1.setModelo("Fiesta");
        c1.setMarca("Ford");
        c1.setColor("Rojo");

        System.out.println("C1 " + c1.acelerar());
        System.out.println("C2 " + c2.acelerar());
        System.out.println("C1 " + c1.frenar());
        System.out.println("C2 " + c2.frenar());
        c1.mostrarVelocidadActual();
        c2.mostrarVelocidadActual();
    }
}
