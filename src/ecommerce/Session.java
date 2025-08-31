package ecommerce;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Session {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        List<Admin> admins = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        boolean isLogged = true;
        users.add(new User(1,"kumar","kumar@gmail.com","kumar123"));
        admins.add(new Admin(1,"admin","admin@gmailc.om","admin123"));
        while (isLogged){
            System.out.println("\n-----------WELCOME TO E-GROCERY SHOP-----------\n");
            System.out.println("SELECT AN OPTION TO LOGIN");
            System.out.println("1.Admin");
            System.out.println("2.User");
            System.out.println("3.Exit the APP\n");

            System.out.print("Enter you choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    AdminValidation validate = new AdminValidation("admin","admin123");
                    Admin adminData = validate.validateAdmin(admins);
                    if(adminData!=null){

                    }
                    break;
                case 2:
                    System.out.println("Logged as customer");
                    break;
                case 3:
                    System.err.println("Exit");
                    isLogged = false;
                    break;
                default:
                    System.out.println("Invalid output");
            }
        }
    }
}
