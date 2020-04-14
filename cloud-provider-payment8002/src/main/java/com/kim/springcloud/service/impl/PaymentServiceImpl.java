package com.kim.springcloud.service.impl;

import com.kim.springcloud.dao.PaymentDao;
import com.kim.springcloud.entities.Payment;
import com.kim.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @auther kim
 * @create 2020-04-07 17:20
 */
@Service
public class PaymentServiceImpl implements PaymentService
{
    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment)
    {
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id)
    {
        return paymentDao.getPaymentById(id);
    }
}

