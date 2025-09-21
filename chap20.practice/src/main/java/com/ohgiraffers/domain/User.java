package com.ohgiraffers.domain;

import java.io.Serializable;

public class User implements Serializable {
    private long id;
    private String name;
    private int age;
    private String email;
    private int password;


    public User(String name, int age, String email, int password){
        this.name = name;
        this.age = age;
        this.email = email;
        this.password = password;


    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public int getPassword() {
        return password;
    }



}
