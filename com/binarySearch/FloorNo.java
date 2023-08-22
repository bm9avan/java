package com.binarySearch;

public class FloorNo {
    public static void main(String[] args) {
        int[] arr={5,6,8,9,11,56};
        int res=ans(arr,12,0,arr.length-1);
        System.out.println(arr[res]);
    }
    static int ans(int[] arr, int t, int s, int e) {
        if(s>e){
            return e;
        }
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
