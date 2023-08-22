package com.test;

public class ForLoop {
    public static void main(String[] args) {
        System.out.print("I ");
        for (int i = 1; i < 4; i++) {
        System.out.print(i);
        }
        System.out.println();
        System.out.print("II ");
        for (int i = 1; i < 4; ++i) {
            System.out.print(i);
        }
        System.out.println();
        System.out.print("III ");
        for (int i = 1; i < 4; i=i+1) {
            System.out.print(i);
        }
        System.out.println();
        System.out.print("IV ");
        for (int i = 1; i < 4; i=i*2) {
            System.out.print(i);
        }
    }
}
