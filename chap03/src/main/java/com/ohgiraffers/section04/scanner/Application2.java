package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("인사말 입력 : ");
        String greeting = scanner.nextLine();
        System.out.println("nextLine : " + greeting);

        System.out.print("인사말 입력 : ");
        String greeting2 = scanner.next();
        System.out.println("nextLine : " + greeting2);

    }
}
