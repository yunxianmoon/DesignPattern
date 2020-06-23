package com.yunxian.design.pattern.behavioral.strategy;

public class ReuseClientConnectionManager extends ClientConnectionManager {


    public ReuseClientConnectionManager(boolean addHook) {
        super(addHook);
    }

    /***
     * 通过配置获取长连接
     * @return
     */
    @Override
    public Connection getConnection() {
        System.out.println("可以复用的长连接");
        return null;
    }

}
