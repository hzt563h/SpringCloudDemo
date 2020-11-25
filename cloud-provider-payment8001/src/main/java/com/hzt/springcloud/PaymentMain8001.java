package com.hzt.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


/**
 * @author hzt
 * @version 1.0.0
 * @ClassName PaymentMain8001.java
 * @Description TODO PaymentMain8001
 * @createTime 2020年11月24日 19:32:00
 */
@EnableEurekaClient
@SpringBootApplication
public class PaymentMain8001 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8001.class,args);
    }
}
