package com.foodorderingapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerList {
    Scanner sc = new Scanner(System.in);
    boolean found = false;
    public static List<User> users = new ArrayList<>();
    User u1 = new User(1,"vijay", "vijay@gmail.com");
    User u2 = new User(2,"naveen", "naveen@gmail.com");
    User u3 = new User(3,"sam", "sam@gmail.com");
    {
        users.add(u1);
        users.add(u2);
        users.add(u3);
    }
    void getAllusers(){
        for(User u: users){
            System.out.println(u);
        }
    }

    void displayUserbyId(){
        System.out.println("Enter the id: ");
        int id = sc.nextInt();
        for(User u: users){
            if(u.getUserId() == id){
                System.out.println(u);
                found = true;
            }

        }
        if(!found){
            System.out.println("Not found");
        }


    }
}
