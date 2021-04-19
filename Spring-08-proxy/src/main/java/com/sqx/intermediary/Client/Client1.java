package com.sqx.intermediary.Client;

public class Client1 extends BaseClient{
    @Override
    public void findHouse() {
        System.out.print("客户Client1");
        super.findHouse();
    }
}
