package duke.choice;

import java.util.ArrayList;

public class customer {
    private String name;
    private String size;
    private ArrayList<Clothing> items;
    

public customer(String name, String size){
    this.name = name;
    this.size = size;
    }

public void setItems(ArrayList<Clothing> items) {
    this.items = items;
}

public String getName(){
    return name;
}

public String setName(String name){
    this.name = name;
    return name;
}

public String setSize(String size){
    this.size = size;
    return size;
}     

public void setSize(int measurement){
    
    
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


public String getSize(){
    return size;
}


public String getNombre() {
    return name;
    }

public ArrayList<Clothing> getItems() {
    return items;
}


}