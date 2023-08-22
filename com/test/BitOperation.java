package com.test;

public class BitOperation {
    public static void main(String[] args) {
        int n =-3;
//        System.out.println(n | 0010000);

        System.out.println( true | true);
        System.out.println((int)(Math.log10(15)/Math.log10(2)));
        System.out.println(7 & 1<<(int)(Math.log10(15)/Math.log10(2)));
        System.out.println(n & 1 );
    }
}
