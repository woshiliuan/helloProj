package com.liu.test;

/**
 * anliu on 2018/9/19.
 */
public class Deom {
    public static  void f1() {
        System.out.println("A");
        System.out.println("B");
    }

    public static void f2() {
        f1();
    }

    public static void main(String[] args) {
        f1();
        f2();
    }
}
