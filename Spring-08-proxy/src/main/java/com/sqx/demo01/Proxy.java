package com.sqx.demo01;

import com.sqx.demo01.Client.Client;
import com.sqx.demo01.Host.Host;

public class Proxy {
    private Client client;
    private Host host;

    public Proxy(Client client, Host host) {
        this.client = client;
        this.host = host;
    }

    public void RentHouse(){
        client.findHouse();
        host.provideHouse();
    }



}
