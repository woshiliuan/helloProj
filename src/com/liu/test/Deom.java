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
        System.out.println("remote master add ttt")
        System.out.println("local master add 111");
        System.out.println("local master add 222");
    }
}
