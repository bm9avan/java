package com.bmp_oop;

import java.util.Arrays;

public class oop1 {
    int n;
    static class Sample{
        int i;
//        Sample(int i){
//            this.i=500;
//        }
    }


    public static void main(String[] args) {
//        float num = 555;
//        System.out.println(num);
//        oop1 ss = new oop1();
//        Sample sam = new Sample();
//        System.out.println(sam.toString());

//        child aa= new child();
//        System.out.println(aa);
//        base bb =  new base(5,6);
//                System.out.println(bb.b);

        base obj = new child();
//        obj.test();

//        System.out.println(obj.b);
//        child.noover();
//        obj.noover();

        child oobj=new child();
        oobj.noover();

        System.out.println(Arrays.toString(obj.getClass().getConstructors()));
    }


}
