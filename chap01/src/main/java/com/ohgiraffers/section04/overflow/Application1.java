package com.ohgiraffers.section04.overflow;

public class Application1 {
    public static void main(String[] args) {

        byte num1 = 127;
        System.out.println("num1 = " + num1);

        num1++;
        System.out.println("num1 = " + num1);

        byte num2 = -128;
        System.out.println("num2 = " + num2);

        num2--;
        System.out.println("num2 = " + num2);

        int firstNum =  1000000;
        int secondNum = 700000;
        int multiNum = firstNum * secondNum;
        System.out.println("multiNum = " + multiNum);

        long multiNum2 = (long)firstNum * secondNum;
        System.out.println("multiNum2 = " + multiNum2);

    }
}
