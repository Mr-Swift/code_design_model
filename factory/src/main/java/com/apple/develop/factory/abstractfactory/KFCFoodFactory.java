package com.apple.develop.factory.abstractfactory;

import com.apple.develop.entity.Food.Food;

public class KFCFoodFactory implements FoodFactory{

    @Override
    public Food createZhaJi() {
        //KFC-制作炸鸡
        return null;
    }

    @Override
    public Food createHanBao() {
        //KFC-制作汉堡
        return null;
    }
}
