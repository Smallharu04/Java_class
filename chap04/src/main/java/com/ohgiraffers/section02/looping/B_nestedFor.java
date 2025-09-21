package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class B_nestedFor {
    public void printGugudanFromTwoToNine() {
       for (int dan = 2; dan <= 9; dan++) {
           System.out.println("====== " + dan +  " 단 " + " ======");
           for (int su = 1; su <= 9; su++) {
               System.out.println(dan + " * " + su + " = " + (dan * su));
           }
       }
    }

    public void printttriangleStar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("출력하고 싶은 행의 개수 : ");
        int row = sc.nextInt();

        for (int i = 1; i <= row; i++){
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
