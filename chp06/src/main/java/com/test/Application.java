package com.test;

import java.util.HashMap;

public class Application {
    public static void main(String[] args) {
        HashMap<String,Book> map;
        map = new HashMap<>();
        map.put("120", new Book("어린왕자","생텍쥐베리",15000));
        System.out.println(map);

    }
}
