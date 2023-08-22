package com.recurtion.level2;

public class Maze {
    static boolean[][] oop;
    static int rg=3;
    static int cg=3;
    public static void main(String[] args) {
//        printPath("",3,3);
        oop = new boolean[rg][cg]; // opstarcle matrix
        oop[1][1]= true;
        printPathOOP("",0,0);
    }

    private static void printPathOOP(String p, int i, int j) {
        if(i==rg-1 && j==cg-1){
            System.out.println(p);
            return;
        }
        if(i<rg-1){
            if(oop[i][j]){
                System.out.println("----- "+ p +"  discared");
               return;
            }
            printPathOOP(p+"d", i+1, j);
        }

        if(j<cg-1){
            if(oop[i][j]){
                System.out.println("----- "+p +"  discared");
                return;
            }
            printPathOOP(p+"r", i, j+1);
        }
    }

    private static void printPathOOP0(String p, int r, int c) {
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            if(oop[r-2][c-1]){
                return;
            }
//            System.out.println((r-2)+" "+(c-1));
//            System.out.println("simple1");
//            System.out.println("hi "+oop[r-2][c-1]);
            printPathOOP(p+"d", r-1, c);
        }
        if(c>1){
            if(oop[r-1][c-2]){
                return;
            }
//            System.out.println((r-1)+" "+(c-2));
//            System.out.println("simple2");
//            System.out.println("hi "+oop[r-1][c-2]);
            printPathOOP(p+"r", r, c-1);
        }
    }

    private static void printPath(String p, int r, int c) {
//        if(r==1){
//            System.out.println(p+"r");
//            return;
//        }
//        if(c==1){
//            System.out.println(p+"d");
//            return;
//        }
        if(r==1 && c==1){
            System.out.println(p);
            System.out.println();
            return;
        }
        if(r>1){
            System.out.println(r+" "+c);
//            System.out.println("simple");
            printPath(p+"d", r-1, c);
        }
        if(c>1){
            System.out.println(r+" "+c);
//            System.out.println("simple");
            printPath(p+"r", r, c-1);
        }
//        (r>1) & printPath(p+"d", r-1, c);
    }


}
