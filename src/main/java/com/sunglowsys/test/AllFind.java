package com.sunglowsys.test;

import com.sunglowsys.domain.Customer;
import com.sunglowsys.service.CustomerServiceImpl;

import java.util.List;

public class AllFind {
    public static void main(String[] args) {
        List<Customer> customerList = new CustomerServiceImpl().allFind();
        for (Customer customer : customerList){
            System.out.println(customer);
        }
    }
}
