package com.binarySearch;

public class RotatedArray {
    public static void main(String[] args) {
        int[] nums={5,6,7,9,9,9,9,11,11,11,0,2};

        System.out.println(findYesDuplicate(nums));
    }

    static int findNoDuplicate(int[] nums) {
        int s=0, e=nums.length-1,m=-1;

        while(e>s){
            m=(s+e)/2;
            if(m<e && nums[m]>nums[m+1]){
                return m;
            } else if (m>s && nums[m-1]>nums[m]) {
                return m-1;
            } else if (nums[m]<nums[0]) {
                e=m-1;
            }else {
                s=m+1;
            }
        }
        return -1;
    }

    static int findYesDuplicate(int[] nums) {
        int s=0, e=nums.length-1,m=-1;

        while(e>s){
            m=(s+e)/2;
            if(m<e && nums[m]>nums[m+1]){
                return m;
            }
            if (m>s && nums[m-1]>nums[m]) {
                return m-1;
            }
            if (nums[m]<nums[0]) {
                e=m-1;
            }else {
                s=m+1;
            }
        }
        return -1;
    }
}
