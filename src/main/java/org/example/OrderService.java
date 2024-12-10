package org.example;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private final OrderFactory orderFactory;
    private final ApplicationEventPublisher publisher;

    public OrderService(OrderFactory orderFactory, ApplicationEventPublisher publisher) {
        this.orderFactory = orderFactory;
        this.publisher = publisher;
    }

    public String createOrder(String type) {
        Order order = orderFactory.createOrder(type);
        String result = order.processOrder();

        // Уведомляем слушателей о создании заказа
        publisher.publishEvent(new OrderCreatedEvent(this, type));

        return result;
    }
}