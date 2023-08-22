package com.binarySearch;
//public class com.binarySearch.CealingBine {
//    public static void main(String[] args) {
//        int[] arr={5,6,7,9,22,54,66,89,99};
//        int target = 9;
//        int ans = bs(arr,target);
//        System.out.println(ans);
//
//    }
//
//    private static int bs(int[] arr, int target) {
//        int start=0;
//        int end=arr.length-1;
//        int mid=-1;
//        if(target > arr[end]){
//                return -1;
//         }
//        while(start<=end){
//            mid = start+(end-start)/2;
//            if(target==arr[mid]){
//                return mid;
//            } else if (target>arr[mid]) {
//                start = mid+1;
//            }
//            else {
//                end = mid -1;
//            }
//        }
//        return start;
//    }
//}

public class CealingBine {
    public static void main(String[] args) {
        char[] arr={'e','e','e','e','e','e','n','n','n','n'};
        char target = 'e';
        char ans = bs(arr,target);
        System.out.println(ans);
    }

    private static char bs(char[] arr, char target) {
        int start=0;
        int end=arr.length-1;
        int mid=-1;
        if(target>=arr[end]){
            return arr[0];
        }
        while(start<=end){
            mid = start+(end-start)/2;
            if(target==arr[mid]){
                return arr[mid+1];
            } else if (target>arr[mid]) {
                start = mid+1;
            }
            else {
                end = mid -1;
            }
        }
        return arr[start];
    }
}
