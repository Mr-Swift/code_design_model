package com.apple.develop.factory.abstractfactory;

import com.apple.develop.entity.Food.Food;

public interface FoodFactory {
    //制作炸鸡
     Food createZhaJi();

    //制作汉堡
     Food createHanBao();
}
