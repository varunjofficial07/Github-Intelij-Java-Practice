package com.practice;
import org.w3c.dom.ls.LSInput;

import java.util.Random;
import java.util.Scanner;
public class Practise1 {
    public static void main(String[] args) {
        Random rand  = new Random();
        int num1;
        int num2;
        int num3;
        num1 = rand.nextInt(1,8);
        num2 = rand.nextInt(1,8);
        num3 = rand.nextInt(1,8);
        System.out.println(num1);
        System.out.println(num2);
    }
}
class Practise2 {
    public static void main(String[] args) {
        Random random = new Random();
        double num1;
        double num2;
        num1= random.nextDouble(100, 200);
        System.out.println(num1);
    }
}
class MathSums{
    public static void main(String[] args) {
        double result;
        result = Math.sqrt(9);
        System.out.println(result);
    }
}
class Sample{
    public static void main(String[] args) {
        String name = "varun";
        char firstletter = 'v';
        boolean isEmployed = true;
        int age = 45;
        System.out.printf("Hello %s\n", name);
        System.out.printf("Your First letter %c\n", firstletter);
        System.out.printf("Your age is  %d\n", age);
    }
}
class IntrestCalculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double principal;
        double rate;
        int time;
        int years;
        double amount;
        System.out.print("Enter the pricipal amount: ");
        principal = sc.nextDouble();
        System.out.print("Enter the rate (in %): ");
        rate = sc.nextDouble() / 100;
        System.out.print("Enter the TimeCompounded: ");
        time = sc.nextInt();
        System.out.print("Enter the years: ");
        years = sc.nextInt();
        amount = principal * Math.pow(1+rate / time, time * years);
        System.out.printf("The Amount after %d years is $:%.2f", years, amount);
    }
}

class NestedIf {
    public static void main(String[] args) {
        boolean isStudent=true;
        boolean isSenior=true;
        double price = 750000;

        if (isStudent){
            if (isSenior){
                System.out.println("You get the Student discount of 10%");
                System.out.println("You get the Senior discount of 20%");
                price *= 0.7;
            }
            else{
                System.out.println("You get the Student discount of 10%");
                price *= 0.9;
            }
        }
        else{
            if (isSenior){
                System.out.println("You get the Senior discount of 20%");
                price *= 0.8;
            }
            price *= 1;
        }
        System.out.println("The price of the ticket is $" + price);
    }
}
class Stringoperations{
    public static void main(String[] args) {
//        String name = "Mrcooper Group";
//        name = "password";
//        int length = name.length();
//        char letter = name.charAt(5);
//        int index = name.indexOf("o");
//        int lastindex = name.lastIndexOf("o");
//        name = name.toUpperCase();
//        name = name.replace("o","a");
//        System.out.println(name);
//        System.out.println(index);
//        System.out.println(letter);
//        System.out.println(length);
//        if (name.isEmpty()) {
//            System.out.println("Your name is empty");
//        }
//        else{
//            System.out.println("Hello "+ name);
//        }
//        if (name.contains(" ")){
//            System.out.println("Your name contains space");
//        }
//        else{
//            System.out.println("Your name doesnot have any space");
//        }
//        if (name.equals("password")){
//            System.out.println("Your name cannot be your password");
//        }
//        else {
//            System.out.println("Hello "+ name);
//        }
//        String email = "varun@mrcooper.com";
//        String username = email.substring(0,5);
//        String domain = email.substring(6, email.length());
//        System.out.println(domain);
//        Scanner sc = new Scanner(System.in);
//        String email;
//        String username;
//        String domain;
//        System.out.print("Enter the Email: ");
//
//        email = sc.nextLine();
//        if (email.contains("@")){
//            username = email.substring(0, email.indexOf("@"));
//            domain = email.substring(email.indexOf("@") +1);
//
//            System.out.println(username);
//            System.out.println(domain);
//        }
//        else{
//            System.out.println("Email must contain @ character");
//        }
//
  }
}
class WeightConversion{
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//
//        double weight;
//        double new_weight;
//        int choice;
//        System.out.println("Weight Conversion Program");
//        System.out.println("1: Convert Lbs to Kgs");
//        System.out.println("2: COnvert kgs to Lbs");
//
//        System.out.print("Choose an option: ");
//        choice = sc.nextInt();
//        if (choice == 1){
//            System.out.print("Enter the Weight in lbs: ");
//            weight = sc.nextDouble();
//            new_weight = weight * 0.453592;
//            System.out.printf("The New Weight in Kgs is: %.2f", new_weight);
//        } else if (choice == 2) {
//            System.out.print("Enter the Weight in Kgs: ");
//            weight = sc.nextDouble();
//            new_weight = weight * 2.20462;
//            System.out.printf("The New Weight in Lbs is: %.2f", new_weight);
//
//        }
//        else{
//            System.out.println("That was not a valid choice");
//        }
//        sc.close();

    }
}

