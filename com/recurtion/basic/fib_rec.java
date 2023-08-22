package com.recurtion.basic;

import java.util.Arrays;
import java.util.Scanner;

public class fib_rec {
    static int[] arr;
    public static void main(String[] args) {
        System.out.println("enter n");
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        arr= new int[n+1];
        System.out.println("ans:"+fibo(n));
       System.out.println(Arrays.toString(arr));
    }

    static int fibo(int n) {
        if(n!=0 && arr[n]!=0){
            return arr[n];
        };
        if (n<2) {
//            System.out.print(n +" ");
            arr[n]=n;
            return n;
        }
//        System.out.println(fibo(n-1)+fibo(n-2));
        arr[n]=fibo(n-1)+fibo(n-2);
        return (arr[n]);
    }
}
