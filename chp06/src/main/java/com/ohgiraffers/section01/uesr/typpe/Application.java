package com.ohgiraffers.section01.uesr.typpe;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {

        Member member = new Member();


        member.id = "user01";
        member.pwd = "pass01";
        member.name = "홍길동";
        member.age = 20;
        member.gender = '남';
        member.hobby= new String[] {"야구", "코딩"};

        System.out.println(member.id);
        System.out.println(member.pwd);
        System.out.println(member.name);
        System.out.println(member.age);
        System.out.println(member.age);
        System.out.println(member.gender);
        System.out.println(Arrays.toString(member.hobby));


        member.id = "user01";
        member.pwd = "pass01";
        member.name = "홍길동";
        member.age = 20;
        member.gender = '남';
        member.hobby= new String[] {"야구", "코딩"};
    }
}
