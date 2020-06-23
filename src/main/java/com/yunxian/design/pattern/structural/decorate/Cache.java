package com.yunxian.design.pattern.structural.decorate;

import java.util.concurrent.locks.ReadWriteLock;

/**
 * mybatis中的缓存
 */
public interface Cache {

    /**
     * @return The identifier of this cache
     */
    String getId();

    /**
     * @param key Can be any object but usually it is a {@link CacheKey}
     * @param value The result of a select.
     */
    void putObject(Object key, Object value);

    /**
     * @param key The key
     * @return The object stored in the cache.
     */
    Object getObject(Object key);

     /**
     * @param key The key
     * @return Not used
     */
    Object removeObject(Object key);

    /**
     * Clears this cache instance
     */
    void clear();

    /**
     * @return The number of elements stored in the cache (not its capacity).
     */
    int getSize();

    /**
     *
     * @return A ReadWriteLock
     */
    ReadWriteLock getReadWriteLock();
}
