package ejercicios.ShopApp;
import io.helidon.webserver.Routing;
import java.net.InetAddress;
import java.net.UnknownHostException;
import io.helidon.webserver.ServerConfiguration;
import io.helidon.webserver.WebServer;
import java.util.ArrayList;
import java.util.Arrays;

public class ShopConApi {
    public static void main(String[] args) {
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
            c1.addItems(items);

            int cant = 0,  prom = 0;

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


            try {
                ItemList list = new ItemList(items);
                // configura ruta http
                Routing routing = Routing.builder()
                        .get("/items",list).build();
                ServerConfiguration config = ServerConfiguration.builder()
                        .bindAddress(InetAddress.getLocalHost())
                        .port(8888).build();
                WebServer ws = WebServer.create(config,routing);
                ws.start();
            } catch (UnknownHostException e) {
                e.printStackTrace();
                throw new RuntimeException(e);
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
}
