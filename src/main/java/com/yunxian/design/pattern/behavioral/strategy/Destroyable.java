package com.yunxian.design.pattern.behavioral.strategy;

/**
 * <p>可销毁的接口</p>
 */
public interface Destroyable {

    /**销毁接口*/
    void destroy();

    void destroy(DestroyHook hook);


    /**销毁钩子*/
    interface DestroyHook{
        /**销毁前要做的事情*/
        void preDestroy();
        /**销毁后要做的事情*/
        void postDestroy();
    }
}
