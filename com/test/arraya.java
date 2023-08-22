package com.test;

import java.util.ArrayList;
import java.util.Arrays;
//import java.util.Struct;

import java.util.Scanner;

public class arraya {

    public static void main(String[] args) {
//        System.out.println("enter size");
        Scanner in= new Scanner(System.in);
        /*
        int[] arr={5,3,2,1};
        int[] arr2= new int[5];
        Integer i=20;
        System.out.println(arr2.getClass().getName());
        System.out.println(i.getClass() == Integer.class);
         */
//        System.out.println(arr[4]);//index out of bound

//        System.out.println(args);
//        if(false)
//            System.out.println("true");
//        else
//            System.out.println("false");
//        int[] a = new int[5];
//        a = new int[]{3, 6, 6, 55, 56};
//
//        for(int i=0; i<5; i++)
//            System.out.print(a[i]+" ");
//        for (int j = 0; j < 5; j++) {
//            int i = a[j];
//            System.out.println(i);
//        }
//        System.out.print(a);
//        for (int i=0; i<5; i++){
//            a[i] = in.nextInt();
//            System.out.print(Arrays.toString(a)+" ");
//            System.out.print(a[i]+" ");
//        }


//        int [][] arr = new int[3][3];
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j]= in.nextInt();
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] +" ");
//            }
//            System.out.println();
//        }
//        System.out.print(com.test.Array.toString(arr));
        /*
        int[][] num= {{5,5}, {4,4,4}, {3,3,3,3}, {2,2,2,2,2}, {1}};
//            System.out.println(Arrays.toString(num));
        int[] nums={1,2};
//        System.out.println((nums[0]));
        System.out.println((nums)+"");
         */

//        ArrayList<Integer> li= new ArrayList<Integer>(10);
//        li.add(44);
//        li.add(44);
//        li.add(44);
//        li.add(44);
//        li.add(44);
//    System.out.println(li.size());

//    int[] arr = new int[5];
//    arr= new int[]{1, 2, 3, 4, 5, 6};
//    System.out.println(arr);

//        ArrayList<Integer> a1=new ArrayList<Integer>(Arrays.asList(5,5,64,2));
        ArrayList<Integer> a2=new ArrayList<>(Arrays.asList(1,2,3));
//        System.out.println(a2.addAll(a1));
        System.out.println(a2);
        Object[] listArr = a2.toArray();
        System.out.println(listArr+" "+ Arrays.toString(listArr)+" "+listArr.length);

        int[] arr = new int[5];
        for (int i = 0; i < 3; i++) {
            arr[i]=i+2;
        }
        System.out.println(Arrays.toString(arr)+"  "+ arr.length);
        Arrays.sort(arr);
    }
}