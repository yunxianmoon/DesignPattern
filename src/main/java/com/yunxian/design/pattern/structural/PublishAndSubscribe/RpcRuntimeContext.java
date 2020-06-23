package com.yunxian.design.pattern.structural.PublishAndSubscribe;

public class RpcRuntimeContext {

    /**
     * Tracer事件订阅
     */
    private static TracerSubscriber subscriber;


    public static void install(){

        subscriber = new TracerSubscriber();
        EventBus.register(ClientStartInvokeEvent.class,subscriber);

    }

    static {
        install();
    }
}
