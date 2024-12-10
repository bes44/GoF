package org.example;

public class OnlineOrder implements Order {
    @Override
    public String processOrder() {
        return "Processing online order.";
    }
}

