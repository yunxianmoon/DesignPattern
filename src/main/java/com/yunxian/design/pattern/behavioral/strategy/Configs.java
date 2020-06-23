package com.yunxian.design.pattern.behavioral.strategy;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Configs {

    private final static ConcurrentMap<String, Boolean> CFG  = new ConcurrentHashMap<String, Boolean>();

    static {
        init();
    }

    public static void init(){
        CFG.put("transport.connection.reuse",true);
    }

    public static boolean getOrDefaultValue(String primaryKey,boolean defaultValue) {
        boolean val = CFG.get(primaryKey);
        if (!defaultValue){
            return defaultValue;
        }
        return val;
    }

    public void setConnectionMode(boolean val){
        CFG.put("transport.connection.reuse",val);
    }


}
