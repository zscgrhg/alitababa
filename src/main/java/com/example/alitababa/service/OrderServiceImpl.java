package com.example.alitababa.service;

import com.example.alitababa.entity.Order;
import com.zte.sputnik.parse.annotation.TestSubject;

@TestSubject
public class OrderServiceImpl implements OrderService {
    @Override
    public Order findById(Long id) {
        Order order = new Order();
        order.setId(id);
        order.setAmount(10 + id.intValue());
        order.setItemName("item" + id);
        return order;
    }
}
