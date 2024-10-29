package com.Q;

import java.util.Arrays;

public class Q322 {
    int ans= Integer.MAX_VALUE;
    public int coinChange(int[] c, int a) {
        Arrays.sort(c);
        System.out.println(Arrays.toString(c));
        helper(c, a, 0);
        return ans==Integer.MAX_VALUE? -1: ans-1;
    }
    public int helper(int[] c, int a, int coins){
        if(a<0)return -1;
        if(a==0){
            ans=Math.min(ans,coins+1);
        }
        for(int i=c.length-1; i>=0; i--){
            helper(c, a-c[i], coins+1);
            // System.out.println(c[i]+" "+a+" "+t);
            // if(t>0) return t+1;
        }
        return 0;
    }
}