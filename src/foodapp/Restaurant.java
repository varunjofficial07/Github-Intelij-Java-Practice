package foodapp;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private  int id;
    private String name;

    List<MenuItem> menuItems = new ArrayList<>();

    public Restaurant(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void addMenu(MenuItem item){
       menuItems.add(item);
    }
    void showMenu(){
        for(MenuItem item: menuItems){
            System.out.println(item);
        }
    }
}
