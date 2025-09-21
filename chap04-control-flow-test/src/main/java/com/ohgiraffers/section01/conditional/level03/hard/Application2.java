package com.ohgiraffers.section01.conditional.level03.hard;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("과일 이름을 입력하세요 : ");
        String fruit = sc.next();

        int price = 0;

        if (fruit.equals("사과")){
            price = 1000;
        }
        else if (fruit.equals("바나나")) {
            price = 3000;
        }
        else if  (fruit.equals("복숭아")) {
            price = 2000;
        }
        else if (fruit.equals("키위")){
            price = 5000;

        }
        else {
            System.out.println("준비된 상품이 없습니다.");
            return;
        }
        System.out.println(fruit + "의 가격은" + " " + price + "원" + "입니다.");
    }
}
