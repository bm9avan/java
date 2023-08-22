package com.strings;

public class StringImutable {
    public static void main(String[] args) {
        String a="old";
        System.out.printf("%s ", a);
        a="old update";
        System.out.println(a);
        System.out.println(a.hashCode());

        String s = new String("hi Mr. Buddy");
//        s = = "hi Mr. Buddy"; //is false
//        s.equals("hi Mr. Buddy"); //is true
        System.out.println( s.hashCode() );
        System.out.println( "hi Mr. Buddy".hashCode() );

        String b=fun(a);

        System.out.println(a);
        System.out.println(b);
        System.out.println(a==b);
        System.out.println(a.equals(b));
    }

    private static String fun(String a) {
        System.out.println(a.hashCode());
        a="new";
        return a;
    }
}
