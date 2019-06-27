package com.springboot.redis.example.examplespringbootredis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Anukool_Mua on 2019-06-27
 */

@Service
public class CustomerService {


    private CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository repository) {

        this.customerRepository = repository;
    }


    public Customer createCustomer(Customer customer) {

        return customerRepository.save(customer);
    }

}
