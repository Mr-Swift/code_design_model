package com.apple.develop.erp;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 创建原始订单
        Order originalOrder = createSampleOrder();

        // 创建新订单
        Order newOrder = originalOrder.clone();
        newOrder.setOrderId("新订单号");
        newOrder.setOrderDate(new Date());
        newOrder.setCustomer(new Customer("新客户名称", "新客户地址"));

        // 现在newOrder是originalOrder的一个深拷贝副本，我们可以对它进行修改而不会影响originalOrder。
    }

    private static Order createSampleOrder() {
        // 创建示例订单
        Customer customer = new Customer("客户名称", "客户地址");
        List<Product> products = Arrays.asList(
                new Product("商品1", "商品1名称", 10, 1),
                new Product("商品2", "商品2名称", 20, 2),
                new Product("商品3", "商品3名称", 30, 3)
        );

        Order order = new Order("订单号", new Date(), customer, products);

        return order;
    }
}
