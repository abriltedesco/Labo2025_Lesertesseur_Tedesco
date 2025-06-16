package Labo2025_Lesertesseur_Tedesco.Curso_Java.ShopApp;

import java.util.ArrayList;

public class Customer {
    private String name;
    private String size;
    private ArrayList<Clothing> items;

    public Customer(String name, String size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public String setSize(String size) {
        this.size = size;
        return size;
    }

    public void setSize(int measurement) {

        switch (measurement) {
            case 1:
            case 2:
            case 3:
                setSize("S");
                break;
            case 4:
            case 5:
            case 6:
                setSize("M");
                break;
            case 7:
            case 8:
            case 9:
                setSize("L");
                break;
            default:
                setSize("XL");
                break;
        }

    }

    public String getSize() {
        return size;
    }

    public String getNombre() {
        return name;
    }

    public void addItems(ArrayList<Clothing> items) {
        items = this.items;
    }

    public ArrayList<Clothing> getItems(ArrayList<Clothing> items) {
        return items;
    }

    public double getTotalClothingCost() {
        double total = 0;
        double totalImpuesto = 0;
        double tax = 0.2;

        for (Clothing item : items) {

            if (getSize() == item.getSize()) {
                total += item.getPrice();
                totalImpuesto = (total * tax) + total;

                
            }

        }

        System.out.println("Total de compra sin impuesto: " + total);
        System.out.println("Total de compra con impuesto: " + totalImpuesto);
        return total;
    }

    

}