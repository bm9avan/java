package com.Q;

public class two_num {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6};
        int t=10;
        int[] ans = twoSum(arr,t);
        System.out.println(ans);
    }

        public static int[] twoSum(int[] nums, int target) {
            int[] ans = new int[0];
            for(int i=0; i<nums.length;i++){
                int a = nums[i];
                int b = target - a;
                for(int j=i; j<nums.length;j++){
                    if(b==nums[j]){
                        ans= new int[] {i, j};
                        return ans;
                    }
                }
            }

            return ans;
        }

}
