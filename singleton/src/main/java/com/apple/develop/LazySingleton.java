package com.apple.develop;

public class LazySingleton {
    /**
     * 单例：懒汉式
     */
    private static LazySingleton instance=null;

    private LazySingleton(){};

    public static LazySingleton getInstance(){
        if(instance==null){
            instance=new LazySingleton();
        }
        return instance;
    }

}
