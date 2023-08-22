package com.recurtion.level2;

import java.util.Arrays;

public class Nhourse {
    public static void main(String[] args) {
        int n=3;
        boolean[][] board = new boolean[n][n];
        int c = print(board, 0, 0, n);
        System.out.println(c);
    }

    private static int print(boolean[][] board, int i, int j, int n) {
        if(n==0){
            for (int k = 0; k < board.length; k++) {
                System.out.println(Arrays.toString(board[k]));
            }
            System.out.println();
            return 1;
        }

        if(j == board.length){
            return print(board, i+1, 0, n);
        }

        if(i==board.length){
            return 0;
        }

        int count = 0 ;
        if(isSafe(board, i, j, n)){
            board[i][j]= true;
            count+=print(board,i, j+1,n-1);
            board[i][j]=false;
        }
        count += print(board,i, j+1,n);
        return count;
    }

    private static boolean isSafe(boolean[][] board, int i, int j, int n) {
        if(i>=2 && j>=1 && board[i-2][j-1]){
            return false;
        }
        if(i>=2 && j<n-1 && board[i-2][j+1]){
            return false;
        }
        if(i>=1 && j>=2 && board[i-1][j-2]){
            return false;
        }
        if(i>=1 && j<n-2 && board[i-1][j+2]){
            return false;
        }
        return true;
    }
}
