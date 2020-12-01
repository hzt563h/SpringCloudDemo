package com.hzt.springcloud.controller;

import com.hzt.springcloud.domain.CommonResult;
import com.hzt.springcloud.domain.Order;
import com.hzt.springcloud.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author huangzetao
 * @version 1.0.0
 * @ClassName OrderController.java
 * @Description TODO OrderController
 * @createTime 2020年12月01日 11:21:00
 */
@RestController
public class OrderController{
    @Resource
    private OrderService orderService;


    @GetMapping("/order/create")
    public CommonResult create(Order order)
    {
        orderService.create(order);
        return new CommonResult(200,"订单创建成功");
    }
}
