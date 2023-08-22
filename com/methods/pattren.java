package com.methods;

import java.util.Scanner;

public class pattren {
    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++) {
//            for (int j = 5-i; j >0; j--) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        p2(5);
        p2Up(5);
    }

    static void p1(int n){
        for (int i = 1; i <=2*n-1; i++) {
            int col =  i>n ? 2*n-i : i;
            for (int j = 1; j <= col; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    static void p2(int n){
        for(int i=1; i<=n; i++){
            int x=1;
//            int y=1;
//            System.out.println(x+"im aj");
            for(int j=1; j<=n; j++){
//                if(x+j-2*i>0){
//                    x--;
//                }
                System.out.print(x);
                if(i>j){
                    x++;
                }
            }
            for(int j=n-1; j>=1; j--){
                if(i>j){
                    x--;
                }
                System.out.print(x);
            }
            System.out.println();
        }
    }

    static void p2Up(int n){
        for(int i=1; i<=2*n-1; i++){
            for(int j=1; j<= 2*n-1; j++){
                int x=Math.min(i,j);
                System.out.print(x);
            }
            System.out.println();
        }
    }

}
