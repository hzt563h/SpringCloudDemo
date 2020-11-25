package com.hzt.cloud.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author hzt
 * @version 1.0.0
 * @ClassName EurekaServerApplication7002.java
 * @Description TODO EurekaServerApplication7002
 * @createTime 2020年11月25日 09:32:00
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication7002 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication7002.class, args);
    }

}
