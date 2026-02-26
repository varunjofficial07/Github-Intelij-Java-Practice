package javadsa.recursion;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayTwoPointer {
    public static void reverseArray(int l, int r, int[] arr){
        if(l >= r){
            return;
        }
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        reverseArray(l+1,r-1,arr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        reverseArray(0, arr.length -1,arr);
        System.out.println(Arrays.toString(arr));
    }
}
