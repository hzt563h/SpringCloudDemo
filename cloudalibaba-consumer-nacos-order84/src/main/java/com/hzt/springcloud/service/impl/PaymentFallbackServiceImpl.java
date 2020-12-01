package com.hzt.springcloud.service.impl;


import com.hzt.springcloud.CommonResult;
import com.hzt.springcloud.Payment;
import com.hzt.springcloud.service.PaymentService;
import org.springframework.stereotype.Component;


@Component
public class PaymentFallbackServiceImpl implements PaymentService
{
    @Override
    public CommonResult<Payment> paymentSQL(Long id)
    {
        return new CommonResult<>(44444,"服务降级返回,---PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}
