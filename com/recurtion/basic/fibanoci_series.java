package com.recurtion.basic;

import java.util.Scanner;

public class fibanoci_series {
    public static void main(String[] args) {
        System.out.println("enter n value");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = 0;
        int b = 1;
        System.out.print(0+"\t");
        for (int i = 1; i <=n; i++) {
//            int temp=a;
//            a=b;
//            b=temp+b;
            int temp= b;
            b=a+b;
            a=temp;
            System.out.print(a+"\t");
        }
//        if (n != 0) {
//            System.out.println("at "+n+" place is "+a);
//        }else {
//            System.out.println("at "+n+" place is "+b);
//
//        }
    }
}
