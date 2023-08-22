package com.Q;

public class Q852 {
    public static void main(String[] args) {
        int[] arr={3,5,3,2,0};
        int s=0;
        int e=arr.length-1;
        int m;

        while (e>s){
            m= (s+e)/2;
//            if(m==0){
//                m=1;
//            } else if (m== arr.length-1) {
//                m=arr.length-2;
//            }
//            if(arr[m]>arr[m-1] && arr[m]>arr[m+1]){
//                System.out.println(arr[m]+ " is gratest ele at "+m);
//                break;
//            } else if(arr[m-1]>arr[m]){
//                e=m-1;
//            }else {
//                s=m+1;
//            }

                if(arr[m]>arr[m+1]){
                    e=m;
                }else if(arr[m]<arr[m+1]){
                    s=m+1;
                }
            }
            System.out.println(s +" is index and val is "+ arr[s]);
        }
    }

