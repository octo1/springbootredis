package com.springboot.redis.example.examplespringbootredis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Anukool_Mua on 2019-06-27
 */

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/index")
    public String getIndex() {

        return "Index page";

    }


    @PostMapping()
    public ResponseEntity<?> postCustomers(@RequestBody Customer body) {

        Customer customer = customerService.createCustomer(body);

        return ResponseEntity.status(HttpStatus.CREATED).body(customer);

    }

}
