package com.djtu.sringcloud.service;

import com.djtu.springcloud.entities.CommonResult;
import com.djtu.springcloud.entities.Payment;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {
    //public int create(Payment payment);

    @GetMapping(value = "/payment/get/{id}")
    CommonResult<Payment> findPaymentById(@PathVariable("id") Integer id);
}
