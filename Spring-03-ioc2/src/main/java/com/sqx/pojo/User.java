package com.sqx.pojo;

public class User {

    public String name;

    public User(String name){
        this.name = name;
        System.out.println("User的有参构造");
    }

    public User() {
        System.out.println("User的无参构造");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("User.name="+name);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
