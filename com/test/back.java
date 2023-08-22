package com.test;

import java.util.ArrayList;
import java.util.Scanner;

public class back {

    public static void main(String[] args) {
//        int q=55;
//        com.test.back();

//        System.out.println(q);
//        q=7;
//        System.out.println(q);
//        {
//            int a=1;
//            System.out.println(a);
//
//        }
////        System.out.println(a);
//
//        int a=55;
//        System.out.println(a);
//        com.test.back(1,2);
//        System.out.println(check(7));
//        Integer num = new Integer(55);
        System.out.println((char)(97+25));
    }
//    static  void com.test.back(int ...v){
//        System.out.println(5);
//    }
//    static void com.test.back(int a, int b){
////        int q=17;
//        System.out.println(55);
//    }
    static boolean check(int a){
        for(int i=2;i*i<=a;i++){
            if (a%i==0){
                return false;
            }
        }
        return true;
    }

}
