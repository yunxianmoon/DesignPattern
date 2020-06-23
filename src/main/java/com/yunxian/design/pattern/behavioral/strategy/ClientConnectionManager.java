package com.yunxian.design.pattern.behavioral.strategy;

public abstract class ClientConnectionManager {


    public ClientConnectionManager(boolean addHook) {
        if (addHook) {
            RuntimeContext.registryDestroyHook(new Destroyable.DestroyHook() {
                @Override
                public void preDestroy() {

                }

                @Override
                public void postDestroy() {

                }
            });
        }
    }


    public abstract Connection getConnection();

}
