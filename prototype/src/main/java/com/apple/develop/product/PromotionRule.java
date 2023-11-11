package com.apple.develop.product;

import lombok.Data;

// 促销规则
@Data
class PromotionRule implements Cloneable {
    private String type;
    private double discount;
    private Product product;
    // 省略构造函数、getter和setter方法


    public PromotionRule() {
    }

    public PromotionRule(String type, double discount) {
        this.type = type;
        this.discount = discount;
    }

    @Override
    protected PromotionRule clone() {
        try {
            PromotionRule promotionRule = (PromotionRule) super.clone();
            promotionRule.product = product.clone();

            return promotionRule;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
