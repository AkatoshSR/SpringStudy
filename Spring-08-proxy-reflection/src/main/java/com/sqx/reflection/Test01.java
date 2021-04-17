package com.sqx.reflection;

public class Test01 {
    public static void main(String[] args) throws ClassNotFoundException {
        // 通过反射获取类的对象
        Class c1 = Class.forName("com.sqx.reflection.User");
        System.out.println(c1);

        Class c2 = Class.forName("com.sqx.reflection.User");
        Class c3 = Class.forName("com.sqx.reflection.User");
        Class c4 = Class.forName("com.sqx.reflection.User");

        // 一个类在内存中只有一个class对象
        // 类被加载后，类的整个结构都会被封装在Class对象中
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
        System.out.println(c4.hashCode());

    }

}

// 实体类：pojo
class User{
    private String name;
    private int id;
    private int age;

    public User() {
    }

    public User(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private void privateMethod(){
        System.out.println("这是private方法");
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }
}
