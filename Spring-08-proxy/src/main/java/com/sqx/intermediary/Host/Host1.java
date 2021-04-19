package com.sqx.intermediary.Host;

public class Host1 extends BaseHost{
    @Override
    public void provideHouse() {
        System.out.print("房东Host1");
        super.provideHouse();
    }
}
