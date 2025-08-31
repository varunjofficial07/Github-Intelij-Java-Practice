package javadsa.recursion;

import java.util.Scanner;

public class CheckPalindrome {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the String: ");
        String string = sc.nextLine();
        System.out.println(palindromeCheck(0,string));
    }
    static boolean palindromeCheck(int i, String s){
        char[] array = s.toCharArray();
        int n = array.length;
        if(i >= n/2){
            return true;
        }
        if(array[i] != array[n-i-1]){
            return false;
        }

        return palindromeCheck(i+1,s);

    }
}
