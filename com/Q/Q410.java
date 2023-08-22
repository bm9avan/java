package com.Q;

public class Q410 {
    public static void main(String[] args) {
        int ans= splitArray(new int[]{3,2,3,1,2,4,5,5,6,7,7,8,2,3,1,1,1,10,11,5,6,2,4,7,8,5,6}, 20);
        System.out.println(ans);
    }

    public static int splitArray(int[] nums, int k) {
        int s=0,e=0,m=-1,ans=-1;
        for(int i=0;i<nums.length; i++){
            s= Math.max(s,nums[i]);
            e+=nums[i];
        }
        while(e>s){
            int sum=0, pic=1;
            m = s+ (e-s)/2;
            for(int i=0;i<nums.length; i++){
                if(sum + nums[i] > m){
                    sum=nums[i];
                    pic++;
                }else{
                    sum+=nums[i];
                }
            }
            if(pic>k){
                s=m+1;
            }else{
                e=m;
            }
        }
        return s;
    }
}
