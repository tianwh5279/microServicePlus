package com.djtu.springcloud.controller;

import com.djtu.springcloud.entities.CommonResult;
import com.djtu.springcloud.entities.Payment;
import lombok.extern.log4j.Log4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Author TWH
 * @Date 2020/3/14 18:00
 **/
@RestController
@Log4j
public class OrderController {
    //public static final String REST_URL_PREFIX = "http://localhost:8001";
    public static final String REST_URL_PREFIX = "http://CLOUD-PAYMENT-SERVICE";

    @Resource
    private RestTemplate restTemplate;

    @RequestMapping(value = "/consumer/payment/get/{id}")
    public CommonResult get(@PathVariable("id") Integer id) {
        return restTemplate.getForObject(REST_URL_PREFIX + "/payment/get/" + id, CommonResult.class);
    }

    @GetMapping(value = "/consumer/payment/create")
    public CommonResult<Payment> create(Payment payment) {
        return restTemplate.postForObject(REST_URL_PREFIX + "/payment/create",payment,CommonResult.class);
    }

}
