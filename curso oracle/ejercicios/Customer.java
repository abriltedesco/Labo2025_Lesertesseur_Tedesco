package ejercicios.ShopApp;

public class Customer{
    private String name;
    private String size;
    private Clothing[] items;

    public Customer(){
        this.name = "default";
        this.size = "S";
    }

    public Customer(String name, int size){
        this.name = name;
        setSize(size);
    }

    public void addItems(Clothing[] items){
        this.items = items;
    }

    public Clothing[] getItems(){
        return items;
    }

    public void setItems(Clothing[] items){
        this.items = items;
    }

    public double getTotalClothing(){
        double total = 0.0;
        for(Clothing item : items){
                total += item.getPrice();
        }
        return total;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public char getSize() {
        return size; 
    }
    public void setSize(String size) { 
        this.size = size; 
    }

    public void setSize(int measurement) { 
        switch(measumerent){
            case 1,2,3:
                setSize("S");
                break;
            case 4,5,6:
                setSize("M");
                break;
            case 7,8,9:
                setSize("L");
                break;
            default:
                setSize("X");
                break;
        }
    }
};
