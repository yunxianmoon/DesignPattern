package com.yunxian.design.pattern.creational.factory.simplefactory;


public class AliPay implements Pay {
    @Override
    public void pay() {
        System.out.println("支付宝支付");
    }
}
