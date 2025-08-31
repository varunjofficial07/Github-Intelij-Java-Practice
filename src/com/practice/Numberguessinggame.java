package com.practice;
import  java.util.Scanner;
import  java.util.Random;

public class Numberguessinggame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int guess=0;
        int randomNum = random.nextInt(1,11);
        System.out.println("Guess a number between 1 - 10: ");
        while (guess != randomNum){
            System.out.print("Enter the guess: ");
            guess = sc.nextInt();
            if (guess < randomNum){
                System.out.println("Too Low! Try again");
            } else if (guess > randomNum) {
                System.out.println("Too high! try again");
            }
            else {
                System.out.println("Your guess is Right! You won.. The Number is: "+randomNum);
            }
        }
        sc.close();
    }
}
