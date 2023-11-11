package com.apple.develop.erp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
class Customer implements Cloneable {
    private String customerId;
    private String customerName;
    private String address;
    // 省略构造函数、getter和setter方法


    public Customer(String customerName, String address) {
        this.customerName = customerName;
        this.address = address;
    }

    @Override
    protected Customer clone() {
        try {
            return (Customer) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}