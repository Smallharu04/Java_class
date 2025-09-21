package com.test;

import java.util.HashMap;

public class Book {

    String name;
    String author;
    int price;

    public Book(String name , String author, int price){
        this.name = name;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}

