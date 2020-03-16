package com.djtu.springcloud.dao;

import com.djtu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentDao {
    public int create(Payment payment);

    public Payment findPaymentById(@Param("id") Integer id);
}
