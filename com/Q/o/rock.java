package com.Q.o;

//import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class rock {
    public static void main(String[] args) {
        int[] arr={45,66,15,95};
        System.out.println(fun(arr));
    }
    static String fun(int[] arr){
        int[] a=new int[10];
        int j=0;
        for (int i = 0; i < arr.length; i++)
        {
            while(arr[i]!=0){
                a[j]=arr[i]%10;
                arr[i]=arr[i]/10;
                j++;
            }
        }
        sort(a);
//        System.out.println(Arrays.toString(a));
        int ans=0;
        for (int k = a.length-1; k >=0; k--) {
            if(a[k]!=0) {
                ans += a[k];
                ans *= 10;
            }
        }
        String out = Integer.toString(ans/10);
        return out;
    }

    static void sort(int [] a){

        int loc=-1;
        for(int i=0;i< a.length-1;i++){
            int min = Integer.MAX_VALUE;
            for (int j=i;j< a.length;j++) {
                if(min>a[j]){
                    min = a[j];
                    loc =j;
                }
            }
            a[loc]=a[i];
            a[i]=min;
        }
    }


}
