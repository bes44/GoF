package org.example;

import org.springframework.context.ApplicationEvent;

public class OrderCreatedEvent extends ApplicationEvent {
    private final String orderType;

    public OrderCreatedEvent(Object source, String orderType) {
        super(source);
        this.orderType = orderType;
    }

    public String getOrderType() {
        return orderType;
    }
}