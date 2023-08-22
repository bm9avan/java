package com.Q.o;

import java.util.Arrays;

public class anna {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,6,8,9,10,11};
        print(arr);
    }

    static void print(int[] arr) {
        int i = 0;
        int min=0;
        while (i != arr.length) {
            if ((arr[i]) != i+arr[min]-min) {
                printout(arr,min,i-1);
                min=i;
                i++;
            } else {
                i++;
            }
        }
        printout(arr,min,i-1);
    }

    private static void printout(int[]arr,int min, int i) {
        if(arr[min]==arr[i]){
            System.out.println(arr[i]);
        }else{
            System.out.println(arr[min]+"->"+arr[i]);
        }
    }

}
