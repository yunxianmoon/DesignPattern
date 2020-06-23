package com.yunxian.design.pattern.creational.factory.simplefactory;

public class PayFactory {

    private PayFactory(){}
    public static Pay createPay(String type){
        Pay pay = null;
        if("ali_pay".equals(type)){
            pay = new AliPay();
        }else if("wx_pay".equals(type)){
            pay = new WXPay();
        }else{
            System.out.println("支付方式不正确");
        }

        return pay;
    }

}
