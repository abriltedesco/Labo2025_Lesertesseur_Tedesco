package Labo2025_Lesertesseur_Tedesco.Curso_Java.ShopApp;

public class Clothing {
    private String description;
    private double price;
    private String size;
    private static double minPrice = 10;
    private static double tax = 0.2;
    
    public static double getMinPrice(){
        return minPrice;
    }
    
    public static double getTax(){
        return tax;
    }

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
    public String toString(){
        return getDescription() + " " + getSize() + " " + getPrice();
    }
}
