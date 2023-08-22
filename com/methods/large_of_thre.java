package com.methods;

import java.util.Scanner;

public class large_of_thre {
    public static void main(String[] args) {
        System.out.println("enter values");
        Scanner input= new Scanner(System.in);
        int a= input.nextInt();
        int b= input.nextInt();
        int c= input.nextInt();
        if (a>b && a>c){
            System.out.println("a is grater");
        } else if (b>c) {
            System.out.println("b is grater");
        }else {
            System.out.println("c is grater");
        }

    }
}
