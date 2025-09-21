package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

//        System.out.print("이름 입력 : ");
//        String name = scanner.nextLine();
//        System.out.println("name : " + name);

//        System.out.print("나이 입력 : ");
//        int age = scanner.nextInt();
//        System.out.println("age : " + age);

//        System.out.print("키 입력 : ");
//        double height = scanner.nextDouble();
//        System.out.println("height : " + height);

//        System.out.print("참과 거짓 중 하나를 true or false로 입력 : ");
//        boolean isTrue = scanner.nextBoolean();
//        System.out.println("isTrue: " + isTrue);

        System.out.print("아무 문자나 입력 : ");
        char ch = scanner.nextLine().charAt(4);
        System.out.println("첫 번째 문자 : " + ch);
    }
}
