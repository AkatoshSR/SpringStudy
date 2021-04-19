package com.sqx.deme03;

public class Client {
    public static void main(String[] args) {
        // 真实角色
        Host host = new Host();

        // 准备生成代理的角色
        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();
        proxyInvocationHandler.setRent(host);

        // 通过调用程序处理角色来处理我们要调用的接口对象
        Rent proxy = (Rent) proxyInvocationHandler.getProxy();
        proxy.rent();

    }
}
