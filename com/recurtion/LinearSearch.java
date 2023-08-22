package com.recurtion;

import java.util.ArrayList;

public class LinearSearch { public static void main(String[] args) {
    int[] arr= new int[]{1,2,2,2,2};
    int target= 2;
    boolean res= check(arr, target, 0);
    System.out.println(res);

    findAllIndex(arr, target, 0);
    System.out.println(allIndex);

    ArrayList<Integer> ans = new ArrayList<Integer>();
    System.out.println(findAllIndex(arr, target, 0, ans));
    System.out.println(ans);

    System.out.println(findAllNOpassing(arr,target,0));

}
    static boolean check(int[] arr, int target, int a){
        System.out.println(a);
        if (a == arr.length) {
            return false;
        }
//        else if(arr[a]== target){
//            return true;
//        }else {
//            return check(arr,target, a+1);
//        }
        return arr[a]== target || check(arr,target, a+1)  ;
    }

    static ArrayList<Integer> allIndex= new ArrayList<>();

    static void findAllIndex(int[] arr, int tatget, int a){
        System.out.println(a);
        if(a== arr.length){
            return;
        }
        if(arr[a]==tatget){
            allIndex.add(a);
        }
        findAllIndex(arr, tatget, a+1);
    }

    static ArrayList<Integer> findAllIndex(int[] arr, int tatget, int a, ArrayList<Integer> allIndex){
        System.out.println(a);
        if(a== arr.length){
            return allIndex;
        }
        if(arr[a]==tatget){
            allIndex.add(a);
        }
        return findAllIndex(arr, tatget, a+1, allIndex);
    }

    static ArrayList<Integer> findAllNOpassing(int[] arr, int tatget, int a){
        System.out.println(a);
        if(a== arr.length){
            ArrayList<Integer> allIndex= new ArrayList<>();
            return allIndex;
        }
        ArrayList<Integer> allIndex=findAllNOpassing(arr, tatget, a+1);
        if(arr[a]==tatget){
            allIndex.add(a);
        }
        return allIndex;
    }
}

