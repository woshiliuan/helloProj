package com.liu.test;

/**
 * anliu on 2018/9/19.
 */
public class Deom2 {
    public static  void f2(int u, int v) {
        int c ,d ;
        c = u + v;
        d = u - v;
        System.out.println("c:" + c);
        System.out.println("d:" + d);

    }

    public static void f1(int x, int y) {
       int a = 2;int b = 2;
       a = a + x;
       b = b + y;
        f2(a,b);
    }

    public static void main(String[] args) {
        f1(1,1);
        System.out.println("remote master add Deom2 something1")
    }
}
