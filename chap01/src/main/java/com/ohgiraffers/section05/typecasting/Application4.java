package com.ohgiraffers.section05.typecasting;

public class Application4 {
    public static void main(String[] args) {
        int inum = 290;
        byte bnum = (byte) inum;

        System.out.println("bnum = " + inum);
        System.out.println("inum = " + bnum);

        double height = 173.5;
        int floorHeight = (int) height;
        System.out.println("floorHeight = " +  floorHeight);
    }
}
