package com.sunglowsys.test;

import com.sunglowsys.domain.Customer;
import com.sunglowsys.domain.Order;
import com.sunglowsys.service.CustomerServiceImpl;

import java.util.HashSet;
import java.util.Set;

public class SaveCustomer {

    public static void main(String[] args) {

        Set<Order> orders = new HashSet<>();

        Order order = new Order("Vivo","y73","online");
        Order order1 = new Order("Leptop","thinkPad","online");
        Order order2 = new Order("beg","sssl","online");

        Customer customer = new Customer("Gulshan","Kumar","hk@gmail.com","9905795770");

        orders.add(order);
        orders.add(order1);
        orders.add(order2);

        customer.setOrders(orders);

        new CustomerServiceImpl().save(customer);
        System.out.println(customer);
    }
}
