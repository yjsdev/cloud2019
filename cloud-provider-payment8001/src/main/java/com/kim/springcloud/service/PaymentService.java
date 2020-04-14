package com.kim.springcloud.service;

import com.kim.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @auther kim
 * @create 2020-04-07 17:19
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
