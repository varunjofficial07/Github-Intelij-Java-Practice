package com.foodorderingapp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User user = new User();
        CustomerList customers = new CustomerList();

        boolean is_running = true;
        menu();
        do{
            System.out.println("Enter you choice: ");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Get all users");
                    customers.getAllusers();
                    customers.displayUserbyId();
                    break;
                case 2:
                    System.out.println("display restaurant by id");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while (is_running);
    }
    public static void menu(){
        System.out.println("1. Display Users \n 2.Display Restaurants \n 3.OrderFoodbyResIt");
    }
}