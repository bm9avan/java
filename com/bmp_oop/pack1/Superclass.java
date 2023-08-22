package com.bmp_oop.pack1;

public class Superclass {
    private void privateMethod() {
        System.out.println("Private method in Superclass");
    }

    public void publicMethod() {
        System.out.println("Public method in Superclass");
        privateMethod();
    }
}

