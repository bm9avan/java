package com.binarySearch;

public class CeilingNo {

    public static void main(String[] args) {
        int[] arr={5,6,8,9,11,56};
        int res=ans(arr,100,0,arr.length-1);
        System.out.println(res<arr.length? arr[res]: -1);
    }
    static int ans(int[] arr, int t, int s, int e) {
        if(s>e){
            return s;
        }
//        int m= (s-e)/2 +e;
        int m= (e-s)/2 +s;
        if(arr[m]==t){
            return m;
        }
        if (arr[m] > t) {
            return ans(arr,t,s,m-1);
        } else {
           return ans(arr, t, m+1, e);
        }
    }
}
