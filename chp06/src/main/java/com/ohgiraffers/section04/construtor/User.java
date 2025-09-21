package com.ohgiraffers.section04.construtor;

import java.util.Date;

public class User {
    private String id;
    private String pwd;
    private String name;
    private Date enrollDate;

    public User(){
        System.out.println("기본 생성자 동작 확인");
    }

    public User(String id, String pwd) {
        this.id = id;
        this.pwd = pwd;
        System.out.println("User id, pwd 초기화 생성자 동작 확인");
    }

    public String getInformation(){
        return id + " " + pwd + " " + name + " " + enrollDate;
    }

    public User(String id, String pwd, String name, Date enrollDate){
//        this.id = id;
//        this.pwd = pwd;
        this(id, pwd);
        this.name = name;
        this.enrollDate = enrollDate;
        System.out.println("User id, pwd, name, enrollDate 초기화 생성자 동작 확인");
    }



}
