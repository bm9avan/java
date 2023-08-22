package com.recurtion;

import java.util.Arrays;

public class BoobleSort {
    public static void main(String[] args) {
        int[] arr={4,3,5,1};
        bobble(arr, arr.length, 0);
        System.out.println(Arrays.toString(arr));
    }

    private static void bobble(int[] arr, int i, int j) {
        if(i == 0){
            return;
        }
        if(i-1>j){
            if(arr[j]> arr[j+1]){
                swap(arr, j, j+1);
            }
            bobble(arr, i, j+1);
        }else {
            bobble(arr, i-1, 0);
        }
    }

    private static void swap(int[] arr, int j, int i) {
        int temp= arr[j];
        arr[j]= arr[i];
        arr[i]=temp;
    }
}
