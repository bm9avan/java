package com.recurtion;

import java.util.Arrays;

public class SlectionSort {
    public static void main(String[] args) {
        int[] arr={4,3,5,1};
        slec(arr, arr.length, 0,0);
        System.out.println(Arrays.toString(arr));
    }

    private static void slec(int[] arr, int i, int j, int mi) {
        if(i == 0){
            return;
        }
        if(i-1>j){
            if(arr[j]> arr[j+1]){
                slec(arr, i, j+1, j);
            }else {
                slec(arr,i,j+1, mi);
            }
        }else {
            swap(arr, mi, i-1 );
            slec(arr, i-1, 0,0);
        }
    }

    private static void swap(int[] arr, int j, int i) {
        int temp= arr[j];
        arr[j]= arr[i];
        arr[i]=temp;
    }
}
