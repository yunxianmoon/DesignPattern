package com.yunxian.design.pattern.creational.factory.simplefactory;

public class WXPay implements Pay {
    @Override
    public void pay() {
        System.out.println("微信支付");
    }
}
