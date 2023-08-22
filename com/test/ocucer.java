package com.test;

import java.util.Scanner;

public class ocucer {
    public static void main(String[] args) {
        System.out.println("enter no.");
        Scanner input=new Scanner(System.in);
        long n= input.nextInt();
        long temp = n;
        System.out.println("enter search value");
        int v =input.nextInt();
        long t=-1,c=0;
        while(t!=0){
            t=n%10;
            if(t==v){
                c++;
            }
            n=n/10;
        }
        System.out.println("the value "+v+" occures in number "+temp+" is "+c+" times");
//        for (int i = 0; i < n; i++) {
//
//        }
       // how to get one by one digit of nice
    }
}
