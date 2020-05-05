package com.bellacore.eshopping.controller;

import com.bellacore.eshopping.entity.Customer;
import com.bellacore.eshopping.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class CustomerRestController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/helo")
    public List<Customer> getCustomers(){
        return customerService.getCustomers();
    }

//    @GetMapping("/customers/{id}")
//    public Object getCustomerById(@PathVariable int id){
//        Optional<Customer> customer = customerService.getCustomerById(id);
//        if (customer == null){
//            return "No Customer found";
//        }
//        return customer;
//    }

}
