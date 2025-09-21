package com.ohgiraffers.section01.conditional.level03.hard;


import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("첫 번째 정수 : ");
    int num1 = sc.nextInt();

    System.out.println("두 번째 정수 : ");
    int num2 = sc.nextInt();

    System.out.println("연산 기호를 입력하세요 : ");
    String op = sc.next();

    int result = 0;

   switch (op){
       case"+": result = num1 + num2; break;
       case"-": result = num1 - num2; break;
       case"*": result = num1 * num2; break;
       case"/": result = num1 / num2; break;
       case"%": result = num1 % num2; break;

       default:
           System.out.println("입력하신 연산은 없습니다.");
       return;
   }

        System.out.println(num1 + op + num2 + "=" + result);

 }
}

