package com.test;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListClone {
    public static void main1(String[] args) {
        ArrayList arr= new ArrayList();
        arr.add(8);
        arr.add(5);
        arr.add(65);
        arr.add(5);
        arr.add(54);
        System.out.println(arr);
ArrayList arr2= (ArrayList) arr.clone();
        System.out.println(arr2);
arr.remove(2);
arr.add(999);
        System.out.println(arr);
        System.out.println(arr2);
        Integer[] array1= new Integer[]{5, 5, 4, 6, 1};
//        ArrayList<Integer> list = (ArrayList) Arrays.asList(array1);
//        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(array1));
//        List<Integer> list = Arrays.asList(array1);
//        list.remove(2);
//        System.out.println(array1.toString());
//        System.out.println("hihihi"+list);
        ArrayList<Integer> a= new ArrayList<>(5);
        a.add(1);
        System.out.println(a);
        System.out.println(a.get(2));
    }
}
