package com.loops;

import java.util.Scanner;

public class Toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String input = sc.next();
        StringBuilder toggle = new StringBuilder();
        char [] chars = input.toCharArray();
        for(Character ch: chars){
            if(Character.isLowerCase(ch)){
                toggle.append(Character.toUpperCase(ch));
            }
            else if (Character.isUpperCase(ch)){
                toggle.append(Character.toLowerCase(ch));
            }
            else{
                toggle.append(ch);
            }

        }
        System.out.println(toggle);
    }
}
