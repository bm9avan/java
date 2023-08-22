package com.Q.o;

import java.util.Scanner;

public class anna1 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        int n= in.nextInt();
        int[] arr= new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= in.nextInt();
        }
        sort(arr);
        for (int i = 0; i < n-1; i++) {
            if(arr[i]==arr[i+1]){
                System.out.println(arr[i]);
            }
        }
    }

    static void sort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j]<arr[j-1]) {
                    swap(arr,j,j-1);
                }else{
                    break;
                }
            }
        }
    }


    private static void swap(int[] arr,int i,int j) {
        arr[i]=arr[i]+arr[j];
        arr[j]=arr[i]-arr[j];
        arr[i]=arr[i]-arr[j];
    }
}
