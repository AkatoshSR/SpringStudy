package com.sqx.intermediary.Client;

public abstract class BaseClient implements Client{

    @Override
    public void findHouse(){
        System.out.println("找到的房子是：");
    }
}
