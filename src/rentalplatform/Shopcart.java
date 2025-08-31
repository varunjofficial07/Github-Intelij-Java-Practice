package rentalplatform;

import java.util.Scanner;

public class Shopcart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("What would you like to buy?: ");
        item = sc.nextLine();

        System.out.print("What is the price?: ");
        price = sc.nextDouble();

        System.out.print("How many items?: ");
        quantity = sc.nextInt();

        total = price* quantity;
        System.out.println("\nYou Have bought "+ quantity + " " + item + "'s");
        System.out.print("Your Total is : " + currency + total);
        

    }
}
