package com.foodorderingapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RestaurantList {
    Scanner sc = new Scanner(System.in);
    boolean found = false;
    public static List<Restaurant> restaurants = new ArrayList<>();
    Restaurant u1 = new Restaurant(1,"vijay", "ambatur", "Biryani");
    Restaurant u2 = new Restaurant(1,"vijay", "ambatur", "Biryani");
    Restaurant u3 = new Restaurant(1,"vijay", "ambatur", "Biryani");

    {
        restaurants.add(u1);
        restaurants.add(u2);
        restaurants.add(u3);
    }
    void displayRestaurants(){
        for(Restaurant restaurant: restaurants){
            System.out.println(restaurant);
        }
    }
    void displayRestaurantbyId(){
        System.out.println("Enter the Restaurant id: ");
        int id = sc.nextInt();
        for(Restaurant restaurant: restaurants){
            if(restaurant.getRestId() == id){
                System.out.println(restaurant);
                found = true;
            }

        }
        if(!found){
            System.out.println(" No Restaurant found.");
        }


    }
}
