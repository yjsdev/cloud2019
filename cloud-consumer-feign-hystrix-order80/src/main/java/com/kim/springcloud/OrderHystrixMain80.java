package com.kim.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @auther kim
 * @create 2020-04-13 16:40
 */
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class OrderHystrixMain80 {
    public static void main(String[] args) {
        SpringApplication.run( OrderHystrixMain80.class,args);


        LinkedList<Integer> i = new LinkedList<>();
        i.get(0);
        ArrayList  z = new ArrayList();
        z.get(0);

    }
}
