package com.sqx.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

// 通过反射动态地创建对象
public class Test09 {
    public static void main(String[] args) throws Exception {

        // 获得Class对象
        Class c1 = Class.forName("com.sqx.reflection.User");


        // 构造一个对象
        //User user = (User)c1.newInstance();// 本质上是调用的无参构造器
        //System.out.println(user);

        // 通过构造器获得对象
        //Constructor constructor = c1.getDeclaredConstructor(String.class, int.class, int.class);
        //User user2 = (User)constructor.newInstance("sqx", 1, 1);// 调用有参构造器
        //System.out.println(user2);

        // 通过反射调用普通方法
        User user3 = (User)c1.newInstance();
        // 通过反射获取一个方法
        Method setName = c1.getDeclaredMethod("setName",String.class);
        setName.invoke(user3, "sqx1");
        System.out.println(user3.getName());

        // 通过反射操作属性
        User user4 = (User)c1.newInstance();
        Field name = c1.getDeclaredField("name");

        // 关闭权限安全检测
        name.setAccessible(true);

        name.set(user4, "sqx2");
        System.out.println(user4.getName());


    }
}
