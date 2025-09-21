package com.ohgiraffers.section01.condtional;

import java.util.Scanner;

public class B_ifElse {
    public void testSimpleIfElseStatement() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자 하나 입력 : ");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("입력하신 숫자는 짝수입니다. ");
        }
        else {
            System.out.println("입력하신 숫자는 홀수 입니다.");
        }
        System.out.println("프로그램을 종료합니다. ");
    }
}
