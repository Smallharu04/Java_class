package com.ohgiraffers.section01.condtional;

import java.util.Scanner;

public class D_switch {
    public void testSimpleSwitchStatement() {
       Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수 : ");
        int first = sc.nextInt();
        System.out.print("두 번째 정수 : ");
        int second = sc.nextInt();
        System.out.print("연산기호 입력 : ");
        char op = sc.next().charAt(0);
        int result = 0;

        switch (op) {
            case '+': result = first + second; break;
            case '-': result = first - second; break;
            case '*': result = first * second; break;
            case '/': result = first / second; break;
            case '%': result = first % second; break;
            default:
                System.out.println("해당하는 연산기호가 없습니다. ");
                return;
        }
        System.out.println(first + " "+ op + " " + second + " = " + result);

    }

    public void improveSimpleSwitchStatement() {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수 : ");
        int first = sc.nextInt();
        System.out.print("두 번째 정수 : ");
        int second = sc.nextInt();
        System.out.print("연산기호 입력 : ");
        char op = sc.next().charAt(0);
        int result = 0;

        int result1 = switch (op) {
            case '+' -> first + second;
            case '-' -> first - second;
            case '*' -> first * second;
            case '/' -> first / second;
            case '%' -> first % second;
            default -> 0;
        };
        System.out.println(first + " "+ op + " " + second + " = " + result1);
    }
}
