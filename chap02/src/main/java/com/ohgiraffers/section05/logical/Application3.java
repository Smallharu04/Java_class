package com.ohgiraffers.section05.logical;

public class Application3 {
    public static void main(String[] args) {
        int num1 = 0;
        int result1 = (false && ++num1 > 0)  ? num1 : num1;
        System.out.println("&& 실행 확인 : " + num1);

        int num2 = 0;
        int result2 = (true || ++num2 > 0) ? num2 : num2;
        System.out.println("||실행 확인 : " +num2);
    }
}
