package com.yunxian.design.pattern.behavioral.strategy;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class RuntimeContext {

    /**
     * 关闭资源的钩子
     */
    private final static List<Destroyable.DestroyHook> DESTROY_HOOKS  = new CopyOnWriteArrayList<Destroyable.DestroyHook>();


    /**
     * 注册销毁器
     *
     * @param destroyHook 结果
     */
    public static void registryDestroyHook(Destroyable.DestroyHook destroyHook) {
        DESTROY_HOOKS.add(destroyHook);
    }
}
