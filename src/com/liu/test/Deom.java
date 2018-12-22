package com.liu.test;

/**
 * anliu on 2018/9/19.
 */
public class Deom {
    public static  void f1() {
        System.out.println(99999);
        System.out.println(88888);
        System.out.println(77777);
    }

    public static void f2() {
        f1();
    }

    public static void main(String[] args) {
        f1();
        f2();
    }
}
