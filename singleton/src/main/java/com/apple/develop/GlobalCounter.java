package com.apple.develop;

import java.util.concurrent.atomic.AtomicLong;

public class GlobalCounter {
    /**
     * 单例：饿汉式
     */

    private AtomicLong atomicLong = new AtomicLong(0);

    /**
     * 饿汉式标志：实例为静态变量，在类加载的时候就被初始化出来
     */
    private static final GlobalCounter instance = new GlobalCounter();

    // 私有化无参构造器
    private GlobalCounter() {}
    public static GlobalCounter getInstance() {
        return instance;
    }
    public long getId() {
        return atomicLong.incrementAndGet();
    }
}
