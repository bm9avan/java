package com.Q.o;
import java.util.Arrays;
import java.util.Scanner;

public class DMK {

    static void  revstr(char arr[], int start, int end){
        while (start<end)
        {   char temp;
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
//            revstr(arr,start,end);
        }
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("enter the string !");
        String str=in.next();
        char[] arr = str.toCharArray();
        System.out.println("arr is"+ Arrays.toString(arr));
        int n=arr.length;
        revstr(arr,0,n-1);
        for (int i=0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");

    }
}