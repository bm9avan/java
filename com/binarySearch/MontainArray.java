package com.binarySearch;

public class MontainArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,3,1};
        System.out.println(montain(arr));
    }

    private static int montain(int[] arr) {
        int s=0, e= arr.length-1;
        int m=-1;
        while(s<e){
            m = (s+e)/2;
//            if ( m+1 != arr.length && arr[m] > arr[m+1]) {
//            m+1 != arr.length checking this is not required as m = arr.length-1 will happen only if s=e, in while loop only this s=e will fail, if we have included s<=e then this is required
            if (arr[m] > arr[m+1]) {
                e= m;
            }else if(arr[m]< arr[m+1]){
                s= m+1;
            }
        }
        return s; //shouldn't return mid(m) as it will be storing old mid-value
    }
}
