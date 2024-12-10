package org.example;

import org.springframework.stereotype.Component;

@Component
public class OrderServiceProxy {
    private final OrderService orderService;

    public OrderServiceProxy(OrderService orderService) {
        this.orderService = orderService;
    }

    public String createOrder(String type) {
        System.out.println("Logging: Creating order of type " + type);
        String result = orderService.createOrder(type);
        System.out.println("Logging: Order created successfully.");
        return result;
    }
}
