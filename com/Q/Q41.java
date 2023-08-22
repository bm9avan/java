package com.Q;

import java.util.Arrays;

public class Q41 {
    public static void main(String[] args) {
        int[] arr={3,4,1,-1};
        firstMissingPositive(arr);

    }

        public static void firstMissingPositive(int[] nums) {
            int i=0;
            int min = 0;
            for(int j=1; j<nums.length; j++){
                if(nums[min]>nums[j]){
                    min=j;
                }
            }
            int minVal= nums[min];
            while(i<nums.length){
                if(nums[i]!=i+minVal && nums[i]>nums.length+minVal){
                    swap(nums,i,nums[i]-minVal);
                }else{
                    i++;
                }
            }
        System.out.println(Arrays.toString(nums));
        }
    static void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

}
