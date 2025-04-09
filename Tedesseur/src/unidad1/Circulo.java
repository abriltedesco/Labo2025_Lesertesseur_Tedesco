package unidad1;

public class Circulo {
    private double radio;
    private double area;
    private double perimetro;

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

    public double setArea(double radio){
        this.area = 3.14 * (radio * radio);
        return area;
    }

    public double getArea(){
        return setArea(radio);
    }

    public double setPerimetro(double radio){
        this.perimetro = 2 * radio * 3.14;
        return perimetro;
    }

    public double getPerimetro(){
        return setPerimetro(radio);
    }

    public static void main(String[] args) {
        Circulo c1 = new Circulo();
        Circulo c2 = new Circulo(3.0);

        c1.setRadio(2.0);
        System.out.println(c1.getRadio());
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimetro());

        System.out.println(c2.getRadio());
        System.out.println(c2.getArea());
        System.out.println(c2.getPerimetro());
    }
}
