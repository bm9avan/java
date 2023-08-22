package com.methods;

import java.util.Arrays;

public class gcd {
    public static void main(String[] args) {
        System.out.println(gcd(123,3));
        System.out.println(gcd2(123,3));

    }

    static int gcd(int m, int n){
        for(;m!=n;){
//        while (m!=n){
            if (m>n){
                m=m-n;
            }else {
                n=n-m;
            }
        }

        return m;
    }

    static int gcd2(int m, int n){
        if(m%n == 0) return n;
        return gcd2(n, m % n);
    }
}
