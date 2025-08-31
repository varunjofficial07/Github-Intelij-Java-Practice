package javadsa;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the char: ");
        char ch = sc.next().trim().charAt(0);
        if(Character.isUpperCase(ch)){
            System.out.println("Upper Case");
        }
        else {
            System.out.println("Lower case");
        }
    }
}
