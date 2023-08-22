package com.recurtion.level2;

import java.util.ArrayList;

public class Dies {
    public static void main(String[] args) {
//        printPosiiblity("",9);
        System.out.println(storePosiiblity("",8, new ArrayList<>()));
    }

    private static void printPosiiblity(String p ,int u) {
        if(u==0){
            System.out.println(p);
            return;
        }
        int m= u>6 ? 6 : u;
        for (Integer i = 1; i <= m ; i++) {
            printPosiiblity(p + i.toString(), u-i);
        }
    }

    private static ArrayList storePosiiblity(String p , int u, ArrayList list) {
        if(u==0){
//            System.out.println(p);
            list.add(p);
            return list;
        }
        int m= u>6 ? 6 : u;
        for (Integer i = 1; i <= m ; i++) {
            storePosiiblity(p + i.toString(), u-i, list);
        }
        return list;
    }
}
