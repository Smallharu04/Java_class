package com.ohgiraffers.section01.array;

public class Application2 {

    public static void main(String[] args) {
        int [] iarr;
        double [] darr;

        iarr = new int [5];
        darr = new double [5];

        System.out.println("iarr : " + iarr);
        System.out.println("darr : " + darr);

        System.out.println("iarr.hashcode : " + iarr.hashCode());
        System.out.println("darr.hashcode : " + darr.hashCode());

        System.out.println("iarr.length : " + iarr.length);
        System.out.println("darr.length : " + darr.length);

        iarr = new int [100];
        System.out.println("iarr.hashcode : " + iarr.hashCode());
        System.out.println("iarr.length : " + iarr.length);

        iarr = null;
        System.out.println("iarr.hashcode : " + iarr.hashCode());
        System.out.println("iarr.length : " + iarr.length);
    }

}
