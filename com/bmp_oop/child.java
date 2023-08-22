package com.bmp_oop;

import com.sun.source.tree.InstanceOfTree;

public class child extends base {
    double c;
    child(){
        super(2,3);
    }

    void test(){
        System.out.println("im in child");
    }

    static void noover(){
        System.out.println("im in child");
    }
}
