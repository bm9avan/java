package com.bmp_oop.pack2;

import com.bmp_oop.pack1.ProtectedBase;

public class ChildProtedcted extends ProtectedBase {
    void print(){
        fun();
    }

    @Override
    public String toString() {
        return "ChildProtedcted brroooo{" +
                "a=" + a +
                '}';
    }

    public static void main(String[] args) {
        ProtectedBase obj1=new ChildProtedcted();
        System.out.println("in child"+ obj1);

        ChildProtedcted o1= new ChildProtedcted();
        System.out.println("1  : "+o1.a);
        o1.print();
    }
}

class Subclass extends ChildProtedcted{
    public static void main(String[] args) {
       Subclass o2= new Subclass();
        System.out.println("2  : "+o2.a);
        ChildProtedcted o3= new Subclass();
        System.out.println("3  : "+o3.toString());
        ChildProtedcted o4= new ChildProtedcted();
        System.out.println("4  : "+(o4).toString());

    }
}