class TernaryOps{
    public static void main(String[] args) {
//        int score;
//          Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the score: ");
//        score = sc.nextInt();
//        String passorFail = (score >= 35) ? "Pass" : "Fail";
//        System.out.println(passorFail);
//        int num;
//        System.out.print("Enter the num: ");
//        Scanner sc = new Scanner(System.in);
//        num = sc.nextInt();
//        String EvenorOdd = (num % 2 == 0) ? "EVEN": "ODD";
//        System.out.println(EvenorOdd);
//        Scanner sc = new Scanner(System.in);
//        double temp;
//        double new_temp;
//        String unit;
//        System.out.print("Enter the Temperature: ");
//        temp = sc.nextDouble();
//
//        System.out.print("Convert to Celsius or Farhenhiet? (C or F): ");
//        unit = sc.next().toUpperCase();
//
//        new_temp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 5 /9) + 32;
//        System.out.printf("%.2f°%s",new_temp,unit);
//
//
//
//        sc.close();
    }
}
class DayGuess {
    public static void main(String[] args) {
//        Scanner sc =new Scanner(System.in);
//        System.out.print("Enter the day of week: ");
//        String day = sc.nextLine();
//        switch (day){
//            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"  -> System.out.println("It is weekday");
//            case "Sunday", "Saturday " -> System.out.println("It is weekend");
//            default -> System.out.println(day + " is not a day");
//
//        }
    }
}
class  CalculatorProgram {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        double num1;
//        double num2;
//        char operator;
//        double result = 0;
//
//        System.out.print("enter the num1: ");
//        num1 = sc.nextDouble();
//        System.out.print("Enter the operator(+, -, *, /, ^): ");
//        operator = sc.next().charAt(0);
//        System.out.print("enter the num2: ");
//        num2 = sc.nextDouble();
//        switch (operator){
//            case '+' -> result = num1 + num2;
//            case '-' -> result = num1 - num2;
//            case '*' -> result = num1 * num2;
//            case '/' -> result = num1 / num2;
//            case '^' -> result = Math.pow(num1, num2);
//        }
//        System.out.println(result);
//        sc.close();
    }
}
class Vowelchecker {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the character: ");
//        char letter = sc.nextLine().charAt(0);
//        switch (letter){
//            case 'a', 'i', 'o', 'u', 'e' -> System.out.println(letter + " is a vowel");
//            default -> System.out.println("It is a consonant");
//        }
//
    }
}
//class Logicaloperators {
//    public static void main(String[] args) {
////        double temp = -21;
////        boolean isSunny = false;
////        if(temp <= 30 && temp >= 0 && isSunny){
////            System.out.println("The weather is Good");
////            System.out.println("It is sunny outside");
////        } else if (temp <= 30 && temp >= 0 && !isSunny) {
////            System.out.println("The weather is Good");
////            System.out.println("It is Couldy outside");
////        } else if (temp > 30 || temp < 0) {
////            System.out.println("The Weather is bad!");
////        }
//        Scanner sc = new Scanner(System.in);
//        String username;
//        username = sc.nextLine();
//        if (username.length() < 4 || username.length() > 12) {
//            System.out.println("Username must be 4-12 characters.");
//
//        }
//    }
//}


class Usernamecheck{

}