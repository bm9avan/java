package com.recurtion.level2;

import java.util.Arrays;

public class MazeAllPaths {

    static int rg=3;
    static int cg=3;
    public static void main(String[] args) {
        int[][] path= {
            {0,0,0},
            {0,0,0},
            {0,0,0}};
        System.out.println(pathWithBacktrack("",0,path, 0,0 ));
    }

    private static int pathWithBacktrack(String p, int count, int[][] path, int r, int c) {
        if(r==rg-1 && c==cg-1){
            path[r][c]=count+1;
            for (int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return 1;
        }

        int co=0;

        if(path[r][c] !=0){
            System.out.println("break");
//            return co; //not required
            return 0;
        }
        path[r][c]=count+1;
//        System.out.print(path[r][c]);
        if(r<rg-1){
            co+=pathWithBacktrack(p+"D", path[r][c], path, r+1, c);
        }

        if(c<cg-1){
            co+=pathWithBacktrack(p+"R", path[r][c], path, r, c+1);
        }

        if(r>0){
            co+=pathWithBacktrack(p+"U", path[r][c], path, r-1, c);
        }

        if(c>0){
            co+=pathWithBacktrack(p+"L", path[r][c], path, r, c-1);
        }
        path[r][c]=0;
        return co;
    }

    private static void pathWithBacktrackNotWoking(String p, int count, int[][] path, int r, int c) {
        if(path[r][c] !=0){
//            System.out.println("break");
            return;
        }
        path[r][c]=count+1;
//        System.out.print(path[r][c]);
        if(r==rg-1 && c==cg-1){
            for (int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if(r<rg-1){
            pathWithBacktrackNotWoking(p+"D", path[r][c], path, r+1, c);
            path[r][c]=0;
        }

        if(c<cg-1){
            pathWithBacktrackNotWoking(p+"R", path[r][c], path, r, c+1);
            path[r][c]=0;
        }

        if(r>0){
            pathWithBacktrackNotWoking(p+"U", path[r][c], path, r-1, c);
            path[r][c]=0;
        }

        if(c>0){
            pathWithBacktrackNotWoking(p+"D", path[r][c], path, r, c-1);
            path[r][c]=0;
        }
        path[r][c]=0;
    }
}
