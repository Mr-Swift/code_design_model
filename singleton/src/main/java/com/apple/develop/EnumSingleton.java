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
        //相当与一个实例化对象
        EnumSingleton;

        //枚举类的一个属性
        private EnumSingleton instance;

        //枚举类的构造方法
        private SingletonEnum() {
            instance = new EnumSingleton();
        }

        public EnumSingleton getInstance() {
            return instance;
        }
    }
}
