package com.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr [] = {2,1,4,3};
        int n = arr.length;
        for (int i = n-1; i >= 1; i--){
            for (int j =0; j<= i -1; j++){
                if (arr[j] > arr[j+1] ){
                        int t = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = t;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
