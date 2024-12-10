package org.example;

public class InStoreOrder implements Order {
    @Override
    public String processOrder() {
        return "Processing in-store order.";
    }
}
