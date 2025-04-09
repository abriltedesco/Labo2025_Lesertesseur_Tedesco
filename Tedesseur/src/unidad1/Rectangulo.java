package unidad1;

public class Rectangulo {
    private double base;
    private double altura;

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
        System.out.println(r1.getBase());
        System.out.println(r1.getAltura());
        System.out.println(r1.calcularArea(r1.getAltura(), r1.getBase()));
        System.out.println(r1.calcularPerimetro(r1.getAltura(), r1.getBase()));
    }

}
