package com.hzt.springcloud.service;

import com.hzt.springcloud.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author hzt
 * @version 1.0.0
 * @ClassName PaymentService.java
 * @Description TODO PaymentService
 * @createTime 2020年11月24日 19:32:00
 */
public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
