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
    }

    public static void f2() {
        for(char c = 0; c < 128; c++) {
            if(Character.isLowerCase(c)) {
                System.out.println("value: " + (int) c + " character: " + c);
            }
        }
        f1();
    }

    public static void main(String[] args) {
        f1();
        f2();
    }
}
