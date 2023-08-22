package com.bmp_oop;

import java.util.Arrays;

public class base {
    int a=-6;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    int b;
    base(int a, int b){
//        super();
        this.a=a;
        this.b=b;
    }
//    public String toString(){
//        return Arrays.toString(new int[]{a, b});
//    }

    void test(){
        System.out.println("im in base");
    }

    static void noover(){
        System.out.println("im in box");
    }
}
