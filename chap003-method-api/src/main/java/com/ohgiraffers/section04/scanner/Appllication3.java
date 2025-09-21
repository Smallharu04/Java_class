package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Appllication3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("숫자 입력 : ");
        int num = scanner.nextInt();
        System.out.println("num : " + num);

        scanner.nextLine();

        System.out.print("문자열 입력 : ");
        String str = scanner.nextLine();
        System.out.println("str : " + str);

        System.out.print("문자열 입력 : ");
        String str2 = scanner.next();
        System.out.println("str2 : " + str2);

        System.out.print("숫자 입력 : ");
        int num2 = scanner.nextInt();
        System.out.println("num2 : " + num2);




    }
}
