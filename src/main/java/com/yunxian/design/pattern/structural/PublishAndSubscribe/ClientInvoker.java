package com.yunxian.design.pattern.structural.PublishAndSubscribe;

public class ClientInvoker {

    public  void invoke(){

        EventBus.post(new ClientStartInvokeEvent(1));
    }

}
