package com.foodorderingapp;

import java.util.List;

public class Restaurant {
    private int restId;
    private String RestaurantName;
    private String Location;
    private String menu;

    public Restaurant(int restId, String restaurantName, String location, String menu) {
        this.restId = restId;
        RestaurantName = restaurantName;
        Location = location;
        this.menu = menu;
    }

    public int getRestId() {
        return restId;
    }

    public void setRestId(int restId) {
        this.restId = restId;
    }

    public String getRestaurantName() {
        return RestaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        RestaurantName = restaurantName;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String  menu) {
        this.menu = menu;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "restId=" + restId +
                ", RestaurantName='" + RestaurantName + '\'' +
                ", Location='" + Location + '\'' +
                ", menu=" + menu +
                '}';
    }
}
