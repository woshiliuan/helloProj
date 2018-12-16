package com.liu.test;

/**
 * anliu on 2018/9/19.
 */
public class Deom {
    public static  void f1() {
        System.out.println("one");
        System.out.println("two");
        System.out.println("three");
        "test".substring(0,1);
        "good".substring(0,1);
        System.out.println("six");
        System.out.println("six123");
        System.out.println("branch1");
        System.out.println("branch2");
    }

    public static void f2() {
        f1();
    }

    public static void main(String[] args) {
        f1();
        f2();
    }
}
