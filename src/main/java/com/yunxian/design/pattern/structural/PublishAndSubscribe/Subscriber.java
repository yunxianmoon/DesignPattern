package com.yunxian.design.pattern.structural.PublishAndSubscribe;

public abstract class Subscriber {

    /**
     * 事件订阅者
     */
    protected Subscriber() {

    }

    /**
     * 事件处理，请处理异常
     *
     * @param event 事件
     */
    public abstract void onEvent(Event event);
}
