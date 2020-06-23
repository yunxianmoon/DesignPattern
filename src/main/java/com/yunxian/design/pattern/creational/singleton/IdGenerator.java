package com.yunxian.design.pattern.creational.singleton;



import java.util.concurrent.atomic.AtomicLong;

/**
 * ID生成器
 */
public class IdGenerator {

    private AtomicLong id = new AtomicLong(0);

    private static class InnerClass{
        static IdGenerator idGenerator = new IdGenerator();
    }

    public static IdGenerator getInstance(){
        return InnerClass.idGenerator;
    }

    public long getId(){
        return id.getAndIncrement();
    }

    private IdGenerator(){}

}
