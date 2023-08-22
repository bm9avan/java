package com.Q;

import java.util.Arrays;

public class Q26v2 {
    public static void main(String[] args) {
        int[] arr ={1,1,2,3};
        int i=removeDuplicates(arr);
        System.out.println(Arrays.toString(arr)+"  "+ i);
    }
    public static int removeDuplicates(int[] nums) {
        int i=0, j=0;
        while(i< nums.length){
//            j= i;
            while(i<nums.length-1 && nums[i] == nums[i+1] ){
                i++;
            }
            if(i==j && i>0 && nums[i-1]<nums[i]){
                j++;
            }else if(i<nums.length-1){
                swap(nums, i+1, j+1);
                i++;
                j++;
            }
            i++;
        }
        for(i=0; i < nums.length-1; i++){
            if(nums[i] >= nums[i+1]){
                return i+1;
            }
        }
        return 0;
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]= temp;
    }
}