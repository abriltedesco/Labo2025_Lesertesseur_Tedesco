package duke.choice;

public class Clothing {
    private String description;
    private double price;
    private String size;

    public Clothing (String description, double price, String size){
        this.description = description;
        this.price = price;
        this.size = size;
    } 

    public String getDescription(){
        return description;
    }
    public double getPrice(){
        return price;
    }
    public String getSize(){
        return size;
    }

}
