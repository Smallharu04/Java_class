package com.ohgiraffers.section01.conditional.level03;


import java.util.Random;
import java.util.Scanner;

public class Application2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Random rand = new Random();

            int answer = rand.nextInt(100) + 1;
            int count = 0;


            while(true) {
                System.out.println("정수를 입력하세요 : ");
                int guess = sc.nextInt();

            }

        }
    }
