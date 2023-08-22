package com.bmp_oop;

import java.util.LinkedList;
import java.util.List;

public class StaticBlockTest {

    static int a = 2;
    static int b;
    static void call() {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    static {
        System.out.println("Static block initialized.");
        b = a * 4;
    }
    public static void main(String args[]) {
        System.out.println(b);
        call();
        List l= new LinkedList<>();
    }
}
