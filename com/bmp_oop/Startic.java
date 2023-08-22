package com.bmp_oop;

public class Startic {
    // Demonstrate static variables, methods, and blocks.
    /*
    static int a = 3;
        static int b;
        int c;
        static void meth(int x,int d) {
            System.out.println("x = " + x);
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            Startic inObj= new Startic();
            System.out.println("c = " + inObj.c);
            inObj.c =d;
            System.out.println("c update= " + inObj.c);
        }
        static {
            System.out.println("Static block initialized.");
            b = a * 4;
        }
*/
    static void zero(){
        System.out.println("in static zero method");
    }
    void first(){
        System.out.println("in first method");
    }
    void second(){
        System.out.println("in second method");
    }
    void call1(){
        System.out.println("***call1***");
        zero();
        first();
        second();
    }
    static void call2(){
        System.out.println("***call2***");
        zero();
        Startic object= new Startic();
        object.first();
        object.second();
    }

        public static void main(String args[]) {
            Startic finalObject= new Startic();
//            System.out.println(obj);
//            Startic.meth(42,99);
            finalObject.call1();
            call2();
        }


}


