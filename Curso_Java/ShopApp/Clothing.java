package duke.choice;


public class Clothing implements Comparable<Clothing >{
    private String description;
    private double price;
    private String size;
    private final double minPrice = 10;
    private final double tax = 0.2;

    public Clothing (String description, double price, String size){
        this.description = description;
        this.price = price;
        this.size = size;
    } 

    
    public String getDescription(){
        return description;
    }

    public String setDescription(String description){
        this.description = description;
        return description;
    }

    public double getPrice(){
        this.price = (this.price * tax) + this.price; 
        return price;
    }

    public double setPrice(double price){
        this.price = price;
        if(this.price < minPrice){
            this.price = minPrice;
        }
        return price;
    }

    public String getSize(){
        return size;
    }

    public String setSize(String size){
        this.size = size;
        return size;
    }

    @Override
    public int compareTo(Clothing c) {
        
        return this.getDescription().compareTo(c.description);
    }


}
