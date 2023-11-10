package com.apple.develop.factory;

import com.apple.develop.entity.User;

public class UserFactory {
    /**
     * 简单工厂
     * @param name
     * @return
     */


    //特征：1、创建过程非常简单 2、创建方法可以直接是静态方法
    public static User create(String name) {
        //用户名、密码前缀
        String userNameHead = "user_";
        String passwordHead = "123456";

        String userName = userNameHead + name;
        String password = passwordHead + name;

        return new User(userName, password);
    }
}
