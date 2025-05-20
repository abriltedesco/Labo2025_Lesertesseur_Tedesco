package vehiculos;

public class Coche extends Motorizado{
    private double velocidad;
    private boolean esDescapotable;

    public double getVelocidad(){
        return velocidad;
    }

    public boolean isEsDescapotable() {
        return esDescapotable;
    }

    public void setEsDescapotable(boolean esDescapotable) {
        this.esDescapotable = esDescapotable;
    }

    public void setVelocidad(double velocidad){
        this.velocidad = velocidad;
    }

    public Coche() {
        super("DJSADJASDJ", "Porsche", "Cayman", "Rosita", 4, 2015);
        this.esDescapotable = true;
        this.velocidad = 37.4;
    }

    public Coche(String marca, String modelo, String color, double velocidad, String patente, boolean esDescapotable) {
        super(patente, marca, modelo, color);
        this.velocidad = velocidad ;
        this.esDescapotable = esDescapotable;
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
        Coche c2 = new Coche("Mazda", "RX7", "Blanco", 23.3, "JAJ4JAJ4", true);

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
