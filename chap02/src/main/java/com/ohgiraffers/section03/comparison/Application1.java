package com.ohgiraffers.section03.comparison;

public class Application1 {

    public static class Application2 {
        public static void main(String[] args) {

            int num = 90;
            System.out.println("num은 1~100 사이의 값인가? : " + (num >= 1 && num <= 100)) ;

            char ch = 'x';
            System.out.println("ch는 대문자인가? : " + (ch >= 'A' && ch <= 'Z') );

            char ch2 = 'y';
            System.out.println("y 인가? : " + (ch2 == 'y' || ch2 == 'Y'));

            char ch3 = 'a';
            System.out.println("대소문자 상관없이 영문자인가? : "   +
                    ((ch3 >= 'a' && ch3 <= 'z') || (ch3 >= 'A' && ch3 <= 'Z'))
            );

        }
    }
}
