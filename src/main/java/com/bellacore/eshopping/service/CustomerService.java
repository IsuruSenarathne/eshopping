package com.bellacore.eshopping.service;

import com.bellacore.eshopping.entity.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {

    List<Customer> getCustomers();

    Optional<Customer> getCustomerById(int id);

    void saveCustomer(Customer customer);

    void deleteCustomer(int id);
}
