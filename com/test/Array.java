package com.test;

public class Array {
    public static void main(String[] args) {
//        String name = "bmp";
//        char tar = 'B';
//        int ans = find(name,tar);
//        System.out.print(ans);
        int ele =10;
        System.out.println(ele);
//        System.out.println(ele.length);
//        String rep = Integer.toString(ele);
//        System.out.println(ele);
//        System.out.println(rep);
        System.out.println("just "+Integer.toString(ele).length());
//        System.out.println(ele);


    }
    static int find(String name, char tar){
        for (int i = 0; i < name.length(); i++) {
            if(name.charAt(i)==tar){
                return i;
            }
        }
        return -1;
    }
}