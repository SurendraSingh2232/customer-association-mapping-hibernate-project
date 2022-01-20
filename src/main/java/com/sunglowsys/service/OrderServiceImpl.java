package com.sunglowsys.service;

import com.sunglowsys.domain.Order;
import com.sunglowsys.repository.OrderRepository;
import com.sunglowsys.repository.OrderRepositoryImpl;

import java.util.List;

public class OrderServiceImpl implements OrderRepository {

    private static OrderRepository orderRepository = new OrderRepositoryImpl();
    @Override
    public Order save(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public Order update(Order order, Long id) {
        return orderRepository.update(order,id);
    }

    @Override
    public List<Order> allFind() {
        return orderRepository.allFind();
    }

    @Override
    public Order findById(Long id) {
        return orderRepository.findById(id);
    }

    @Override
    public Order delete(Long id) {
        return orderRepository.delete(id);
    }
}
