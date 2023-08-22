package com.Q;

public class Q53 {
    public static void main(String[] args) {
        int[] nums ={-2,1,-3,4,-1,2,1,-5,4};
        int ans= maxSubArray( nums);
        System.out.println(ans);
    }
    public static int maxSubArray(int[] nums) {
        float startX= 0;
        float endX= nums.length;
        endX-=1;
        int maxSum=Integer.MIN_VALUE;
        int start= (int) startX;
        int end=(int) endX;
        while(end>=start){

            int sum=0;
            for(int i=start;i<=end;i++){
                sum+=nums[i];
            }
            if(sum>maxSum){
                maxSum=sum;
            }
            startX+=0.5;
            endX-=0.5;
            start= (int) startX;
            end=(int) endX;
        }
        return maxSum;
    }
}
