package com.Q;

import java.util.Arrays;

public class Q26 {
    public static void main(String[] args) {
        int[] arr ={1,1,2};
        int i=removeDuplicates(arr);
        System.out.println(Arrays.toString(arr)+"  "+ i);
    }
    public static int removeDuplicates(int[] nums) {
        /*
        int ans=1;
        int check = nums[0];
        // int[] arr=new int[];
        ArrayList list = new ArrayList();
        list.add(nums[0]);
        for(int i =1 ; i< nums.length; i++){
            if(check != nums[i]){
                ans++;
                check = nums[i];
                list.add(check);
            }
        }
        // return list.toArray();
        return list.size();
        */
        int i=1;
        int min = nums[0];
        for(i=1; i< nums.length; i++){
            if(min > nums[i]){
                min = nums[i];
            }
        }
        i=0;
        while(i <nums.length){
            int correct = nums[i] - min;
            if(nums[i] != nums[correct]){
                // int temp = nums[i];
                // nums[nums[i]]= nums[i];
//                swap(nums, i, nums[i]);
                swap(nums, i, correct);
            }else{
                i++;
            }
        }

        for(i=0; i< nums.length-1; i++ ){
            if(nums[i] > nums[i+1]){
                break;
            }
        }
        return i;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
    }
}