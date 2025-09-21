package com.ohgiraffers.section02.looping_and_branching.level03.hard;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        // 1) 입력 검증 (2보다 큰 수만 받을 때까지 반복)
        while (true) {
            System.out.print("2보다 큰 정수를 입력하세요: ");
            n = sc.nextInt();

            if (n > 2) {
                break;   // 올바른 입력이면 반복 종료
            } else {
                System.out.println("잘못 입력했습니다. 다시 입력하세요.");
            }
        }

        // 2) 소수 판별
        boolean isPrime = true;              // 일단 소수라고 가정
        for (int i = 2; i < n; i++) {        // 2부터 n-1까지 검사
            if (n % i == 0) {                // 나누어떨어지는 수가 있으면
                isPrime = false;             // 소수가 아님
                break;                       // 더 볼 필요 없으니 중단
            }
        }

        // 3) 결과 출력
        if (isPrime) {
            System.out.println("소수다.");
        } else {
            System.out.println("소수가 아니다.");
        }
    }
}


