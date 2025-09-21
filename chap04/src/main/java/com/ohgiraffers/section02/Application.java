package com.ohgiraffers.section02;

import com.ohgiraffers.section02.looping.A_for;
import com.ohgiraffers.section02.looping.B_nestedFor;
import com.ohgiraffers.section02.looping.C_while;

public class Application {
    public static void main(String[] args) {
        //  A_for a = new A_for();
        //a.testSimpleForStatement();
        //a.testForExample();
        //a.testforExample2();

        B_nestedFor b = new B_nestedFor();
        //b.printGugudanFromTwoToNine();
        //b.printttriangleStar();

        C_while c = new C_while();
        c.testWhileExample();
    }

    public void testSimpleDoWhileStatement() {
        do {
            System.out.println(" do while 실행");
        }
        while (false);

    }
}
