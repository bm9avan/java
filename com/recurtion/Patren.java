package com.recurtion;

public class Patren {
    public static void main(String[] args) {
        fun(5,"*");
    }
    static void fun(int n , String symbol){
        if(n<0){
            return;
        }
        symbol += symbol;
        int total=1;
        // 5 is hard coded just because of n is given as 5 in main method, not "n" as "n" will be redusing by -1
        for (int j = 1; j <= 5; j++) {
            total *=2;
        }
        for (int i = 0; i <total - symbol.length()/2; i++) {
            System.out.print(" ");
        }
        System.out.println(symbol);
        fun(n-1,symbol);
        for (int i = 0; i <total - symbol.length()/2; i++) {
            System.out.print(" ");
        }
        System.out.println(symbol);
    }
}
