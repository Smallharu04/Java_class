package com.ohgiraffers.domain;

import java.io.Serializable;

public class User implements Serializable {
    private int id;
    private String name;
    private int age;
    private String email;
    private int password;


    public User(int id,String name, int age, String email, int password){
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.password = password;


    }

    public int getId() { return id; }

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
