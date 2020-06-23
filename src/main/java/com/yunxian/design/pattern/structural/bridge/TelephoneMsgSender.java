package com.yunxian.design.pattern.structural.bridge;

import java.util.List;

public class TelephoneMsgSender implements MsgSender {

    private List<String> telephones;

    public TelephoneMsgSender(List<String> telephones) {
        this.telephones = telephones;
    }


    @Override
    public void send(String message) {
        System.out.println("向手机 "+telephones+"通知"+ message);
    }
}
