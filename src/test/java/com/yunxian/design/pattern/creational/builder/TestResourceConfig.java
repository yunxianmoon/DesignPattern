package com.yunxian.design.pattern.creational.builder;

import org.junit.Test;

public class TestResourceConfig {

    @Test
    public void testUsingSet(){
        ResourceConfig config = new ResourceConfig.Builder()
                .setProtocol("RPC")
                .setHost("192.168.10.10")
                .setPort(8080)
                .build();
        System.out.println(config.getProtocol());
        System.out.println(config.getHost());
        System.out.println(config.getPort());
    }
}
