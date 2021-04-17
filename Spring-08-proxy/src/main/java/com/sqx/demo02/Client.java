package com.sqx.demo02;

public class Client {
    public static void main(String[] args) {
        UserService userServiceImpl = new UserServiceImpl();
        UserServiceProxy userServiceProxy = new UserServiceProxy();

        userServiceProxy.setUserService(userServiceImpl);


        userServiceProxy.add();
    }
}
