package figurasGeometricas;

public class Circulo extends FiguraGeometrica {
    private double radio;

    /* constructor por defecto */
    public Circulo(){
        this.radio = 2 ;
    }

    /* constructor parametrizado */
    public Circulo(double radio){
        this.radio = radio;
    }

    public double getRadio(){
        return radio;
    }

    public void setRadio(double radio){
        this.radio = radio;
    }

    public double calcularArea(){
        double area = 3.14 * (radio * radio);
        return area;
    }

    public double calcularPerimetro(){
        double p = 2 * radio * 3.14;
        return p;
    }

    public static void main(String[] args) {
        Circulo c1 = new Circulo();
        Circulo c2 = new Circulo(3.0);

        c1.setRadio(2.0);
        System.out.println(c1.getRadio());
        System.out.println(c2.getRadio());

        System.out.println("C1 a: " + c1.calcularArea());
        System.out.println("C2 a : " + c2.calcularArea());
        System.out.println("C1 p: " + c1.calcularPerimetro());
        System.out.println("C2 p: " + c2.calcularPerimetro());

    }
}
