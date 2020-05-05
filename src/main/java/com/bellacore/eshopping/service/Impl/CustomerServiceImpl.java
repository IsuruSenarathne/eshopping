package com.bellacore.eshopping.service.Impl;

import com.bellacore.eshopping.entity.Customer;
import com.bellacore.eshopping.repository.CustomerRepository;
import com.bellacore.eshopping.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    @Transactional
    public List<Customer> getCustomers() {
        return this.customerRepository.findAll();
    }

    @Override
    @Transactional
    public Optional<Customer> getCustomerById(int id) {
        return customerRepository.findById(id);
    }

    @Override
    @Transactional
    public void saveCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    @Transactional
    public void deleteCustomer(int id) {
        customerRepository.deleteById(id);
    }
}
