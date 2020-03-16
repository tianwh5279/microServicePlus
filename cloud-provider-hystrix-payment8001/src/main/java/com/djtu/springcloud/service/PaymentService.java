package com.djtu.springcloud.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @Author TWH
 * @Date 2020/3/15 17:25
 **/
@Service
public class PaymentService {

    public String paymentInfoOk(Integer id) {

        return "线程池：" + Thread.currentThread().getName() + "paymentInfoOk id:" + id;
    }

    public String paymentInfoTimeOut(Integer id) {

        int timeNumber=3;
        try {

            TimeUnit.SECONDS.sleep(timeNumber);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池：" + Thread.currentThread().getName() + "paymentInfoTimeOut id:" + id;
    }

}
