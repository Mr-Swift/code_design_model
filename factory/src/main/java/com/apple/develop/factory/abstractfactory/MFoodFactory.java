package com.apple.develop.factory.abstractfactory;

import com.apple.develop.entity.Food.Food;

public class MFoodFactory implements FoodFactory{

    @Override
    public Food createZhaJi() {
        //麦当劳-制作炸鸡
        return null;
    }

    @Override
    public Food createHanBao() {
        //麦当劳-制作汉堡
        return null;
    }
}
