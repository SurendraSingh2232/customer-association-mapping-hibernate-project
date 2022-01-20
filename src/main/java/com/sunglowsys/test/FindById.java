package com.sunglowsys.test;

import com.sunglowsys.domain.Customer;
import com.sunglowsys.service.CustomerServiceImpl;

public class FindById {
    public static void main(String[] args) {
        Customer customer = new CustomerServiceImpl().findById(2L);
        System.out.println(customer);
    }
}
