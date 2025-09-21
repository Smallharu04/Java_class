package com.ohgiraffers.section04.construtor;

import java.util.Date;

public class Application {
    public static void main(String[] args) {
        User u1 = new User();
        System.out.println(u1.getInformation());

        User u2 = new User("user01", "pass01");
        System.out.println(u2.getInformation());

        User u3 = new User("user02", "pass02", "홍길동", new Date());
        System.out.println(u3.getInformation());
    }

}
