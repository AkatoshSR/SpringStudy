package com.sqx.reflection;

public class Test06 {

    static {
        System.out.println("main方法被加载");
    }

    public static void main(String[] args) throws ClassNotFoundException {
        // 主动引用
        //Son son = new Son();

        // 反射也会产生主动引用
        //Class.forName("com.sqx.reflection.Son");

        // 不会产生类的引用的方法
        //System.out.println(Son.b);

        // 利用数组申请空间不会产生类的引用
        //Son[] array = new Son[5];

        // 访问类的常量池不会产生类的引用
        System.out.println(Son.M);

    }

}

class Father{
    static int b = 2;

    static {
        System.out.println("父类被加载");
    }

}

class Son extends Father{
    static {
        System.out.println("子类被加载");
        m = 300;
    }

    static int m = 100;
    static final int M = 1;

}
