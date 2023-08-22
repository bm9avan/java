package com.Q;

public class Q1095 {
    public static void main(String[] args) {
        int ans= findInMountainArray(1,new int[]{0,5,3,1});
        System.out.println(ans);
    }

    public static int findInMountainArray(int target, int[] mountainArr) {
        int s=0, e=mountainArr.length-1,m=-1;
        while(e>s){
            m= s+ (e-s)/2;
            if(mountainArr[m]>mountainArr[m+1]){
                e=m;
            }else{
                s=m+1;
            }
        }
        System.out.println("s:"+s+" e:"+e);
        int ans= bs(target, mountainArr, 0, e, true);
        return ans!=-1? ans : bs(target, mountainArr, s+1, mountainArr.length-1, false);
    }

    public static int bs(int t, int[] mountainArr, int s, int e, boolean fRr){
        int m=-1;
        while(e>=s){
            m= s+ (e-s)/2;
            if(mountainArr[m]==t){
                return m;
            }else if(fRr){
                if(mountainArr[m]>t){
                    e=m-1;
                }else{
                    s=m+1;
                }
            } else if (!fRr) {
                if(mountainArr[m]>t){
                    s=m+1;
                }else{
                    e=m-1;
                }
            }

        }
        return -1;
    }
}
