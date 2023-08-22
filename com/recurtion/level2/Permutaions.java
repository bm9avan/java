package com.recurtion.level2;

public class Permutaions {
    public static void main(String[] args) {
        String val = "abc";
        printPermutaion("",val);
    }

    private static void printPermutaion(String ans,String val) {
        if(val.length() == 0 ){
            System.out.println(ans);
            return;
        }
        String ch= (val.charAt(0)+"");
        for (int i = 0; i <= ans.length(); i++) {
//            System.out.println(sub);
            printPermutaion(ans.substring(0,i) +ch+ ans.substring(i,ans.length()) , val.substring(1));
//            for (int j = 0; j < sub.length() +1 ; j++) {
//
//            }
        }
    }
}
