package com.yunxian.design.pattern.behavioral.strategy;

import org.junit.Test;

public class TestClientTransport {

    @Test
    public void testReuseConectionStrategy(){
        ClientTransport client = new ClientTransport(true);
        client.getConnectionManagerStratege();
        client.fetchConnection();
    }

    @Test
    public void testAloneConectionStrategy(){
        ClientTransport client = new ClientTransport(false);
        Configs configs = new Configs();
        client.getConnectionManagerStratege();
        client.fetchConnection();
    }


}
