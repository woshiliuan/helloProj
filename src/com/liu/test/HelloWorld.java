package com.liu.test;

class A {
}

class B extends A {
}
public class HelloWorld {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("testtest");
        System.out.println("testtest");
        B b = new B();
        A ba = new B();
    }
}
