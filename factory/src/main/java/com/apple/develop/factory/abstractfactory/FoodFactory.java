package com.apple.develop.factory.abstractfactory;

import com.apple.develop.entity.Food.Food;

public abstract class FoodFactory {
    /**
     * 抽象工程区别于工厂的一个最明显的点就是：产品族
     * @return
     */


    //制作炸鸡
     abstract Food createZhaJi();

    //制作汉堡
     abstract Food createHanBao();
}
