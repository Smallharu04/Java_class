package com.ohgiraffers.section01.method;

public class Application5 {
    public static void main(String[] args) {
        Application5 application5 = new Application5();
        System.out.println(application5.plus(10, 20));
        System.out.println(Application5.minus(10, 20));
        System.out.println(minus(30, 10));

    }

    public int plus(int a, int b) {
        return a + b;
    }

    public static int minus(int a,int b) {
        return a -  b;
    }
}
