package com.sqx.pojo;

public class UserT {

    private String name;

    public UserT(){
        System.out.println("UserT的无参构造");
    }

    public UserT(String name) {
        this.name = name;
        System.out.println("UserT的有参构造");
    }

    public void show(){
        System.out.println("UserT.name="+name);
    }

    @Override
    public String toString() {
        return "UserT{" +
                "name='" + name + '\'' +
                '}';
    }
}
