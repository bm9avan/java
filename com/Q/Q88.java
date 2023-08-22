package com.Q;

import java.util.Arrays;

public class Q88 {
    public static void main(String[] args) {
        int[] nums1={0,0,0};
        int[] nums2={1,2,6};
        merge(nums1,0,nums2,3);
        System.out.println(Arrays.toString(nums1));
    }

/*
        public void mergezz(int[] nums1, int m, int[] nums2, int n) {
            for(int i=m;i<n;i++){
                nums1[i]=nums2[i-m];
            }
            selection_sort1(nums1);
        }
        public void selection_sort1(int[] nums1){
            int j=-1;
            for(int i=0;i<nums1.length-1;i++){
                int minpos=i;
                for(j=i;j<nums1.length;j++){
                    if(nums1[minpos]>nums1[j]){
                        minpos=j;
                    }
                }
                if(j!=i){
                    nums1[i]=nums1[j];
                }
            }
        }
*/

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int j=1;
        for(int i=1;i<=n;i++){
            j=check(nums1,m,nums2,n,i,j);
        }
    }
    public static int check(int[] nums1, int m, int[] nums2, int n,int i, int j){
        if(m==0){
            for (int k = 0; k < n; k++) {
                nums1[k]=nums2[k];
            }
        }
        else{
            if(nums2[n-i]>=nums1[m-j]){
                nums1[m+n-i-j+1]=nums2[n-i];
            }
            else if(nums2[n-i]<nums1[m-j]){
                nums1[m+n-i-j+1]=nums1[m-j];
                if(j==m){
                    nums1[m+n-i-j]=nums2[n-i];
                }else {
                    j=check(nums1,m,nums2,n,i,j+1);
                }
            }
        }

        return j;
    }


}
