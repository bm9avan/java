package com.bmp_oop;

public class Polymofisam {
    public static void main(String[] args) {
        Base obj = new Child();
//        System.out.println(obj.fun());    //'void' type not allowed here
    }
}


class Base {
    void fun(){
        System.out.println("in base fun method");
//        return "FUN Base";
    }

}
//java: fun() in com.bmp_oop.Child cannot override fun() in com.bmp_oop.Base return type int is not compatible with java.lang.String
class Child extends Base{
    void fun(){
        System.out.println("in child fun method");
//        return 10;
    }
}