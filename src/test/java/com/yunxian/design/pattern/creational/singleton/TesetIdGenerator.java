package com.yunxian.design.pattern.creational.singleton;

import org.junit.Assert;
import org.junit.Test;

public class TesetIdGenerator {

    @Test
    public void testInstance(){
        IdGenerator idGenerator = IdGenerator.getInstance();
        IdGenerator idGenerator2 = IdGenerator.getInstance();
        Assert.assertEquals(idGenerator,idGenerator2);

    }
}
