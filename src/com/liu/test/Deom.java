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
        System.out.println("remote master add f2");
    }

    public static void main(String[] args) {
        System.out.println("master change 1");
        System.out.println("branch-to-rebase change 1");
        System.out.println("branch-to-rebase change 2");
        System.out.println("remote master add line1");
        System.out.println("remote master add line2");
        System.out.println("remote master add line3");
    }
}
