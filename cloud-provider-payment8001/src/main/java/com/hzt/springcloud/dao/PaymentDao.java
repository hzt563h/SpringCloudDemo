package com.hzt.springcloud.dao;

import com.hzt.springcloud.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author hzt
 * @version 1.0.0
 * @ClassName PaymentDao.java
 * @Description TODO PaymentDao
 * @createTime 2020年11月24日 19:32:00
 */
@Mapper
public interface PaymentDao {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
