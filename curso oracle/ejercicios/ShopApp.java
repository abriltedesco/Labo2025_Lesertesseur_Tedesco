package ejercicios.ShopApp;

import java.util.Arrays;

public class ShopApp{
    private Customer cliente;

    public Customer getCliente(){
        return cliente;
    }

    public void setCliente(Customer cliente){
        this.cliente = cliente;
    }

    public static void main (String[] args) {
        System.out.println("BIENVENIDO AL SHOPAPP!! ");

        double tax = 0.2, total = 0.0;

        System.out.println("Min price: " + Clothing.min_price);
        System.out.println("Tax: " + tax);
        ShopApp shopApp = new ShopApp();
        Customer c1 = new Customer("pinky", 'M');
        Clothing item1 = new Clothing("Blue jacket", 'M', 20.9);
        Clothing item2 = new Clothing("Orange T-shirt", 'S', 10.5);
        Clothing item3 = new Clothing("Green Scarf", 'M', 5.0);
        Clothing item4 = new Clothing();
        Clothing[] items = {item1, item2, item3, item4};
        items[3].setDescription("Blue t-shirt");
        items[3].setPrice(10.5);
        items[3].setSize('S');

        shopApp.setCliente(c1);
        // c1.setName("pinky");
        // c1.setSize(3);

        c1.addItems(items);
        // System.out.println("item1: " + item1.getDescription() + ", size: " + item1.getSize() + ", price: " + item1.getPrice());
        // System.out.println("item2: " + item2.getDescription() + ", size: " + item2.getSize() + ", price: " + item2.getPrice());
        // total = item2.getPrice() * 2 + item1.getPrice();
        // total *= tax;

        int cant = 0;
        int prom = 0;

        for(Clothing item : c1.getItems()){
            System.out.println("items: " + item);
        }

        for(Clothing item : c1.getItems()){
            if(item.getSize() == 'L'){
                cant ++;
                prom += item.getPrice();
            }
        }

       try{
            prom =  prom / cant;
            System.out.println("precio prom " + prom + "cant items " + cant);
       }
       catch (ArithmeticException exc){
            System.out.println("HUBO ERROR!!!");
            System.out.println("no dividas por 0");
       }

        System.out.println("Total: " + total);

        shopApp.setCliente(c1);
        System.out.println("Customer: " + shopApp.getCliente().getName() + ", size: " + shopApp.getCliente().getSize() + ", total: " + shopApp.getCliente().getTotalClothing());
        Arrays.sort(c1.getItems());
        for(Clothing item : c1.getItems()){
            System.out.println("items: " + item);
        }

    }
}