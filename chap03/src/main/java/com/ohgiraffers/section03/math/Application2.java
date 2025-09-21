package com.ohgiraffers.section03.math;

import java.util.Random;

public class Application2 {
    public static void main(String[] args) {

    int randomNum = (int) (Math.random()* 10) +1;
        System.out.println(randomNum);

        Random random = new Random();
        int randomNum2 = random.nextInt(10) + 1;
        System.out.println(randomNum2);
    }
}
