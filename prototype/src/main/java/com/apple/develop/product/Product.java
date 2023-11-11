package com.apple.develop.product;

import lombok.Data;

@Data
class Product implements Cloneable {
    private String name;
    private double price;
    private int stock;

    @Override
    public Product clone() {
        try {
            return (Product) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
