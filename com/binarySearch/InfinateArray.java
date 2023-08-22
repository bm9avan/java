package com.binarySearch;

public class InfinateArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,6,18,19,23,45,55,66,87};
        int t=55;
        int s=0, e=1,m;

        while(arr[e]<t){
            int temp = s;
            s =e+1;
            int x =s+1+ (e-temp)*2;
            e= x> arr.length -1 ? arr.length -1 : x;
        }

        while (e>=s){
            m= (s+e)/2;
            if(arr[m]==t){
                System.out.println(t+" is at "+m);
                break;
            } else if(arr[m]>t){
                e=m-1;
            }else {
                s=m+1;
            }
        }
    }
    }
