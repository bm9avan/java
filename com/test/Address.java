package com.test;

import java.util.Arrays;

public class Address {
    public static void main(String[] args) {
        String a= new String();
        System.out.println("before: "+a.hashCode()+" :after");
        a="new";
        System.out.println("before: "+a.hashCode()+" :after");
        a="new old";
        System.out.println("before: "+a.hashCode()+" :after");

        int[] arr2= {1,5,6,7,9};
        System.out.println(Arrays.toString(arr2));
        System.out.println("before: "+arr2.hashCode()+" :after");
        arr2[3]=100;
        System.out.println("before: "+arr2.hashCode()+" :after");
        arr2 = new int[]{2, 5};
        System.out.println("before: "+arr2.hashCode()+" :after");
    }
}
