package com.sqx.demo01.Host;

public abstract class BaseHost implements Host{

    @Override
    public void provideHouse(){
        System.out.println("提供的房子");
    }

}
