package com.ohgiraffers.section01.array.level01.basic;


import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
      String [] fruit = new String[5];
      fruit[0] = "딸기";
      fruit[1] = "바나나";
      fruit[2] = "복숭아";
      fruit[3] = "키위";
      fruit[4] = "사과";

      Scanner sc = new Scanner(System.in);
        System.out.print("0부터 4까지의 정수를 입력하세요 : ");
        int index =  sc.nextInt();

        if (index >= 0 && index < fruit.length){
            System.out.println(fruit[index]);
        }
        else  {
            System.out.println("준비된 과일이 없습니다.");
        }
    }



}

