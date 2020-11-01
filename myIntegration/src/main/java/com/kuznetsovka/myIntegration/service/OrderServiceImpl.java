package com.kuznetsovka.myIntegration.service;

import com.kuznetsovka.myIntegration.dao.OrderRepository;
import com.kuznetsovka.myIntegration.domain.Order;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class OrderServiceImpl implements OrderService{
    private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository1) {
        this.orderRepository = orderRepository1;
    }

    @Override
    @Transactional
    public void save(Order order) {
        orderRepository.save(order);
    }
}
