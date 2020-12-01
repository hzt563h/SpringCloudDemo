package com.hzt.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author huangzetao
 * @version 1.0.0
 * @ClassName MyBatisConfig.java
 * @Description TODO
 * @createTime 2020年12月01日 11:21:00
 */
@Configuration
@MapperScan({"com.hzt.springcloud.dao"})
public class MyBatisConfig {

}
