package javadsa.recursion;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        reverse(0,arr,n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static void reverse(int i, int [] arr, int n){
        if(i >= n/2){
            return;
        }
        int temp = arr[i];
        arr[i] = arr[n-i-1];
        arr[n-i-1] = temp;
        reverse(i+1,arr,n);
    }
}
