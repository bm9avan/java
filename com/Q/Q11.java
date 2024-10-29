package com.Q;

public class Q11 {
    public static void main(String[] args) {
        System.out.println(Solution.maxArea(new int[]{2,1}));
    }
    class Solution {
        public static int maxArea(int[] h) {
            int max=Integer.MIN_VALUE;
            int l=0,r=h.length-1;
            while(r>l){
                int minh=Math.min(h[r],h[l]);
                int t=minh*(r-l);
                if(t>max)max=t;
                while(h[l]<=minh) {
                    System.out.println(l);
                    l++;}
                while(h[r]<=minh){
                    System.out.println(l);
                    r--;}
            }
            return max;
        }
    }
}
