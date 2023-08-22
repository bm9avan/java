package com.Q;

public class Q540 {
    public static void main(String[] args) {
        int[] arr={3,3,7,7,10,11,11};
        System.out.println(singleNonDuplicate(arr));
    }
        public static int singleNonDuplicate(int[] nums) {
            int s=0;
            int e=nums.length-1;
            int m ;
            while(s<e){
                m= (s+e)/2;
//                if((m+2==nums.length&& m%2==0) || (m%2!=0 &&m-2==-1)) return s;
//                if((m+2==nums.length&& m%2!=0) || (m%2==0 &&m-2==-1))return e;
                if(e-s==2){
                    System.out.println("e:"+nums[e]+"s:"+nums[s]);
                }
                if((nums[m]==nums[m-1] && m%2==0) || (m%2!=0 && nums[m]==nums[m+1])){
                    e=m-2;
                }else if((nums[m]==nums[m-1] && m%2!=0) || (m%2==0 && nums[m]==nums[m+1])){
                    s=m+2;
                }else{
                    return m;
                }
            }
            return -1;
        }
}
