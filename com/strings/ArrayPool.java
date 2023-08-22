package com.strings;

import java.util.Arrays;

public class ArrayPool {
    public static void main(String[] args) {
        int[] a= {1};
        int[] b= {1};
//        String a= "a";
//        String b= "a";
        System.out.println(a + " " + b+a );
        System.out.println(b);
        System.out.println(Arrays.toString(a) == Arrays.toString(b) );
    }
}
