package com.hzt.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.hzt.springcloud.dao"})
public class MyBatisConfig {

}
