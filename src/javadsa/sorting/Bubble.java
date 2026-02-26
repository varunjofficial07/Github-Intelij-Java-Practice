package javadsa.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Bubble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        //sorting
        selectionSort(arr,n);
    }
    static void selectionSort(int[] arr, int n){
        for (int i = n-1; i>= 1 ; i--) {
            for (int j = 0; j <= i-1; j++) {
                if(arr[j] > arr[j+1]){
                    int t = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = t;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
