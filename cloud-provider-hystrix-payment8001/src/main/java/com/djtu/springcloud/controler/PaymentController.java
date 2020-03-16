package com.djtu.springcloud.controler;

import com.djtu.springcloud.service.PaymentService;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author TWH
 * @Date 2020/3/15 17:32
 **/
@RestController
@Log4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/payment/hystrix/ok/{id}")
    public String paymentInfoOk(@PathVariable("id") Integer id) {

        String result = paymentService.paymentInfoOk(id);
        return result;
    }

    @GetMapping("/payment/hystrix/timeout/{id}")
    public String paymentInfoTimeOut(@PathVariable("id") Integer id) {

        String result = paymentService.paymentInfoTimeOut(id);
        log.info("连接超时：" + result);
        return result;
    }


    @RequestMapping("/payment/lb")
    public String getPaymentLb(){
        return serverPort;
    }
}
