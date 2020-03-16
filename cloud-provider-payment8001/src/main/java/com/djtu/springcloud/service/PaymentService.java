package com.djtu.springcloud.service;

import com.djtu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Author TWH
 * @Date 2020/3/14 16:58
 **/

public interface PaymentService {
    public int create(Payment payment);

    public Payment findPaymentById(@Param("id") Integer id);
}
