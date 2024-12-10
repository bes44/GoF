package org.example;

import org.springframework.stereotype.Component;

@Component
public class OrderFactory {
    public Order createOrder(String type) {
        switch (type) {
            case "online":
                return new OnlineOrder();
            case "instore":
                return new InStoreOrder();
            default:
                throw new IllegalArgumentException("Unknown order type: " + type);
        }
    }
}