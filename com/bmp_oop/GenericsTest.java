package com.bmp_oop;

public class GenericsTest<T> {
    public void printMe(T v){
        System.out.println(v);
    }

    public static void main(String[] args) {
        GenericsTest obj = new GenericsTest();
        obj.printMe(5);
        obj.printMe(5.5);
        obj.printMe(false);
        obj.printMe("str");
    }
}
