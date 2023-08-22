package com.Q;

import java.util.Arrays;

public class Q34 {
    public static void main(String[] args) {
//        int[] ans = searchRange(new int[]{2,2,},2);
        int[] ans = logRangle(new int[]{0,2,2,2,2,5,10},2);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] searchRange(int[] nums, int t) {
        int s=0;
        int e=nums.length;
        int m;
        int i=-1;
        while(s<=e){
            m= (s+e)/2;
            if(nums[m]>t){
                e=m-1;
            }else if(nums[m]<t){
                s=m+1;
            }else{
                i=m;
                break;
            }
        }
        if(i==-1){
            return new int[]{-1,-1};
        }else{
            System.out.println(i);
            int l=find(nums,i,true);
            int r=find(nums,i,false);
            return new int[]{l,r};
        }
    }

    static int find(int[] arr, int i, boolean lRr){
        // lRr && arr[i-1]==arr[i] && i--;
        // lRr && arr[i+1]==arr[i] && i++;
        if(lRr){
            while(i!=0 && arr[i-1]==arr[i]){
                i--;
            }
        }else{
            while(i!= arr.length-1 && arr[i+1]==arr[i]){
                i++;
            }
        }
        return i;
    }

    static int[] logRangle(int[] arr, int t){
        int l=logFind(arr,t, true);
        int r=logFind(arr,t, false);
        return new int[]{l,r};
    }

    private static int logFind(int[] arr,int t, boolean b) {
        int s=0;
        int e=arr.length-1;
        int m=0;
        int ans=-1;
        while(s<=e){
            m= s+(e-s)/2;
            if(arr[m]==t){
                if(b){
                    ans= m;
                    e= m-1;
                }else{
                    ans = m;
                    s= m+1;
                }
            }else if(arr[m]> t){
                e= m-1;
            }else {
                s= m+1;
            }
        }
        return ans;
    }

}
