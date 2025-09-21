package com.ohgiraffers.section02.encapsulation.problem3;

public class Monster {
   private String name;
   private int hp;

   public void setName(String name){
       this.name = name;
   }
   public String getName(){
       return name;
   }

    public void setHp (int hp) {
        if (hp > 0) {
            this.hp = hp;
            System.out.println("양수 값이 입력 되어 몬스터의 체력을 입력 값으로 변경");
        } else {
            this.hp = 0;
            System.out.println("음수 값이 입력 되어 몬스터의 체력을 0으로 변경 ");
        }

    }

    public int getHp(){
       return hp;
    }

}
