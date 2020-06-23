package com.yunxian.design.pattern.creational.factory;

import com.yunxian.design.pattern.creational.factory.simplefactory.Pay;
import com.yunxian.design.pattern.creational.factory.simplefactory.PayFactory;
import org.junit.Assert;
import org.junit.Test;

public class TestPay {

    @Test
    public void testPay(){
        Pay pay = PayFactory.createPay("ali_pay");
        pay.pay();
        Assert.assertNotNull(pay);
    }
}
