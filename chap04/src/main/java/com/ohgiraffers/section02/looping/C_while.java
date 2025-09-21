package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class C_while {
    public void testSimpleWhileStatement() {
        int i = 0;
        while (i < 10) {
            System.out.println("출력 : " + i);
            i++;
        }
    }
    public void testWhileExample() {
        Scanner sc = new Scanner(System.in);
        String input = " ";

        while (!input.equals("exit")){
            System.out.print("문자열 입력 : ");
            input = sc.nextLine();
            System.out.println("입력 받은 문자열 : " + input);


        }
    }
}
