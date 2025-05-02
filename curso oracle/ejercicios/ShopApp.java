package ejercicios.ShopApp;

public class ShopApp{
    private Customer cliente;

    public Customer getCliente(){
        return cliente;
    }

    public void setCliente(Customer cliente){
        this.cliente = cliente;
    }

    public static void main (String[] args) {
        double tax = 0.2, total = 0.0;

        ShopApp shopApp = new ShopApp();
        Customer c1 = new Customer("pinky", 3);
        Clothing item1 = new Clothing("Blue jacket", "M", 20.9);
        Clothing item2 = new Clothing("Orange T-shirt", "S", 10.5);
        Clothing item3 = new Clothing("Green Scarf", "S", 5.0);
        items[3].setDescription("Blue t-shirt");
        items[3].setPrice(10.5);
        items[3].setSize(2);
        Clothing[] items = {item1, item2, item3, item4};

        shopApp.setCliente(c1);
        // c1.setName("pinky");
        // c1.setSize(3);

        c1.addItems(items);
        // System.out.println("item1: " + item1.getDescription() + ", size: " + item1.getSize() + ", price: " + item1.getPrice());
        // System.out.println("item2: " + item2.getDescription() + ", size: " + item2.getSize() + ", price: " + item2.getPrice());
        // total = item2.getPrice() * 2 + item1.getPrice();
        // total *= tax;


        for(Clothing item : c1.getItems()){
            System.out.println("items: " + item.getDescription() + ", size: " + item.getSize() + ", price: " + item.getPrice());
        }

        System.out.println("Total: " + total);

        shopApp.setCliente(c1);
        System.out.println("Customer: " + shopApp.getCliente().getName() + ", size: " + shopApp.getCliente().getSize() + ", total: " + shopApp.getCliente().getTotalClothing());

    }
}