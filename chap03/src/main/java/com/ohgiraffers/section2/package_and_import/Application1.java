package com.ohgiraffers.section2.package_and_import;

public class Application1 {
    public static void main(String[] args) {
        com.ohgiraffers.section01.method.Calculator calculator
                = new com.ohgiraffers.section01.method.Calculator();
        System.out.println(calculator.min(10, 20));
        System.out.println(calculator.max(10, 20));
    }
}
