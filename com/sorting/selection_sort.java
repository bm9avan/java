package com.sorting;

//import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class selection_sort {
    public static void main(String[] args) {
        int[] arr={-15,55,65,2,6,-5};
        sort(arr);
        System.out.print(Arrays.toString(arr));
    }
//    static void sort(int @NotNull [] arr){
    static void sort(int [] arr){

        int loc=-1;
        for(int i=0;i< arr.length-1;i++){
            int min = Integer.MAX_VALUE;
            for (int j=i;j< arr.length;j++) {
                if(min>arr[j]){
                    min = arr[j];
                    loc =j;
                }
            }
            arr[loc]=arr[i];
            arr[i]=min;
        }
    }
}
