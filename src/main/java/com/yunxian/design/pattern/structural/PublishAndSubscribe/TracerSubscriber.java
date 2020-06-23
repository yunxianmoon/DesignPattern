package com.yunxian.design.pattern.structural.PublishAndSubscribe;

public class TracerSubscriber extends Subscriber {

    public void onEvent(Event event) {
        System.out.println("TracerSubscriber message");
    }
}
