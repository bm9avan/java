package com.binarySearch;

public class BS {
    public static void main(String[] args) {
//        int[] arr={1,2,3,4,5,6};
        int[] arr={6,5,5,4,3};
        int t=3;
        binaySearch(arr, t); // order agnostic binary search
    }

    private static void binaySearch(int[] arr, int t) {
        int s=0;
        int e=arr.length-1;
        int m=-1;
        boolean isAsending=arr[s]-arr[e]<0;
//        if(arr[s]-arr[e]>0){
//            isAsending=false;
//        }else {
//            isAsending=true;
//        }
        while (e>=s){
            m= (s+e)/2;
            if(arr[m]==t){
                break;
            } else if(isAsending){
                if(arr[m]>t){
                    e=m-1;
                }else {
                    s=m+1;
                }
            }else {
                if(arr[m]<t){ //grater than changed to less than;
                    e=m-1;
                }else {
                    s=m+1;
                }
            }
        }
        System.out.println(t+" is at "+m);
    }
}
