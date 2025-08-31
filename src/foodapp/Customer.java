package foodapp;

import java.util.List;

public class Customer {
    private int customer_id;
    private String customer_name;

    public Customer(int customer_id, String customer_name) {
        this.customer_id = customer_id;
        this.customer_name = customer_name;
    }
    void browseHotels(List<Restaurant> restaurants){
        System.out.println("********Available Restaurants*********");
        for(Restaurant res : restaurants){
            System.out.println(res.getId() + ":" + res.getName());
        }
    }
    void placeOrder(Restaurant restaurant){
        Order order = new Order();
        restaurant.showMenu();
        order.addItem(restaurant.menuItems.get(0));
        order.addItem(restaurant.menuItems.get(1));
        order.calculateBilL();
    }
}
