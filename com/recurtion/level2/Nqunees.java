package com.recurtion.level2;

import java.util.Arrays;
import java.util.Scanner;

public class Nqunees {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enete n");
        int n= in.nextInt();
        System.out.println(printNQ(new int[n][n], 0));
    }

    private static int printNQ(int[][] b, int r) {
        if(r==b.length){
            for (int[] arr: b) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println();
            return 1;
        }
        int count=0;
        for (int c = 0; c <b[0].length; c++) {
            if(safe(b,r,c)){
                b[r][c]=1;
                count += printNQ(b, r+1);
                b[r][c]=0;
            }
        }
        return count;
    }

    private static boolean safe(int[][] b, int r, int c) {
        for (int i = 0; i < r; i++) {
            if(b[i][c]!=0){
                return false;
            }
        }
        int n= Math.min(r,c);
        for (int i = 1; i <= n; i++) {
            if(b[r-i][c-i]!=0){
                return false;
            }
        }
        n= Math.min(r,b.length-c-1);
        for (int i = 0; i <= n; i++) {
            if(b[r-i][c+i]!=0){
                return false;
            }
        }
        return true;
    }
}
