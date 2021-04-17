package com.sqx.reflection;

public class Test05 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.m);
    }
}

class A{
    static {
        System.out.println("A静态代码块");
        m = 500;
    }

    static int m = 100;

    public A(){
        System.out.println("A无参构造");
    }

    public A(int m){
        System.out.println("A有参构造");
        this.m = m;
    }

}