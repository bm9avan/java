package com.methods;

import java.util.Scanner;

public class Prime {
//    int k=0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter");
        int n = in.nextInt();
        print(n);
    }

    private static void print(int n) {
        int no=0;
        boolean[] arr= new boolean[n+1];
        arr[0]=arr[1]=true;
        for (int i = 2; i*i <= n; i++) {
            if(!arr[i]){
                if(isPrime(i)){
                    for (int j = 2*i; j < arr.length; j+=i) {
                        arr[j]=true;
                    }
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(!arr[i]){
                System.out.print(i+" ");
//                System.out.println((++no)+"."+i+" ");  // no.value
            }
        }
    }

    private static boolean isPrime(int i) {
//        int k=0;
        for (int j = 2; j*j< i; j++) {
            if(i%j==0){
//                System.out.println(k++);  // if i uncomment this line and line no.4 then err; if this and line 34 then this line is not even read which means this line is not even executed once why?
                return false;
            }
        }
        return true;
    }
}
