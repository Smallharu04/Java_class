package com.ohgiraffers.section02.encapsulation.problem3;

public class Application {
    public static void main(String[] args) {
        Monster m1 = new Monster();
        m1.setName("두치");
        m1.setHp(200);
        System.out.println(m1.getName());
        System.out.println(m1.getHp());

        Monster m2 = new Monster();
        m2.setName("뿌꾸");
        m2.setHp(-200);
        System.out.println(m2.getName());
        System.out.println(m2.getHp());

        Monster m3 = new Monster();
        m3.setName("드라큘라");
        m3.setHp(-200);
        System.out.println(m3.getName());
        System.out.println(m3.getHp());

    }
}
