package com.yunxian.design.pattern.structural.bridge;


/**
 * 严重通知
 */
public class SevereNotification extends Notification  {


    public SevereNotification(MsgSender msgSender) {
        super(msgSender);
    }

    @Override
    public void notify(String message) {
        msgSender.send(message);
    }
}
