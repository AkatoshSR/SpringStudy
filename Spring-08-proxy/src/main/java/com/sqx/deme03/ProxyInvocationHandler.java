package com.sqx.deme03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// 自动生成代理
public class ProxyInvocationHandler implements InvocationHandler {

    // 被代理的接口
    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    // 生成得到代理
    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), rent.getClass().getInterfaces(), this);
    }

    // 处理代理实例，并返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        // 代理类的增强方法
        seeHouse();

        // 动态代理的本质，就是使用反射机制实现
        // 代理类自身的方法
        Object result = method.invoke(rent, args);

        // 代理类的增强方法
        fare();

        return result;
    }

    // 设置类增强方法
    public void seeHouse() {
        System.out.println("看房子");
    }

    public void fare() {
        System.out.println("收小费");
    }

}
