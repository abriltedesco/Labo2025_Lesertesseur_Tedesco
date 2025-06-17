package ejercicios.ShopApp;
public class Clothing {
    private String description;
    private int size;
    private double price;

    public final static double min_price = 10.0;
    public final static double tax = 0.2;

    public Clothing(String description, String size, double price) {
        this.description = description;
        this.size = size;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getPrice() {
        return price + (price * tax) ;
    }

    public void setPrice(double price) {
        if(this.price < min_price) {
            this.price = min_price;
        }
        else{
            this.price = price;
        }
    }

    @Override
    public String toString() {
        return this.getDescription() + ", size: " + this.getSize() + ", price: " + this.getPrice(); +
    }
}