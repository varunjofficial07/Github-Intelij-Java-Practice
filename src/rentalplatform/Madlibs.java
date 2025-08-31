package rentalplatform;

import  java.util.Scanner;
public class Madlibs {

    public static void main(String[] args) {
        String adj1;
        String noun1;
        String adj2;
        String verb;
        String adj3;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an Adj1: ");
        adj1 = sc.next();
        System.out.println("Enter an noun1: ");
        noun1 = sc.next();
        System.out.println("Enter an adj2: ");
        adj2 = sc.next();
        System.out.println("Enter an verb: ");
        verb = sc.next();
        System.out.println("Enter an adj3: ");
        adj3 = sc.next();

        System.out.println("One "+ adj1 +" "+ noun1+" " + "danced wildly on top of a " + adj2 + "and " + adj3 + "watermelon. Everyone watching couldn't believe their eyes as the penguin spun like something");


    }
}

