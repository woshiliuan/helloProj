package com.liu.test;

class A {
}

class B extends A {
}
public class HelloWorld {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        A ba = new B();
        System.out.println("2-------------");
        System.out.println(a.getClass().isAssignableFrom(A.class));
        System.out.println(b.getClass().isAssignableFrom(B.class));
        System.out.println(a.getClass().isAssignableFrom(B.class));
        System.out.println(b.getClass().isAssignableFrom(A.class));
        System.out.println(ba.getClass().isAssignableFrom(A.class));
        System.out.println("testtest");

    }
}
