package javadsa.sorting;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] arr = {13,2,20,10,7,4,14};
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int min =i;
            for (int j = i+1; j < n; j++) {
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
