package com.ohgiraffers.section02.dimensional;

public class Application1 {
    public static void main(String[] args) {
        int[][] arr1 = new int[3][5];

        arr1[0] = new int[5];
        arr1[1] = new int[5];
        arr1[2] = new int[5];


        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++)
                System.out.print(arr1[i][j] + " ");

            System.out.println();
        }
        }
    }


