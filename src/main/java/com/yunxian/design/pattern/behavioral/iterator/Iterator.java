package com.yunxian.design.pattern.behavioral.iterator;

public interface Iterator<E>  {

    boolean hasNext();

    void next();

    E currentItem();

}
