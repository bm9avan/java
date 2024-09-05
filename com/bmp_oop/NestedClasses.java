package com.bmp_oop;

public class NestedClasses {
    int x;
    NestedClasses(){
        x=10;
    }
   class a1{
        String name;
        a1(){
            this.name ="bmp"+x;
        }
    }
   static class a2{
        String name;
        a2(){
            this.name ="mggp";
        }
   }

   public static void main(String[] args) {

        NestedClasses obj= new NestedClasses();
//       a1 ob = new a1();
        NestedClasses.a1 obj1= obj.new a1();
//        NestedClasses.a1 obj2= NestedClasses.new a1();
//       NestedClasses.a2 obj3= NestedClasses.new a2();
       System.out.println(obj);
       System.out.println(obj1);
       System.out.println(obj1.name);
   }
}
