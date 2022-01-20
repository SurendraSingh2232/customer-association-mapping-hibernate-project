package com.sunglowsys.test;

import com.sunglowsys.domain.Customer;
import com.sunglowsys.service.CustomerServiceImpl;

public class DeleteById {
    public static void main(String[] args) {
        Customer customer = new CustomerServiceImpl().delete(1L);
        System.out.println(customer);
    }
}
