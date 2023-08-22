package com.recurtion;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(find(new int[]{2,6,5,9,11,15,24,50},0,7,50));
    }
    static int find(int[] arr,int start,int end, int target ){
        if(start<0 || end<0 || end<start){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }else if(arr[mid]>target) {
            return find(arr,start,mid-1,target);

        }else {
            return find(arr,mid+1,end,target);
        }
    }
}
