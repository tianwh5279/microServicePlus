package com.djtu.sringcloud.controller;

import com.djtu.springcloud.entities.CommonResult;
import com.djtu.springcloud.entities.Payment;
import com.djtu.sringcloud.service.PaymentFeignService;
import feign.Param;
import lombok.extern.log4j.Log4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author TWH
 * @Date 2020/3/15 15:46
 **/
@RestController
@Log4j
public class OrderFeignController {

    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Integer id){

        return paymentFeignService.findPaymentById(id);
    }
}
