package com.ohgiraffers.section01.method;

public class Applicationn4 {
    public static void main(String[] args) {
    Applicationn4 application4 = new Applicationn4();
    application4.testMethod();
    String result = application4.testMethod();
    System.out.println(result);
    System.out.println(application4.testMethod());
    }
    public String testMethod() {
        return  "Hello World!";
    }

    public void testMethod2() {
        System.out.println("출력문1");
        return;
       // System.out.println("출력문2");
    }
}
