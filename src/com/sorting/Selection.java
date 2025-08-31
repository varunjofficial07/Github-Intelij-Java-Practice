package com.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Selection {
    public static void main(String[] args) {
        int [] arr = {5,13,2,3,1,6,100};
        int n = arr.length;
        for (int i=0;i <= n -2; i++){
            int min = i;
            for(int j =i+1; j <= n-1; j++){
                if (arr[j] < arr[min]){
                    min = j;
                }
            }
            int t = arr[min];
            arr[min] = arr[i];
            arr[i] = t;
        }
        System.out.println(Arrays.toString(arr));

    }
}
