package com.strings;

public class CharAt0 {
    public static void main(String[] args) {
        String a="2";
        System.out.println(a.charAt(0));
        System.out.println(a.substring(0));
        System.out.println(a.substring(1).length());
        char ch=(char)(97+1);
        int val = (int)a.charAt(0)-'0';
        int s= (val-2)*3;
        System.out.println(s+ch);
        System.out.println(val +" "+ s);
    }
}