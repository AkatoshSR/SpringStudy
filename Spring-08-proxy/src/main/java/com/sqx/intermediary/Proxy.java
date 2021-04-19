package com.sqx.intermediary;

import com.sqx.intermediary.Client.Client;
import com.sqx.intermediary.Host.Host;

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
