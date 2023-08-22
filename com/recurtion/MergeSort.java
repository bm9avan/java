package com.recurtion;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr={5,6,8,3,1,7,6};
        sort(arr, 0, arr.length-1);
    }

    private static void sort(int[] arr, int s, int e) {
        if(s==e){
            return;
        }
        int m=s+(e-s)/2;
//        in Place sorting
        sort(arr, s, m);
        sort(arr, m+1, e);
        merge(arr,s,m,e);
    }

    private static void merge(int[] arr, int s, int m, int e) {
        int i=s, j= m+1,k=0;
        int[] merge= new int[s-e+1];
        while(i<=m && j<=e){
            if(arr[i] > arr[j]){
                merge[k]=arr[j];
                j++;
            }else {
                merge[k]=arr[i];
                i++;
            }
            k++;
        }
        while(i<=m){
            merge[k]=arr[i];
            i++;
            k++;
        }
        while(j<=e){
            merge[k]=arr[j];
            j++;
            k++;
        }
        for(int x=0; x<merge.length; x++){
            arr[s+x]= merge[x];
        }
    }
}
