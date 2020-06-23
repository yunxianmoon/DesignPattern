package com.yunxian.design.pattern.behavioral.iterator;

import org.junit.Test;

import java.util.ArrayList;

public class TestArrayIterator {

    @Test
    public void testIteratorMethod(){
        ArrayList<String> names = new ArrayList<String>();
        names.add("a");
        names.add("b");
        names.add("c");
        Iterator<String> iterator = new ArrayIterator(names);
        while (iterator.hasNext()) {
            System.out.println(iterator.currentItem());
            iterator.next();
        }
    }
}
