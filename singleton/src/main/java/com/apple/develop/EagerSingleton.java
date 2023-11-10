package com.apple.develop;

public class EagerSingleton {
    /**
     * 单例：饿汉式
     */
    private static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance(){
        return instance;
    }
}
