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
        System.out.println("remote change 1");
        System.out.println("cccc");
        System.out.println("remote master add 2");
        System.out.println("local master add tt");
        System.out.println("remote master add Deom something1");
        System.out.println("local master add Deom sm1");
        System.out.println("remote master add Deom something2");
        System.out.println("local master add Deom sm2");
        System.out.println("remote master add Deom something3");
        System.out.println("local master add Deom sm3");
    }
}
