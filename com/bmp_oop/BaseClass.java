package com.bmp_oop;

public class BaseClass {
    int test=100;
    int a,b,c;
    BaseClass(){
        System.out.println("in base no inisializtion");
        a=500;
    }
    BaseClass(BaseClass oldObject){
        System.out.println("in super");
        this.a = oldObject.a;
        this.b = oldObject.b;
        this.c = oldObject.c;
    }

    public BaseClass(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //remove static on all fun and run
    static void fun(){
        System.out.println("in base fun method");
    }

//    @Override
//    public String toString() {
//        return "BaseClass{" +
//                "a=" + a +
//                ", b=" + b +
//                ", c=" + c +
//                '}';
//    }
}

class ChildClass extends BaseClass{
    int test=200;
    int d;
    ChildClass(){
        super(20,20,20);
        System.out.println("in child default");
    }
    ChildClass(int a, int b, int c, int d){
        super(a,b,c);
        this.d = d;
    }
    ChildClass(ChildClass oldObject){
        super(oldObject);
        System.out.println("in child");
        this.d = oldObject.d;
    }

//    static void fun(){
//        System.out.println("in child fun method");
//    }

//    @Override
//    public String toString() {
//        return "ChildClass{" +
//                "d=" + d +
//                ", a=" + a +
//                ", b=" + b +
//                ", c=" + c +
//                '}';
//    }
}

final class Main extends ChildClass{
    int a,w=999;
    int test=500;
//    @Override
    static void fun() {
        System.out.println("in main fun method");
    }

    public static void main(String[] args) {
        System.out.println(1);
        Main a= new Main();
        System.out.println(a.test);
//        System.out.println(a.a);
        System.out.println(2);
        BaseClass var = new Main();
//        var.fun();
        System.out.println(var.test);
        System.out.println(((Main)var).w);
        System.out.println(3);
        ChildClass obj=new ChildClass(1,2,3,4);
        System.out.println(obj.test);
//        obj.fun();
        System.out.println(4);
        BaseClass newobj = new ChildClass(obj);
//        System.out.println(newobj);
//        newobj.fun();
        System.out.println(newobj.test);
    }
}
