package com.sqx.pojo;

import org.springframework.beans.factory.annotation.Value;

public class User {

    private String name;

    public String getName() {
        return name;
    }

    @Value("sqx")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
