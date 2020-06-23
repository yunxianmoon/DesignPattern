package com.yunxian.design.pattern.structural.PublishAndSubscribe;

public class ClientStartInvokeEvent implements Event {

    private  int messageCode;

    public int getMessageCode() {
        return messageCode;
    }

    public  ClientStartInvokeEvent(int messageCode) {
        this.messageCode = messageCode;
    }
}
