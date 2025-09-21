package com.ohgiraffers.section01.array;

public class Application1 {
    public static void main(String[] args) {
        int[] arr = new int[5];

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        for(int i = 0, value = 0; i < arr.length; i++){
            arr[i] = value+= 10;
            System.out.println(arr[i]);
        }

        int sum = 0;
        for (int j : arr) {
            sum += j;

        }
        System.out.println("sum : " + sum);


        for(int i : arr) {
            System.out.println(i);
        }
    }


}
