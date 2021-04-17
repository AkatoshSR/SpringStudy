package com.sqx.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

// 获得类的信息
public class Test08 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class c1 = Class.forName("com.sqx.reflection.User");

        // 获得类的名字
        System.out.println(c1.getName()); // 获得包名+类名
        System.out.println(c1.getSimpleName()); // 获得类名

        // 获得类的属性
        System.out.println("============================");
        Field[] fields = c1.getFields(); // 只能找到public属性
        fields = c1.getDeclaredFields(); // 获得本类全部属性
        for (Field field : fields) {
            System.out.println(field);
        }

        // 获得指定属性的值
        Field name = c1.getDeclaredField("name");
        System.out.println(name);
        
        // 获得类的方法
        // 获得本类及其父类的全部方法
        Method[] methods = c1.getMethods();
        for (Method method : methods) {
            System.out.println("正常的：" + method);
        }
        // 获得本类的全部方法
        methods = c1.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("getDeclaredMethods" + method);
        }

        // 获得指定方法
        Method getAge = c1.getMethod("getAge",null);
        System.out.println(getAge);

        // 获得指定的构造器
        System.out.println("============================");
        // 只能获得public构造器
        Constructor[] constructors = c1.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }
        // 获得全部构造器
        Constructor[] declaredConstructors = c1.getDeclaredConstructors();
        for (Constructor declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }

        //获得指定构造器
        Constructor declaredConstructor = c1.getDeclaredConstructor(String.class, int.class, int.class);
        System.out.println(declaredConstructor);

    }
}
