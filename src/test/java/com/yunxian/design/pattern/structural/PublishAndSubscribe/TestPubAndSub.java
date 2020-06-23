package com.yunxian.design.pattern.structural.PublishAndSubscribe;

import org.junit.Test;

public class TestPubAndSub {

    @Test
    public void testPubAndSub(){
        new RpcRuntimeContext();
        ClientInvoker clientInvoker = new ClientInvoker();
        clientInvoker.invoke();
    }
}
