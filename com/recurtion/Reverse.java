package com.recurtion;

public class Reverse {

    public static void main(String[] args) {
        System.out.println(rev(54321, 5));
    }

    static int rev(int i, int iLength) {
        if(i%10==i){
            return i;
        }
        return (i%10)*(int)Math.pow(10,iLength-1) + rev(i/10,iLength-1);
    }
}

class CheatReverse {
    static int ans=0;

    public static void main(String[] args) {
        rev1(54321);
        System.out.println(ans);
    }

    static void rev1(int i) {
        if(i==0){
            return;
        }
        ans = ans*10 + (i%10) ;
        System.out.println(ans);
        rev1(i/10);
    }
}

class Reverse2notWorked {
    public static void main(String[] args) {
        int ans=rev2(54321);
        System.out.println(ans);
    }

    static int rev2(int i) {
        System.out.println(i);
        if(i==0){
            return 0;
        }
        return rev2(i/10)*10 + i%10;
    }
}

