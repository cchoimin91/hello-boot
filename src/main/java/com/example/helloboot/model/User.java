package com.example.helloboot.model;

import lombok.Builder;
import lombok.ToString;

@ToString
public class User {

    private String name ;
    private int age;
    private String city;

    @Builder
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
