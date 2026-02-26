package javadsa.sorting;

import java.util.ArrayList;

public class MergeSort {
    public static void main(String[] args) {

    }
    static void merge(int[] arr, int low, int mid, int high){
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid+1;
        
    }
    static void mergeSort(int[] arr, int low, int high){
        if(low >= high){
            return;
        }
        int mid = (low+high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
}
