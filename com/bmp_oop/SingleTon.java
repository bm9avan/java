package com.bmp_oop;

public class SingleTon {
    private SingleTon(){
        System.out.println("object created");
    }
    static SingleTon object=null;
    static SingleTon create(){
        if(object==null){
            object= new SingleTon();
        }
        return object;
    }

    public static void main(String[] args) {
        SingleTon obj1=SingleTon.create();
        System.out.println(obj1);
        SingleTon obj2=SingleTon.create();
        System.out.println(obj2);
        SingleTon obj3=SingleTon.create();
        System.out.println(obj3);
    }
}
