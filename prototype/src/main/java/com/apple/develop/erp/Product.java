package com.apple.develop.erp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
class Product implements Cloneable {
    private String productId;
    private String productName;
    private double price;
    private int quantity;
    // 省略构造函数、getter和setter方法

    @Override
    protected Product clone() {
        try {
            return (Product) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
