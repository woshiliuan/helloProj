package com.liu.test;

/**
 * anliu on 2018/9/19.
 */
public class Deom {
    public static  void f1() {
        System.out.println("F");
        System.out.println("G");
    }

    public static void f2() {
        f1();
    }

    public static void main(String[] args) {
        f1();
        f2();
        System.out.println("cccc");
    }
}
