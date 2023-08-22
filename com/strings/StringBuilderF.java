package com.strings;

import java.util.Arrays;

public class StringBuilderF {
    public static void main(String[] args) {
        StringBuilder s= new StringBuilder();
        char a='a';
        for(int i=0; i<26; i++){
            s.append((char)(a+i));
        }

        System.out.println(s);
        System.out.println(s.toString());
        System.out.println(Arrays.toString(s.toString().toCharArray()));

        String s1= "";
        char a1='a';
        for(int i=0; i<26; i++){
            s1+=(char)(a1+i);
        }

        System.out.println(s1);
    }
}
