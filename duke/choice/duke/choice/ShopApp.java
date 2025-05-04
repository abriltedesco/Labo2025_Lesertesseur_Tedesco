package duke.choice;

import java.util.ArrayList;

public class ShopApp {
    customer cliente;

    public static void main(String[] args) {
        //double tax = 0.2; 
        //double total = 0;
        //double totalImpuesto = 0;
        int measurement = 3;

        customer c1 = new customer("Pinky", "S");

        System.out.println("Bienvenido " + c1.getNombre());

        Clothing item1 = new Clothing("Blue jacket", 20.9, "M");
        Clothing item2 = new Clothing("Orange T-shirt", 10.5, "S");
        Clothing item3 = new Clothing("Green Scarf", 5, "S");
        Clothing item4 = new Clothing("Blue T-shirt", 10.5, "S");

        /*
         * System.out.println("ITEM 1: " + item1.getDescription() + ", " +
         * item1.getPrice() + ", " + item1.getSize());
         * System.out.println("ITEM 2: " + item2.getDescription() + ", " +
         * item2.getPrice() + ", " + item2.getSize());
         */
        ArrayList<Clothing> items = new ArrayList<Clothing>();
        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);

        /*
         * total = item1.getPrice() * 2 + item2.getPrice() ;
         * System.out.println("Total de compra sin impuesto: " + total);
         * 
         * totalImpuesto = (total * tax) + total;
         * System.out.println("Total de compra con impuesto: " + totalImpuesto);
         */

        for (Clothing item : items) {

            if (c1.getSize() == item.getSize()) {
                //total += item.getPrice();
                //totalImpuesto = (total * tax) + total;
                
                System.out.println(item.getDescription() + " - " + item.getPrice() + " - " + item.getSize());
                /*               
                if (total > 15) {
                    break;
                }
                */
            }
            
        }
       
        c1.addItems(items);

        System.out.println("getTotalClothingCost: " + c1.getTotalClothingCost());        
        //System.out.println("Total de compra sin impuesto: " + total);
        //System.out.println("Total de compra con impuesto: " + totalImpuesto);


        /*switch (measurement) {
            case 1:
            case 2:
            case 3:
                c1.size = "S";
                break;
            case 4:
            case 5:
            case 6:
                c1.size = "M";
                break;
            case 7:
            case 8:
            case 9:
                c1.size = "L";
                break;
            default:
                c1.size = "X";
                break;
        }
         */
        System.out.println("Measurement: " + measurement + " / " + c1.getSize());
    }
}
