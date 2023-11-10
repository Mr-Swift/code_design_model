package com.apple.develop;

import java.util.concurrent.atomic.AtomicLong;

public enum EnumGlobalCounter {
    /**
     * 单例：枚举的另一种实现方式
     */
    INSTANCE;
    private AtomicLong atomicLong = new AtomicLong(0);

    public long getNumber() {
        return atomicLong.incrementAndGet();
    }


    public static void main(String[] args) {
        EnumGlobalCounter.INSTANCE.getNumber();
    }
}
