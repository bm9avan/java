package com.Q;

public class Q191 {
    public static void main(String[] args) {
//        System.out.println(hammingWeight(0001011));
        int n= 15;
        int ans=0;
        while(n!=0){
            System.out.println(n+" "+ (n & 1));
            if((n & 1) == 1){
                System.out.println("in");
                ans =  ans+1;
            }
            n = n>>>1;
        }
        System.out.println("ans  "+ ans);
    }
    public static int hammingWeight(int n) {
        int ans=0;
        while(n !=0){
            ans = n%10==1 ? ans+1 : ans;
            n/=10;
        }
        return ans;
    }
}
