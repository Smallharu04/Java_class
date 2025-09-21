package com.ohgiraffers.section2.package_and_import;

import com.ohgiraffers.section01.method.Calculator;

public class Application2 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.min(10, 20));
        System.out.println(calculator.max(10, 20));
    }
}
