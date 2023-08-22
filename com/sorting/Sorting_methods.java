package com.sorting;

import java.util.Arrays;

public class Sorting_methods {
    public static void main(String[] args) {
        int[] arr={8,7,3,5,3,6,1,4};
        System.out.println("array before sorting: "+ Arrays.toString(arr));
//        bobble(arr);
//        selection(arr);
        System.out.println(Arrays.toString(cyclic(arr)));
//        insertion(arr);x
    }

    static void bobble(int[] arr){//O(n^2)worst case; O(n)best case; Stable sorting
        System.out.println("Bobble Sort");
        boolean termination=false;//to stop the multiple checks if sorted arr is entered
        for (int i = 0; i < arr.length-1 && !termination; i++) { // think !termination as continue
            System.out.println(i);
            termination=true;
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    //swap(arr[j],arr[j+1]);
//                    arr[j]=arr[j]+arr[j+1];
//                    arr[j+1]=arr[j]-arr[j+1];
//                    arr[j]=arr[j]-arr[j+1];
                    swap(arr,j,j+1);
                    termination=false;
                }
            }
//            if(termination){ //!false=true
//                break;
//            }
        }
        System.out.println("array after sorting: "+ Arrays.toString(arr));
    }
    
    static void selection(int[] arr){ //O(n^2) both best and worst case; Unstable sorting
        System.out.println("Selection sort");
        int max;
        for (int i = 0; i < arr.length-1; i++) {
            max=0;
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j]>arr[max]){
                    max=j;
                }
            }
            if(max!=arr.length-i-1) {
                swap(arr, max, arr.length - i - 1);
            }
        }
        System.out.println("array after sorting: "+ Arrays.toString(arr));
    }

    static void insertion(int[] arr){//O(n);O(n^2); Stable sorting
        System.out.println("Insertion sort");
        // partial sorting arrays use this
        for (int i = 1; i < arr.length; i++) {
//            if(arr[i]<arr[i-1]){
                for (int j = i; j > 0; j--) {
                    if (arr[j]<arr[j-1]) {
                        swap(arr,j,j-1);
                    }else{
//                        System.out.println("else");
                        break;
                    }
                }
//            }
        }
        System.out.println("array after sorting: "+ Arrays.toString(arr));
    }

//    static void cyclic(int[] arr){//O(n) #IMP
    static int[] cyclic(int[] arr){//O(n) #IMP
        System.out.println("Cyclic sort");
        // if array given in a range of 1 to n and size is n-1
        int i=0;
        int ansArr=-1,ansVal=-1;
        while(i<arr.length){
            if((arr[i])!=arr[arr[i]-1]){
                swap(arr,i,arr[i]-1);
            }else {
//                i++;
                if(arr[i] != i+1){
                    ansArr=arr[i];
                    ansVal=i+1;
                    break;
                }else{
                    i++;
                }
            }
        }

/*
    // my approach, i think time complexity is same for both methods
        for(int i=0; i< arr.length-1; i++){
            while(arr[i]-1 != i){
                swap(arr,i, arr[i]-1);
            }
        }
*/
        System.out.println("array after sorting: "+ Arrays.toString(arr));
        int[] ans ={ansArr,ansVal};
        return ans;
    }

    static void mySort(int[] arr){
        System.out.println("My sort using binary");
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<arr[i-1]){
                int addPlace=binarySort(arr,i);
                int temp= arr[i];
                for (int j = i; j > addPlace; j--) {
                    arr[j]=arr[j-1];
                }
                arr[addPlace]=temp;
            }
        }
        System.out.println("array after sorting: "+ Arrays.toString(arr));
    }
    private static int binarySort(int[] arr, int i) {
        int start=0;
        int end=i-1;
        int mid;
        while (start<=end){
            mid=start+(end-start)/2;
            if (arr[mid]==arr[i]){
                return mid;
            }
            if(arr[mid]>arr[i]){
                end=mid-1;
            }else {
                start=mid+1;
            }
        }
        return start;
    }

    private static void swap(int[] arr,int i,int j) {
//        i=i+i1;
//        i1=i-i1;
//        i=i-i1;
        arr[i]=arr[i]+arr[j];
        arr[j]=arr[i]-arr[j];
        arr[i]=arr[i]-arr[j];
    }
}
