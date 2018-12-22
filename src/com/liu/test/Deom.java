package com.liu.test;

/**
 * anliu on 2018/9/19.
 */
public class Deom {
    public static  void f1() {
        System.out.println(99999);
        System.out.println(88888);
        System.out.println("ttttt");
        System.out.println(555555);
    }

    public static void f2() {
        f1();
    }

    public static void main(String[] args) {
        f1();
        f2();
    }
}
