package com.hzt.springcloud.service.impl;

import com.hzt.springcloud.dao.PaymentDao;
import com.hzt.springcloud.Payment;
import com.hzt.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author hzt
 * @version 1.0.0
 * @ClassName PaymentServiceImpl.java
 * @Description TODO PaymentServiceImpl
 * @createTime 2020年11月24日 19:32:00
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
