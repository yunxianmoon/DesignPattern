package com.yunxian.design.pattern.structural.bridge;

import java.util.List;

public class EmailMsgSender implements MsgSender {

    private List<String> mail;

    public EmailMsgSender(List<String> mail){
        this.mail = mail;
    }

    @Override
    public void send(String message) {
        System.out.println("向邮件 "+mail+"通知"+ message);
    }
}
