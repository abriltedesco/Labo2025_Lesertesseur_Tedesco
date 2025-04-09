package unidad1;

public class Rectangulo {
    private double base;
    private double altura;

    public Rectangulo(){
        this.base = 6 ;
        this.altura = 8;
    }

    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public double getBase(){
        return base;
    }
    public double getAltura(){
        return altura;
    }

    public void setBase(double base){
        this.base = base;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public double calcularArea(double altura, double base){
        double area = altura * base;
        return area;
    }

    public double calcularPerimetro(double altura, double base){
        double p = altura * 2 + base * 2;
        return p;
    }



    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo(5,3);
        Rectangulo r2 = new Rectangulo();

        r2.setBase(9);
        r2.setAltura(10);

        System.out.println("R1: " + r1.getBase());
        System.out.println("R1: " + r1.getAltura());
        System.out.println("R2: " + r2.getBase());
        System.out.println("R2: " +r2.getAltura());
        System.out.println("R1: " + r1.calcularArea(r1.getAltura(), r1.getBase()));
        System.out.println("R1: " + r1.calcularPerimetro(r1.getAltura(), r1.getBase()));
    }

}
