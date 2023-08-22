package com.bmp_oop;

public class Access_control {
    public static void main(String[] args) {
        S objS = new S(10);
        D objD = new D(20);

        objS.accessProtectedMember(objS); // Allowed, objS is of type S
        objS.accessProtectedMember(objD); // Compilation error, objD is not of type S
    }
}

class C {
    protected int member;

    public C(int value) {
        member = value;
    }
}

class S extends C {
    public S(int value) {
        super(value);
    }

    public void accessProtectedMember(S obj) {
        int value = obj.member; // Allowed because obj is of type S
        System.out.println("Accessed protected member from S: " + value);
    }
}

class D extends S {
    public D(int value) {
        super(value);
    }
}

