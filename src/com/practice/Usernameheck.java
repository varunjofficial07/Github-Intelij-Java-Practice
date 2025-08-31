package com.practice;
import  java.util.Scanner;

public class Usernameheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username;
        System.out.print("enter the username: ");
        username = sc.nextLine();
        System.out.println(username);
        if (username.length() < 4 || username.length() > 12){
            System.out.println("The username should be between 4-12");
        } else if (username.contains(" ") || username.contains("_")) {
            System.out.println("Username should contain space or _");

        } else {
            System.out.println("Welcome "+ username);
        }
    }
}
class WhileOps{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String name = "";
//        while (name.isEmpty()){
//            System.out.print("Enter your name: ");
//            name = sc.nextLine();
//        }
//        System.out.println("hello!" + name);

//        String response = "";
//        while(!response.equals("Q")){
//            System.out.println("You are playing the game");
//            System.out.print("Enter your response: ");
//            response = sc.nextLine().toUpperCase();
//
//        }
//        System.out.println("You quit the Game.");
//        int num =0;
//        while(num <  1 || num > 10){
//            System.out.println("Enter the number between(11-100) : ");
//            num = sc.nextInt();
//        }
//        System.out.println("You have entered the "+ num);
    }
}
