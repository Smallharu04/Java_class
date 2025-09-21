package com.ohgiraffers.section01.array.level02.normal;


import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("주민등록 번호를 입력하세요: ");
        String ssn = sc.nextLine();

        char [] arr = ssn.toCharArray();

        for (int i = 8; i < arr.length; i++){
            arr[i] = '*';
        }
        System.out.println(new String(arr));
    }



}


