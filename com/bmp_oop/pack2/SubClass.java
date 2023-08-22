package com.bmp_oop.pack2;

import com.bmp_oop.pack1.Superclass;

public class SubClass extends Superclass {
    // This method does not override privateMethod in Superclass
    // It is a new method in Subclass with the same name
    private void privateMethod() {
        System.out.println("Private method in Subclass");
    }
}

class Main {
    public static void main(String[] args) {
//        Superclass obj = new Subclass();
//        obj.publicMethod(); // Calls the publicMethod in Superclass
    }
}
