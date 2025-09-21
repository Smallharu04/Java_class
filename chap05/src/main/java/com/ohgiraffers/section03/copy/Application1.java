package com.ohgiraffers.section03.copy;

import java.util.Arrays;

public class Application1 {
    public static void main(String[] args) {
        int [] origin = {1,2,3,4,5};

        int [] copy = origin;

        System.out.println(origin.hashCode());
        System.out.println(copy.hashCode());

        System.out.println(Arrays.toString(origin));
        System.out.println(Arrays.toString(copy));

        origin[2] = 99;

        System.out.println(Arrays.toString(origin));
        System.out.println(Arrays.toString(copy));
    }
}
