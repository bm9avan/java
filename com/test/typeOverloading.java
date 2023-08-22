package com.test;

public class typeOverloading {
    static int fun(int a, int b){
        return a+b;
    }
    static double fun(double a, double b){
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println(fun(1,2));
        System.out.println(fun(1.2,2.5));
    }
}
