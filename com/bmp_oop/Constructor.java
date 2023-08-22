package com.bmp_oop;

public class Constructor {
 
        int variable;
        String name;
        private Constructor(int variable, String name){
            this.variable=variable;
            this.name =name;
        }
//        constructor(constructor object){
//            this.variable=object.variable;
//            this.name=object.name;
//        }

        public static void main(String[] args){
            Constructor object2= new Constructor(10,"bmp");
//            constructor object2= new constructor(object1);
////            constructor object2= (object1);
//            System.out.println(object1+"   " +object2);
            System.out.println(object2.variable+object2.name);
        }
    


}

//class tryConstructorPrivate{
//    public static void main(String[] args) {
//        Constructor object2= new Constructor(10,"bmp");
//        System.out.println(object2.variable+object2.name);
//    }
//}
