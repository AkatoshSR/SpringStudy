package com.sqx.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// 分析性能问题
public class Test10 {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        test01();
        test02();
        test03();

    }

    // 普通方式调用
    public static void test01() {
        User user = new User();
        long startTime = System.currentTimeMillis();

        // 1e9
        for (int i = 0; i < 1000000000; i++) {
            user.getName();
        }

        long endTime = System.currentTimeMillis();
        System.out.println("普通方法执行1e9次：" + (endTime - startTime) + "ms");
    }

    // 反射方式调用
    public static void test02() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        User user = new User();
        Class c1 = user.getClass();
        Method getName = c1.getDeclaredMethod("getName", null);
        long startTime = System.currentTimeMillis();

        // 1e9
        for (int i = 0; i < 1000000000; i++) {
            getName.invoke(user, null);
        }

        long endTime = System.currentTimeMillis();
        System.out.println("反射方法执行1e9次：" + (endTime - startTime) + "ms");
    }

    // 反射方式调用，关闭安全检测
    public static void test03() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        User user = new User();
        Class c1 = user.getClass();
        Method getName = c1.getDeclaredMethod("getName", null);
        getName.setAccessible(true);
        long startTime = System.currentTimeMillis();

        // 1e9
        for (int i = 0; i < 1000000000; i++) {
            getName.invoke(user, null);
        }

        long endTime = System.currentTimeMillis();
        System.out.println("关闭检测后方法执行1e9次：" + (endTime - startTime) + "ms");
    }
    /*
    普通方法执行1e9次：4ms
    反射方法执行1e9次：2294ms
    关闭检测后方法执行1e9次：1040ms
     */

}
