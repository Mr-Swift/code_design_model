package com.apple.develop.erp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
class Order implements Cloneable {
    private String orderId;
    private Date orderDate;
    private Customer customer;
    private List<Product> products;

    @Override
    protected Order clone() {
        try {
            Order clonedOrder = (Order) super.clone();
            clonedOrder.orderDate = (Date) orderDate.clone();
            clonedOrder.customer = customer.clone();
            clonedOrder.products = new ArrayList<>();
            for (Product product : products) {
                clonedOrder.products.add(product.clone());
            }
            return clonedOrder;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}