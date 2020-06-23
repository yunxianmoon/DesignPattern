package com.yunxian.design.pattern.structural.PublishAndSubscribe;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArraySet;

public class EventBus {

    /**
     * 某中事件的订阅者
     */

    private final static ConcurrentMap<Class<? extends Event>, CopyOnWriteArraySet<Subscriber>> SUBSCRIBER_MAP
            = new ConcurrentHashMap<Class<? extends Event>, CopyOnWriteArraySet<Subscriber>>();

    /**
     * 注册一个订阅者
     *
     * @param eventClass 事件类型
     * @param subscriber 订阅者
     */
    public static void register(Class<? extends Event> eventClass, Subscriber subscriber) {

        CopyOnWriteArraySet<Subscriber> set = SUBSCRIBER_MAP.get(eventClass);

        if (set == null) {
            set = new CopyOnWriteArraySet<Subscriber>();
            CopyOnWriteArraySet<Subscriber> old = SUBSCRIBER_MAP.putIfAbsent(eventClass, set);
            if (old != null) {
                set = old;
            }
        }
        set.add(subscriber);
//        if (LOGGER.isDebugEnabled()) {
//            LOGGER.debug("Register subscriber: {} of event: {}.", subscriber, eventClass);
//        }

    }


    public static void post(final Event event) {

        //根据传入得event获取到相应的Subscriber
        CopyOnWriteArraySet<Subscriber> subscribers = SUBSCRIBER_MAP.get(event.getClass());
        for (final Subscriber subscriber : subscribers) {
            handleEvent(subscriber, event);
        }
    }


    private static void handleEvent(final Subscriber subscriber,final  Event event) {
        try {
            subscriber.onEvent(event);
        } catch (Throwable e) {
//                if (LOGGER.isWarnEnabled()) {
//                    LOGGER.warn("Handle " + event.getClass() + " error", e);
//                }
            new Throwable(e);
        }
    }

}
