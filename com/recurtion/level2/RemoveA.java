package com.recurtion.level2;

public class RemoveA {
    public static void main(String[] args) {
        String s ="funaaalmanewa";
//        System.out.println(s.substring(0)+" "+ s.substring(1));
        String ans=remove(s);
        System.out.println(s+"  ans: "+ ans);
    }

    private static String remove(String s) {
        if(s.length() == 0){
            return "";
        }
        if(s.charAt(0) != 'a'){
            return s.charAt(0)+remove(s.substring(1));
        }
        return remove(s.substring(1));  
    }
}
