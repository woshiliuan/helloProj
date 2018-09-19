package com.liu.test;

class A {
}

class B extends A {
}
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("testtest");
        A a = new A();
        B b = new B();
        A ba = new B();
        System.out.println("testtest");

    }
}
