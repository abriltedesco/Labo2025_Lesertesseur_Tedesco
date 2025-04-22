package duke.choice;

public class ShopApp {
    customer cliente;     
    
    public static void main(String[] args) {
        double tax = 0.2;
        double total = 0;
        double totalImpuesto = 0;

        customer c1 = new customer("Pinky");   

        System.out.println("Bienvenido " + c1.getNombre());
        
        Clothing item1 = new Clothing("Blue jacket", 20.9 , "M");
        Clothing item2 = new Clothing("Orange T-shirt", 10.5, "S");

        System.out.println("ITEM 1: " + item1.getDescription() + ", " + item1.getPrice() + ", " + item1.getSize());
        System.out.println("ITEM 2: " + item2.getDescription() + ", " + item2.getPrice() + ", " + item2.getSize());

        total = item1.getPrice() * 2 + item2.getPrice() ;
        System.out.println("Total de compra sin impuesto: " + total);

        totalImpuesto = (total * tax) + total;
        System.out.println("Total de compra con impuesto: " + totalImpuesto);
    }
}
