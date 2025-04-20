package ejercicios;
public class Clothing {
    private String description;
    private String size;
    private double price;

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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}