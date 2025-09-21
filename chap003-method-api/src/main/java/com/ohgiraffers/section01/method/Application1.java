package com.ohgiraffers.section01.method;

public class Application1 {
    public static void main(String[] args) {
        System.out.println("main 호춯");

        Application1 application1 = new Application1();
        application1.methodA();
        application1.methodB();
        application1.methodC();
        application1.methodA();
        System.out.println("main 종료");

    }

    public void methodA() {
        System.out.println("methodA 호출");
        System.out.println("methodA 종료");

    }

    public void methodB() {
        System.out.println("methodB 호출");
        System.out.println("methodB 종료");

    }

    public void methodC() {
        System.out.println("methodC 호출");
        System.out.println("methodC 종료");

    }



}

