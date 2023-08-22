package com.recurtion.level2;

import java.util.Arrays;

public class Sudoku {
    public static void main(String[] args) {
        String[][] in= {{"5","3",".",".","7",".",".",".","."}
                        ,{"6", ".", ".", "1", "9", "5", ".", ".", "."}
                        ,{".", "9", "8", ".", ".", ".", ".", "6", "."}
                        ,{"8", ".", ".", ".", "6", ".", ".", ".", "3"}
                        , {"4", ".", ".", "8", ".", "3", ".", ".", "1"}
                        ,{"7", ".", ".", ".", "2", ".", ".", ".", "6"}
                        , {".", "6", ".", ".", ".", ".", "2", "8", "."}
                        ,{".", ".", ".", "4", "1", "9", ".", ".", "5"}
                        , {".", ".", ".", ".", "8", ".", ".", "7", "9"}};
        solve(0,0,in);
    }

    private static void solve(int i, int j, String[][] in) {
//        for (int k = 0; k < in.length; k++) {
//            for (int l = 0; l < in.length; l++) {

        if(i==8 && j==8){
            for (String[] arr: in) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println();
            return;
        }

        if(j==9){
            solve(i+1, 0, in);
            return;
        }

                if ( ".".equals(in[i][j])) {
                    for (Integer m = 1; m <=9; m++) {
                        if(isSafes(i,j,m,in)){
                            in[i][j]=m.toString();
                            solve(i,j+1,in);
                            in[i][j]=".";
                        }
                    }
                }else {
                    solve(i,j+1,in);
                }
//            }
//        }
    }

    private static boolean isSafeS(Integer m, int i, int j, String[][] in) {
        int r= i-i%3;
        int c= j-j%3;
        int x=0;
        for (int k = r; k < r+3; k++) {
            for (int l = c; l < c+3; l++) {
                if(m.toString().equals(in[k][l]) || m.toString().equals(in[r][x]) || m.toString().equals(in[x][c])){
                    return false;
                }
            }
        }
        return true;
    }

    static boolean isSafes( int row, int col, Integer num, String[][] board) {
        // check the row
        for (int i = 0; i < board.length; i++) {
            // check if the number is in the row
            if (num.toString().equals(board[row][i])) {
                return false;
            }
        }

        // check the col
        for (String[] nums : board) {
            // check if the number is in the col
            if (num.toString().equals(nums[col])) {
                return false;
            }
        }

        int sqrt = (int)(Math.sqrt(board.length));
        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;

        for (int r = rowStart; r < rowStart + sqrt; r++) {
            for (int c = colStart; c < colStart + sqrt; c++) {
                if (num.toString().equals(board[r][c])) {
                    return false;
                }
            }
        }
        return true;
    }
    private static void solve0(int i, int j, int[][] in) {
//        for (int i = 0; i < 9; i++) {
//            for (int j = 0; j < 9; j++) {
//                if(in[i][j] == 0){
//                    fillN(i,j,in);
//                }
//            }
//        }

//        if(i>8 || j>8){
//            i<8 ? solve(i+1, j, in): (j<8 ? solve(i, j+1, in): );
//        }
        if(i==8 && j==8) return;

    }

    private static void fillN(int i, int j, int[][] in) {
        boolean[] remaining = new boolean[9];
    }
}
