package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    private final OrderServiceProxy orderServiceProxy;

    public OrderController(OrderServiceProxy orderServiceProxy) {
        this.orderServiceProxy = orderServiceProxy;
    }

    @GetMapping("/createOrder")
    public String createOrder(@RequestParam String type) {
        return orderServiceProxy.createOrder(type);
    }
}
