package com.Q;

import java.util.Arrays;

public class Q287 {
    public static void main(String[] args) {
        System.out.println(findDuplicate(new int[]{3,1,3,4,2}));
    }
        public static int findDuplicate(int[] nums) {
            int i=0,ans=0;
            while(i<nums.length){
                if(nums[i]!=nums[nums[i]-1]){
                    swap(nums,i,nums[i]-1);
                }
                else{
//                    ans=nums[i];
                    i++;
                }
            }
            System.out.println(Arrays.toString(nums));
            return nums[nums.length-1];
        }

        static void swap(int[] arr, int i, int j){
            int temp= arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
}
