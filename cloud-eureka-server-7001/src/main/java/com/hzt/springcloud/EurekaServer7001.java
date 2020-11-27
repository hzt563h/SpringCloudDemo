package com.hzt.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author hzt
 * @version 1.0.0
 * @ClassName EurekaServerApplication7001.java
 * @Description TODO EurekaServerApplication7001
 * @createTime 2020年11月25日 19:32:00
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServer7001 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7001.class, args);
    }

}
