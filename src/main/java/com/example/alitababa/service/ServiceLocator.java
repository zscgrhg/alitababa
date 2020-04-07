package com.example.alitababa.service;

import com.zte.sputnik.parse.annotation.TestSubject;
import org.springframework.stereotype.Service;

@Service
@TestSubject
public class ServiceLocator {
    public OrderService findOrderService() {
        return new OrderServiceImpl();
    }
}
