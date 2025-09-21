package com.ohgiraffers.section01.method;

public class Application3 {
    public static void main(String[] args) {

        Application3 application3 = new Application3();
        application3.testMethod(40);
        //application3.testMethod();
        //application3.testMethod(20, 30);
        //application3.testMethod("20");

        application3.testMethod2("홍길동" , 40 , '남');
        application3.testMethod2("유관순" , 30 , '여');

    }

        public void testMethod(int age) {
            System.out.println("당신의 나이는 " + age + "세 입니다.");
        }

        public void testMethod2(String name, int age, final char gender){
//       name = "홍길동";
//       age = 20;
//       gender = '남';
       System.out.println(" 당신의 이름은 " + name + "이고, 나이는 " + age + "세이고 " + "성별은 " + gender + "입니다. ");
        }
}
