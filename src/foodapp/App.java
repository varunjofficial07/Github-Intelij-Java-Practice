package foodapp;

import rentalplatform.CabService;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        boolean isRunning = true;
        Scanner sc = new Scanner(System.in);
        Restaurant r1 = new Restaurant(1,"SS Hyderabad");
        r1.addMenu(new MenuItem(101,"Chicken Biriyani", 200, "Main Course"));
        r1.addMenu(new MenuItem(102,"Mutton Biriyani", 250, "Main Course"));

        Restaurant r2 = new Restaurant(2, "Panidan Hotel");
        r2.addMenu(new MenuItem(201,"Chicken Noodle", 100, "Main Course"));
        r2.addMenu(new MenuItem(202,"Mutton Chuka", 260, "Starter"));
        List<Restaurant> restaurants = Arrays.asList(r1,r2);


        Customer c1 = new Customer(1, "varun");


        do{
            menu();
            System.out.println("Enter the choice: ");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Browsing Restaurants");
                    c1.browseHotels(restaurants);
                    break;
                case 2:
                    System.out.println("2.Placing Order ");
                    c1.placeOrder(r1);
                    break;
                case 3:
                    System.out.println("Exit the app");
                    isRunning = false;
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");

            }
        }while (isRunning);

    }
    public static void menu(){
        System.out.println("-----------------Welcome to cab rental platform----------------");
        System.out.println("1.Browse Restaurants \n 2.Place Order  \n 3.Exit App");
    }

}
