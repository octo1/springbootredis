package com.springboot.redis.example.examplespringbootredis;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

/**
 * Created by Anukool_Mua on 2019-06-27
 */

@Data
@RedisHash("customer")
public class Customer {

    @Id
    private String id;

    private String firstName;

    private String lastName;

    private Integer age;

    private String email;

}
