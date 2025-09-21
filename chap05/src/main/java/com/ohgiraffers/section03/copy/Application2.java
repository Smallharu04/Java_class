package com.ohgiraffers.section03.copy;

import java.util.Arrays;

public class Application2 {
    public static void main(String[] args) {
        String[] names = {"홍길동", "유관순", "신사임당"};
        print(names);
        System.out.println("names.hashCode()" + names.hashCode());
        System.out.println("Arrays.toString(names)" + Arrays.toString(names));

        String[] returnAnimals = getAnimal();
        System.out.println("animal.hashCode() : " + animals.hashCode());
        System.out.println("Arrays.toString(animals)" + Arrays.toString(animals));
    }

    public static void print(String[] sarr){
        System.out.println("sarr.hashcode() : " + sarr.hashCode());
        System.out.println("Arrays.toString(sarr)" + Arrays.toString(sarr));
        sarr[1] = "강감찬";
    }
    public static String[] getAnimal(){
        String[] animals = {"낙타", "호랑이", "나무늘보"};
        System.out.println("animal.hashCode() : " + animals.hashCode());
        System.out.println("Arrays.toString(animals)" + Arrays.toString(animals));
        return animals;
    }
}
