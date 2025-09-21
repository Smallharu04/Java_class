package com.ohgiraffers.section02.looping;

import com.ohgiraffers.section01.condtional.D_switch;

import java.util.Scanner;

public class A_for {
    public void testSimpleForStatement() {
        for (int i = 0; i < 10; i++) {
            System.out.println("출력 : " + i);

        }
    }
    public void testForExample() {
            int random = (int) (Math.random() * 100) +1;
            int sum = 0;
            for (int i = 0; i <= random; i++){
                sum += i;
            }
            System.out.println(random + "까지의 합계 : " + sum);
        }
    public void testforExample2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수 : ");
        int first = sc.nextInt();
        System.out.print("두 번째 정수 : ");
        int second = sc.nextInt();

        int min = 0;
        int max = 0;

        if (first < second){
            min = first;
            max = second;
        }
        else {
            min = second;
            max = first;
        }
        int sum = 0;
        for (int i = min; i <= max; i++){
            sum += i;

        }
        System.out.println(min + "에서 " + max + "까지의 합계 : " + sum );
    }
}
