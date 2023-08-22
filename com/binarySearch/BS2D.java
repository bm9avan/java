package com.binarySearch;

import java.util.Arrays;

public class BS2D {
    public static void main(String[] args) {
        int[][] arr= {{1,5,6},{2,7,9}};
        int[] ans= find(arr, 7);
        System.out.println(Arrays.toString(ans));
        arr = new int[][]{{1, 5, 6}, {7, 9, 10}};
        ans= find(arr, 7);
        int[] ans2= find2(arr, 7);
    }

    private static int[] find2(int[][] arr, int t) {
        int rs=0, re= arr.length-1, cs=0, ce= arr[0].length-1;
        int rm= (rs+re)/2, cm= (cs+ce)/2;
        while (rm < arr.length && cm > -1){
            if (arr[rm][cm] == t) {
                return new int[]{rm,cm};
            } else if (arr[rm][cm] > t) {
                re = rm - 1;
            }else {
                rs = rm + 1;
            }
            rm= (rs+re)/2; cm= (cs+ce)/2;
        }
        return new int[]{-1,-1};
    }

    private static int[] find(int[][] arr, int t) {
        int r=0,c=arr[0].length-1;
        if(t< arr[0][0] || t> arr[arr.length-1][arr[arr.length-1].length-1]){
            return new int[]{-1,-1};
        }
        while (r < arr.length && c > -1){
            if(arr[r][c]== t){
                return new int[]{r,c};
            } else if (arr[r][c]>t) {
                c--;
            } else {
                r++;
            }
        }
        return new int[]{-1,-1};
    }
}
