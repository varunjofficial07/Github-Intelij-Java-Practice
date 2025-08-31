package com.vehicleservice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean enteredApp = true;
        Scanner sc = new Scanner(System.in);
        Customers c = new Customers();

        do{
            menu();
            System.out.print("Enter Choice:");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Listing All Users");
                    c.displayUser();
                    break;
                case 2:
                    System.out.println("Enter Id to search: ");
                    int customer_id = sc.nextInt();
                    c.displayUserbyId(customer_id);
                    break;
                case 3:
                    int id;
                    while (true) {
                        System.out.println("Enter the id: ");
                        id = sc.nextInt();
                        boolean exist = false;
                        for (Customers customer : CustomerList.customers) {
                            if (customer.getCustomer_id() == id) {
                                exist = true;
                                break;
                            }
                        }
                        if (exist) {
                            System.out.println("Id already present");
                        } else {
                            break;
                        }
                    }
                    sc.nextLine();
                    System.out.println("Enter the name: ");
                    String name = sc.nextLine();
                    System.out.println("Enter email: ");
                    String email = sc.nextLine();
                    System.out.println("Enter password: ");
                    String password = sc.nextLine();
                    c.addUser(id, name, email, password);
                    break;
                case 4:
                    System.err.println("Exited app");
                    System.exit(0);
                    enteredApp = false;
                    break;
                default:
                    System.out.println("Invalid choice");
            }

        }while (enteredApp);
    }

    public static void menu(){
        System.out.println("\n------Vehicle Service------\n");
        System.out.println("1.List all users");
        System.out.println("2.Search Customer by id");
        System.out.println("3.Add new user");
        System.out.println("4.Exit App\n");

    }
}
