package com.apple.develop;

public class EnumSingleton {
    /**
     * 单例：静态内部枚举类实现
     */

    private EnumSingleton() {
    }

    public static EnumSingleton getInstance() {
        return SingletonEnum.EnumSingleton.getInstance();
    }

    public static enum SingletonEnum {
        EnumSingleton;
        private EnumSingleton instance;

        private SingletonEnum() {
            instance = new EnumSingleton();
        }

        public EnumSingleton getInstance() {
            return instance;
        }
    }
}
