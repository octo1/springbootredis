package com.springboot.redis.example.examplespringbootredis;

import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Anukool_Mua on 2019-06-27
 */

@EnableRedisRepositories
public interface CustomerRepository extends CrudRepository<Customer, String> {


    List<Customer> findByFirstName(String firstName);

}
