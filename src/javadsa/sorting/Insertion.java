package javadsa.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Insertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        //insertionsort
        insertionSort(arr,n);
    }
    static void insertionSort(int[] arr, int n){
        for (int i = 0; i <= n-1 ; i++) {
            int j =i;
            while (j>0 && arr[j-1] > arr[j]){
                int t = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = t;
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
