package com.Q;

public class Q41v3 {
    public static void main(String[] args) {
        int[] arr= {7,8,9,11,12};
        System.out.println(firstMissingPositive(arr));
    }
    // all three vertions are wrong vertions check leetcode for correct;
    public static int firstMissingPositive(int[] nums) {
        int i=0;
        while(i<nums.length){
            if(nums[i]>0){
                if(nums[i]!=nums[nums[i]-1] && nums[i]<nums.length){
                    swap(nums,i,nums[i]-1);
                }else{
                    i++;
                }
            }else{
                i++;
            }
        }
        for(int j=0; j<nums.length;j++){
            if(nums[j]!=j+1){
                return j+1;
            }
        }
        return 0;
    }


    static void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }


}
