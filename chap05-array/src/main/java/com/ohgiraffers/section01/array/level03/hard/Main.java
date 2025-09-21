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
public class Main {
        public static void Main(String[] args) {
            Student s1 = new Student("철수");
            Student s2 = new Student("영희");

            s1.introduce(); // 안녕, 나는 철수
            s2.introduce(); // 안녕, 나는 영희
        }
    }
