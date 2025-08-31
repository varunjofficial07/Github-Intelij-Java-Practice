package javadsa.recursion;

import java.util.Scanner;

public class PrintNameNtime {
//    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        printName(5,5);
    }
    static void printName(int i, int n){
        if(i > n){
            return;
        }
        System.out.println("varun");
        printName(i+1, n);

    }
}
