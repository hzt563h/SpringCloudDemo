package com.hzt.springcloud.service;

import com.hzt.springcloud.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @author huangzetao
 * @version 1.0.0
 * @ClassName AccountService.java
 * @Description TODO
 * @createTime 2020年12月01日 11:20:00
 */
@FeignClient(value = "seata-account-service")
public interface AccountService{
    @PostMapping(value = "/account/decrease")
    CommonResult decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);
}
