package com.ohgiraffers.section01.array.level03.hard;

public class Student {
        String name;

        Student(String name) {
            this.name = name;   // this.name → 내 이름
        }

        void introduce() {
            System.out.println("안녕, 나는 " + this.name);
        }
    }

