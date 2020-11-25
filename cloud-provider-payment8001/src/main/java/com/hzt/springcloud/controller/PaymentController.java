package com.hzt.springcloud.controller;


import com.hzt.springcloud.service.PaymentService;
import com.hzt.springcloud.CommonResult;
import com.hzt.springcloud.Payment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author hzt
 * @version 1.0.0
 * @ClassName PaymentController.java
 * @Description TODO Payment
 * @createTime 2020年11月24日 19:32:00
 */
@RestController
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;


    @GetMapping(value="/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);

        if(payment != null){
            return  new CommonResult(200,"查询成功,serverPort: " + serverPort,payment);
        } else {
            return new CommonResult(444,"没有对应记录，查询ID: " + id,null);
        }
    }
}
