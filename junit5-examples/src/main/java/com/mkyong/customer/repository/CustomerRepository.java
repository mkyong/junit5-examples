package com.mkyong.customer.repository;

import com.mkyong.customer.model.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll();

    Customer findOne(Long id);

    boolean isDataFromMemory();
}