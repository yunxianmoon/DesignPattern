package com.yunxian.design.pattern.behavioral.strategy;

public class AloneClientConnectionManager extends ClientConnectionManager {

    public AloneClientConnectionManager(boolean addHook) {
        super(addHook);
    }



    @Override
    public Connection getConnection() {
        System.out.println("获取一个连接");
        return null;
    }
}
