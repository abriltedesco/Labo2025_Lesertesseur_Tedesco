package ejercicios;

import ejercicios.Customer;
import ejercicios.Clothing;

public class ShopApp{
    private Customer cliente;

    public Customer getCliente(){
        return cliente;
    }

    public void setCliente(Customer cliente){
        this.cliente = cliente;
    }

    public static void main (String[] args){
        double tax = 0.2;
        double total = 0.0;

        ShopApp shoppApp = new ShopApp();
        Customer c1 = new Customer();
        Clothing item1 = new Clothing("Blue jacket", "M", 20.9);
        Clothing item2 = new Clothing("Orange T-shirt", "S", 10.5);
        c1.setName("pinky");
        shopApp.setCliente(c1);
        System.out.println("Customer: " + shopApp.getCliente().getName());

        System.out.println("item1: " + item1.getDescription() + ", " + item1.getSize() + ", " + item1.getPrice());
        System.out.println("item2: " + item2.getDescription() + ", " + item2.getSize() + ", " + item2.getPrice());

        total = item2.getPrice() * 2 + item1.getPrice();
        total *= tax;
        System.out.println("Total: " + total);
}
