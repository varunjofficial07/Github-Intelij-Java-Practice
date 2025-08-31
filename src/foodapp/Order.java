package foodapp;

import java.util.ArrayList;
import java.util.List;

public class Order {
    List<MenuItem> order_item = new ArrayList<>();

    void addItem(MenuItem item){
        order_item.add(item);
        System.out.println("Added "+ item.getName() + "to Orders ");
    }
    void removeIem(int Itemid){
        order_item.removeIf(item -> item.getId() == Itemid);
        System.out.println("removed item with ID "+ Itemid + "From orders");
    }

    void calculateBilL(){
        double total = 0;
        for(MenuItem item: order_item){
            total += item.getPrice();
        }
        System.out.println("The Total Order amount is $"+total

        );
    }

}
