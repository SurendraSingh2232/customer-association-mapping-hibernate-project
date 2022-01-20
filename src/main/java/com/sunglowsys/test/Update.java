package com.sunglowsys.test;

import com.sunglowsys.domain.Customer;
import com.sunglowsys.service.CustomerServiceImpl;

public class Update {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setFirstName("Tejveer");
        new CustomerServiceImpl().update(customer,2L);
        System.out.println(customer);
    }
}
