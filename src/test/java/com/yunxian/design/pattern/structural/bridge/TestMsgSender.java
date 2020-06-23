package com.yunxian.design.pattern.structural.bridge;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestMsgSender {

    @Test
    public void testPhoneSender(){
        List<String> list = new ArrayList<String>();
        list.add("13388888888");
        TelephoneMsgSender phoneMsgSender = new TelephoneMsgSender(list);
        SevereNotification sn = new SevereNotification(phoneMsgSender);
        sn.notify("严重报警等级");
    }

    @Test
    public void testEmailSender(){
        List<String> list = new ArrayList<String>();
        list.add("132@sina.com");
        EmailMsgSender emailMsgSender = new EmailMsgSender(list);
        NormalNotification nn = new NormalNotification(emailMsgSender);
        nn.notify("一般报警等级");
    }
}
