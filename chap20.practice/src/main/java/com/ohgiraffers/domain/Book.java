package com.ohgiraffers.domain;


import java.io.Serializable;

public class Book implements Serializable {
    private long id;
    private String BookName;


public Book(String BookName){
    this.BookName = BookName;
}

    public String getBookName() {
        return BookName;
    }
}
