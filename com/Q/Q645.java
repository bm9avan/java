package com.Q;

import java.util.Arrays;

public class Q645 {
    public static void main(String[] args){
        int[] arr={1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }
        public static int[] findErrorNums(int[] nums) {
            int i=0;
            int ansArr=-1,ansVal=-1;
            while(i<nums.length){
                if(nums[i]!=nums[nums[i]-1]){
                    swap(nums, i, nums[i]-1);
                }else{
//                    ansArr= nums[i];
//                    ansVal= i+1;
                    i++;
                }
            }
            for(int j=0; j<nums.length;j++){
                if(nums[j]!=j+1){
                    ansArr= nums[j];
                    ansVal= j+1;
                }
            }
            int[] ans ={ansArr,ansVal};
            return ans;
        }
        static void swap(int[] arr, int i, int j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }

}
