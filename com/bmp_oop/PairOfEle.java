package com.bmp_oop;

import java.util.Arrays;

public class PairOfEle {
    static class ele{
        int a,b;
        ele(int a, int b){
            this.a= a;
            this.b = b;
        }

        @Override
        public String toString() {
            return "(" +  a + ", " + b + ')';
        }
    }

    public static void main(String[] args) {
        ele[] arrOfEle = new ele[4];
        for (int i = 0; i < arrOfEle.length; i++) {
            arrOfEle[i] = new ele(i,i*2);
        }
        System.out.println(Arrays.toString(arrOfEle));
    }
}
