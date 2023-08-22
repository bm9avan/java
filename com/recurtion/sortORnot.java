package com.recurtion;

public class sortORnot {
    public static void main(String[] args) {
        boolean res= check(new int[]{1,2,3,6,4},0);
        System.out.println(res);
    }
    static boolean check(int[] arr, int a){
        System.out.println(a);
        if(a == arr.length-1){
            return true;
        }
//        else if(arr[a] > arr[a+1]){
//            return false;
//        }else {
//            return check(arr, a+1);
//        }
        return arr[a]< arr[a+1] && check(arr, a+1)  ;
    }
}
